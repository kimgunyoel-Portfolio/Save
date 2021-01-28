package com.example.audiorecord.Audio.Time;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.audiorecord.Audio.Common.Define;
import com.example.audiorecord.R;

public class TimeThread extends Thread{

    AppCompatActivity aTimeThread;  //!< Activity
    TextView textView;              //!< 시간 띄워줄 텍스트뷰

    /**
     * 생성자
     * @param appCompatActivity -Activity
     */
    public TimeThread(AppCompatActivity appCompatActivity){

        aTimeThread = appCompatActivity; //!< Activity

        textView = (TextView)aTimeThread.findViewById(R.id.audio_tv1);      //< 텍스트뷰 id값 연결

    }

    public android.os.Handler handler = new Handler(){      //!< 핸들러 객체생성

        @Override
        public void handleMessage(@NonNull Message msg) {
            textView.setText(getTime());            //!< 텍스트뷰에 경과한 시간 담기

            handler.sendEmptyMessage(0);      //!< 핸들러로 값 전송
        }
    };

    public void startTimer() {                  //!< 시작 타이머 메서드
        handler.sendEmptyMessage(0);      //!< 핸들러로 값 전송
    }

    public void pauseTimer() {                  //!< 중지 타이머 메서드
        handler.removeMessages(0);        //!< 핸들러로 값전송
    }


    private String getTime(){
        long nowTime = SystemClock.elapsedRealtime();       //경과된 시간 체크
        long overTime = nowTime - Define.ins().lBaseTime;   //시스템이 부팅된 이후의 시간

        long m = overTime/1000/60;              //!< 분
        long s = (overTime/1000)%60;            //!< 초
        long ms = overTime % 1000;              //!< 밀리초

        String recTime = String.format("%02d:%02d:%03d",m,s,ms);        //!< 시간띄워줄 형태

        return recTime;     //!< 리턴
    }
}
