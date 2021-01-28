package com.example.audiorecord.MP3.Button;

import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.audiorecord.Common.Define;
import com.example.audiorecord.MainList.ListView.AlbumImg;
import com.example.audiorecord.MainList.ListView.MListViewItem;
import com.example.audiorecord.R;

import java.util.ArrayList;

public class AllButton {

    AppCompatActivity aAllButton;               //!< Activity
    Button previous,play,pause,next;            //!< 버튼 이전 , 재생 , 멈춤 , 다음
    MediaPlayer mediaPlayer;                    //!< 미디어플레이이어
    SeekBar seekBar;                            //!< SeekBar
    TextView title;                             //!< 타이틀제목 텍스트뷰
    AlbumImg cAlbumImg;                         //!< 앨범 클래스
    int Positionbox;                            //!< 리스트뷰 포지션 받을 함수
    ArrayList<MListViewItem> list;

    /**
     *
     * @param appCompatActivity  - Activity
     * @param mediaPlayer = 미디어 플레이어 상위객체
     * @param position    - 리스트뷰 포지션
     * @param listitem    - 음악정보를 담고있는 리스트
     */
    public AllButton(AppCompatActivity appCompatActivity, MediaPlayer mediaPlayer, int position, ArrayList<MListViewItem> listitem){

        aAllButton = appCompatActivity;     //!< Activity
        this.mediaPlayer = mediaPlayer;     //!< 상위객체 미디어플레이어
        Positionbox = position;             //!< 리스트뷰 포지션
        list = listitem;                    //!< 리스트뷰 아이템

        /** id 연결 */
        seekBar = (SeekBar)aAllButton.findViewById(R.id.sbMusicplay);    //!< SeekBar 연결
        title = (TextView)aAllButton.findViewById(R.id.tvMusicName);     //!< 제목 TextView 연결
        previous = (Button)aAllButton.findViewById(R.id.pre);            //!< 이전버튼 연결
        play = (Button)aAllButton.findViewById(R.id.play);               //!< 시작버튼 연결
        pause = (Button)aAllButton.findViewById(R.id.pause);             //!< 중지버튼 연결
        next = (Button)aAllButton.findViewById(R.id.next);               //!< 다음버튼 연결

        setAllButton();
    }

    /**
     * 버튼 4가지 처리
     */
    public void setAllButton(){

        play.setOnClickListener(new View.OnClickListener() {            //!< 시작버튼 클릭 리스너
            @Override
            public void onClick(View view) {

                pause.setVisibility(View.VISIBLE);                      //!< 시작버튼 눌리면 중지버튼 보이게 설정
                play.setVisibility(View.GONE);                          //!< 시작버튼 눌리면 시작버튼 안보이게 설정
                mediaPlayer.seekTo(mediaPlayer.getCurrentPosition());   //!< 미디어플레이어 현재위치로 이동
                mediaPlayer.start();                                    //!< 미디어플레이어 시작
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {           //!< 중지버튼 클릭 리스너
            @Override
            public void onClick(View view) {

                pause.setVisibility(View.GONE);                         //!< 중지버튼이 눌리면 중지버튼 안보이게 설정
                play.setVisibility(View.VISIBLE);                       //!< 중지버튼이 눌리면 시작버튼 보이게 설정
                mediaPlayer.pause();                                    //!< 미디어 플레이어 중지
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {        //!< 이전버튼 클릭 리스너
            @Override
            public void onClick(View view) {
                if(Positionbox-1>=0){                                   //!< 리스트뷰 포지션값 -1 0보다 크거나 같을떄
                    Positionbox--;                                      //!< 리스트뷰 포지션값 -1
                    System.out.println("list.get(Positionbox) : " + list.get(Positionbox));
                    playMusic(list.get(Positionbox));                   //1< 음악파일목록 재생
                    seekBar.setProgress(0);                             //!< SeekBar 초기상태
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {            //!< 다음버튼 클릭 리스너
            @Override
            public void onClick(View view) {
                if(Positionbox+1 < list.size()){                        //!< 리스트뷰 목록이 포지션값+1 보다 클때
                    Positionbox++;                                      //!< 리스트뷰 포지션값 +1
                    playMusic(list.get(Positionbox));                   //!< 음악파일 목록 포지션값 맞게 재생
                    seekBar.setProgress(0);                             //!< SeekBar 초기상태
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
            seekBar.setProgress(0);         //!< SeekBar 초기상태
            title.setText(mListViewItem.getArtist() + " - " + mListViewItem.getTitle()); //!< 리스트뷰 아이템 가수 , 제목 제목텍스트에 출력
            //System.out.println("mListViewItem.getId() : " + mListViewItem.getId());
            Uri musicURI = Uri.withAppendedPath(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, "" + mListViewItem.getId());

            /**
             * 미디어플레이어
             * - 초기화 자동시작
             */
            mediaPlayer.reset();                                //!< 초기화
            mediaPlayer.setDataSource(aAllButton, musicURI);    //!< 파일위치
            mediaPlayer.prepare();                              //!< 재생준비
            mediaPlayer.start();                                //!< 재생시작
            seekBar.setMax(mediaPlayer.getDuration());          //!< 오디오파일 전체길이
            //!< 다음곡 재생 버튼 리셋
            if(mediaPlayer.isPlaying()){                        //!< 미디어플레이 재생중일때
                play.setVisibility(View.GONE);                  //!< 시작버튼 안보이게 설정
                pause.setVisibility(View.VISIBLE);              //!< 중지버튼 보이게 설정
            }else {
                play.setVisibility(View.VISIBLE);               //!< else문 시작버튼 보이게 설정
                pause.setVisibility(View.GONE);                 //!< else문 중지버튼 안보이게 설정
            }
            //!< 앨범이미지 클래스에 저장된 이미지값들을 Define 클래스에 저장
            Define.ins().album = cAlbumImg.getAlbumImage(aAllButton, Integer.parseInt((list.get(Positionbox)).getAlbumid()), 170);
        }catch (Exception e){
            System.out.println("SimplePlayer"+ e.getMessage());
        }



    }
}
