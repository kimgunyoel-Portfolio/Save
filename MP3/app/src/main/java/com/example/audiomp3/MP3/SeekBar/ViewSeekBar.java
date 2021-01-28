package com.example.audiomp3.MP3.SeekBar;

import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.audiomp3.Common.Define;
import com.example.audiomp3.MP3.Thread.ProgressUpdate;
import com.example.audiomp3.MainList.ListView.AlbumImg;
import com.example.audiomp3.MainList.ListView.MListViewItem;
import com.example.audiomp3.R;

import java.util.ArrayList;

public class ViewSeekBar {
    AppCompatActivity aSeekBar;

   private ArrayList<MListViewItem> list;

    MediaPlayer mediaPlayer;    //!< 미디어플레이어 객체를 받아 와 저장할 변수
    SeekBar seekBar;            //!< 시크바 객체를 받아 와 저장 할 변수
    Button play, pause;         //!< 재생, 멈춤 버튼
    int positionbox;            //!< 리스트뷰 포지션 받을 함수
    TextView title;             //!< 제목 텍스트뷰
    ImageView album;            //!< 앨범 이미지뷰

    AlbumImg cAlbumImg;                 //!< 앨범 클래스 선언
    ProgressUpdate cProgressUpdate;     //!< 시크바 Thread 클래스 선언

    /**
     * ViewSeekBar 생성자
     * @param appCompatActivity - Activity
     * @param mediaPlayer - 미디어플레이어 상위객체
     * @param position - 리스트뷰 포지션
     * @param listitem - 음악정보를 담고있는 리스트
     */
    public ViewSeekBar(AppCompatActivity appCompatActivity, MediaPlayer mediaPlayer, int position, ArrayList<MListViewItem> listitem){

        /** Init */
        this.mediaPlayer = mediaPlayer;         //!< 미디어플레이어
        aSeekBar = appCompatActivity;           //!< Activity
        positionbox = position;                 //!< 리스트뷰 포지션
        list = listitem;                        //!< 음악 리스트

        /**
         * id 연결
         */
        title = (TextView)aSeekBar.findViewById(R.id.tvMusicName);          //!< 제목 텍스트
        play = (Button)aSeekBar.findViewById(R.id.play);                    //!< 시작 버튼
        pause = (Button)aSeekBar.findViewById(R.id.pause);                  //!< 중지 버튼
        seekBar = (SeekBar)aSeekBar.findViewById(R.id.sbMusicplay);         //!< SeekBar
        this.album = (ImageView)aSeekBar.findViewById(R.id.ivMusicalbum);   //!< 앨범이미지뷰

        /**
         * 클래스 객체생성
         */
        cAlbumImg = new AlbumImg();                                             //!< 앨범 클래스 객체생성
        cProgressUpdate = new ProgressUpdate(aSeekBar, mediaPlayer, seekBar , position);   //!< SeekBar Thread 객체생성
        cProgressUpdate.start();                                                 //!< 쓰레드 시작

        playMusic(list.get(positionbox));                                       //!< 플레이 뮤직 메서드
        setSeekBar();

    }

    /**
     * setSeekBar()
     * SeekBar 행동처리 메서드
     */
    public void setSeekBar(){

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override       //!< SeekBar 드래그 할때
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override       //!< SeekBar 탭하는순간 처리
            public void onStartTrackingTouch(SeekBar seekBar) {
                mediaPlayer.pause(); //!< SeekBar 탭하는순간 미디어 플레이어 중지
            }

            @Override       //!< SeekBar 드래그 멈추는 순간 처리
            public void onStopTrackingTouch(SeekBar seekBar) {
                mediaPlayer.seekTo(seekBar.getProgress());
                //!< SeekBar가 초기상태 그리고 시작버튼이 보일때 미디어 플레이어 시작.
                if(seekBar.getProgress()>0 && play.getVisibility() == View.GONE){
                    mediaPlayer.start();
                }

            }
        });
        //!< 미디어플레이어 재생이 끝났을때 다음곡 재생
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                 if(positionbox+1 < list.size()){                //!< 리스트뷰 아이템 포지션 자리값이 포지션인자값+1 값보다 클때
                     positionbox++;                              //!< 포지션 인자값 증가시켜 다음곡 재생.
                     playMusic(list.get(positionbox));
                 }
            }
        });
    }

    /**
     * 미디어 플레이 재생이 끝난뒤 다음곡 상황처리
     * @param mListViewItem
     */
    public void playMusic(MListViewItem mListViewItem){

        try {
            seekBar.setProgress(0);         //!< 프로그레스 바 초기상태
            //!< 다음곡 제목과 가수 출력.
            title.setText(mListViewItem.getArtist() + " - " + mListViewItem.getTitle());
            //!< ㅈ
            Uri musicURI = Uri.withAppendedPath(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, "" + mListViewItem.getId());

            /**
             * 미디어플레이어
             * - 초기화 자동시작
             */
            mediaPlayer.reset();                                //!< 초기화
            mediaPlayer.setDataSource(aSeekBar, musicURI);      //!< 파일위치
            mediaPlayer.prepare();                              //!< 재생준비
            mediaPlayer.start();                                //!< 재생시작
            seekBar.setMax(mediaPlayer.getDuration());          //!< 오디오파일 전체길이
            //!< 다음곡 재생 버튼 리셋
            if(mediaPlayer.isPlaying()){
                play.setVisibility(View.GONE);      //!< 재생이시작되면 시작버튼 안보이게 설정
                pause.setVisibility(View.VISIBLE);  //!< 재생이시작되면 중지버튼 보이게 설정
            }else {
                play.setVisibility(View.VISIBLE);   //!< 플레이중이지 않을때 시작버튼 보이게 설정
                pause.setVisibility(View.GONE);     //!< 플레이중이지 않을때 중지버튼 안보이게 설정
            }
            //!< 앨범이미지 클래스에 저장된 이미지값들을 Define 클래스에 저장
            Define.ins().album = cAlbumImg.getAlbumImage(aSeekBar, Integer.parseInt((list.get(positionbox)).getAlbumid()), 170);
            //!< 제목 TextView 에 Define값 저장한후 출력.
            album.setImageBitmap(Define.ins().album);
        }catch (Exception e){
            System.out.println("SimplePlayer"+ e.getMessage());
        }



    }
}
