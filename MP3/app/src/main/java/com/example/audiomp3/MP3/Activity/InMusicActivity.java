package com.example.audiomp3.MP3.Activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.audiomp3.MainList.ListView.MListViewItem;
import com.example.audiomp3.R;

import java.util.ArrayList;

public class InMusicActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;        //!< 미디어플레이어  상위 객체생성 (인자값)
    InMusic cInMusic;               //!< 엑티비티 하위 클래스
    int iPosition = 0;              //!< 리스트뷰 포지션 받을 상위객체 (인자값)
    ArrayList<MListViewItem> list;  //!< 리스트뷰 아이템 상위객체 (인자값)

    public boolean isPlaying = true;  //!< onDestroy 쓰기위한 boolean함수 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_music);

        Intent intent = getIntent();                                                         //!< 인텐트 putExtra값 받아오기
        System.out.println("인텐트 값 :" + getIntent());                                      //!< 디버그
        iPosition = intent.getIntExtra("position", 0);                    //!< 리스트뷰 포지션 putExtra값 받아오기
        System.out.println("포지션값 :"+ iPosition);
        list = (ArrayList<MListViewItem>)intent.getSerializableExtra("playlist");     //!< 리스트뷰 아이템 받아오기
        mediaPlayer = new MediaPlayer();                                                     //!< 미디어 플레이어 객체선언
        cInMusic = new InMusic(this,mediaPlayer, iPosition, list);          //!< Activity 하위클래스 객체선언

    }

    /**
     *  엑티비티 종료시 탈출../
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        isPlaying = false;          //!< 음악재생중 일때 boolean 함수 거짓으로
        mediaPlayer.release();      //!< 미디어 플레이어 해체
        mediaPlayer = null;         //!< 미디어 플레이어 null 값

    }
}
