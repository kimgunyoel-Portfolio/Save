package com.example.audiorecord.MP3.Thread;

import android.media.MediaPlayer;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

public class ProgressUpdate extends Thread{

    AppCompatActivity aProgressUpdate;              //!< Activity
    public boolean isPlaying = true;                //!< boolean 함수 적용
    MediaPlayer mediaPlayer;                        //!< 미디어 플레이어
    SeekBar seekBar;                                //!< SeekBar

    /**
     * 생성자
     * @param appCompatActivity   - Activity
     * @param mediaPlayer         - 미디어플레이어
     * @param seekBar             - SeekBar
     */
    public ProgressUpdate(AppCompatActivity appCompatActivity, MediaPlayer mediaPlayer, SeekBar seekBar){

        aProgressUpdate = appCompatActivity;    //!< Activity
        this.mediaPlayer = mediaPlayer;         //!< 미디어 플레이어 인자값받기
        this.seekBar = seekBar;                 //!< SeekBar 인자값받기
    }

    /**
     *  SeekBar 쓰레드
     */
    @Override
    public void run() {
        super.run();
        while(isPlaying){                                                       //!< 음악재생중일때
            try {
                Thread.sleep(500);                                       //!< 500밀리초 설정
                if(mediaPlayer!=null){                                         //!< 미디어플레이어가 null값이 아닐떄
                    try{
                        System.out.println("Thread in()...");                  //!< 쓰레드 디버그
                        seekBar.setProgress(mediaPlayer.getCurrentPosition()); //!< SeekBar 작동
                    }
                    catch (Exception e){
                        System.out.println("err" + e);
                    }

                }
            } catch (InterruptedException e) {
                System.out.println("ProgressUpdate:" + e);
            }
        }
    }



}
