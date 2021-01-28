package com.example.weather.GPS.Activity;

import android.support.v7.app.AppCompatActivity;

import com.example.weather.GPS.APIData.APIThread.APIThread;
import com.example.weather.GPS.View.ViewThread.UIThread;
import com.example.weather.GPS.WeekData.WeekThread.WeekThread;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GPS {

    AppCompatActivity aGPS;     //!< Activity
    APIThread cAPIThread;       //!< API 쓰레드
    UIThread cUIThread;         //!< UI 쓰레드
    WeekThread cWeekThread;     //!< 주간날씨 쓰레드

    /**
     * 생성자
     * @param appCompatActivity - Activity
     */
    public GPS(AppCompatActivity appCompatActivity) {
        aGPS = appCompatActivity;               //!< Actvity
        cAPIThread = new APIThread(aGPS);       //!< API쓰레드 객체생성
        cUIThread = new UIThread(aGPS);         //!< UI쓰레드 객체생성
        cWeekThread = new WeekThread(aGPS);     //!< 주간날씨 쓰레드 객체생성
    }

    /**
     * GPS메서드
     */
    public void setGPS() {
        cAPIThread.start();     //!< API쓰레드 시작
        cUIThread.start();      //!< UI쓰레드 시작
        cWeekThread.start();    //!< 주간날씨 쓰레드 시작
    }
}
