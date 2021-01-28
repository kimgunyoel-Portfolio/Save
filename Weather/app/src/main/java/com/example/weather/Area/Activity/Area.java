package com.example.weather.Area.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.weather.Area.APIData.AreaAPIThread.AreaThread;
import com.example.weather.Area.Define.DefineDialog.AreaDialog;
import com.example.weather.Area.View.ViewThread.ViewAreaThread;
import com.example.weather.GPS.Activity.GPS;
import com.example.weather.GPS.Activity.GPSActivity;

public class Area {

    AreaThread cAreaThread;         //!< 지역 쓰레드
    ViewAreaThread cViewAreaThread; //!< 지역뷰 쓰레드

    /**
     * 생성자
     * @param appCompatActivity
     */
    public Area(AppCompatActivity appCompatActivity) {

        cAreaThread = new AreaThread(appCompatActivity);        //!< 지역 쓰레드 객체생성
        cViewAreaThread = new ViewAreaThread(appCompatActivity);//!< 지역뷰 쓰레드 객체생성

    }

    /**
     * Area 메서드
     */
    public void setArea() {
        cAreaThread.start();    //!< 지역쓰레드 시작
        cViewAreaThread.start();//!< 지역뷰 쓰레드 시작
    }
}
