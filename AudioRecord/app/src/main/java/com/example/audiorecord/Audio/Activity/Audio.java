package com.example.audiorecord.Audio.Activity;

import androidx.appcompat.app.AppCompatActivity;

import com.example.audiorecord.Audio.Button.RecordButton;
import com.example.audiorecord.Audio.Time.TimeThread;

public class Audio {
    AppCompatActivity aAudio;           //!< Activity
    RecordButton cRecordButton;         //!< 녹음 버튼 클래스
    TimeThread cTimeThread;             //!< 시간 쓰레드 ( 녹음할때 타이머 )


    /**
     * 생성자
     * @param appCompatActivity - Activity
     */
    public Audio(AppCompatActivity appCompatActivity){

        aAudio = appCompatActivity;             //!< Activit
        cTimeThread = new TimeThread(aAudio);   //!< 시간 쓰레드 객체생성
        cRecordButton = new RecordButton(aAudio, cTimeThread);  //!< 녹음버튼 클래스 객체생성

    }

}
