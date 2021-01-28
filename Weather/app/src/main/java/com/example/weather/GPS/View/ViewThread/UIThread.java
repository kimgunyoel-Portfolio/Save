package com.example.weather.GPS.View.ViewThread;

import android.app.Activity;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.weather.GPS.Activity.GPS;
import com.example.weather.GPS.Activity.GPSActivity;
import com.example.weather.GPS.View.SetView.ViewMain;

public class UIThread extends Thread{

    AppCompatActivity aUIThread;    //!< Activity
    android.os.Handler handler;     //!< 핸들러

    ViewMain cViewMain; //!< ViewMain 클래스

    /**
     * 생성자
     * @param activity
     */
    public UIThread(AppCompatActivity activity) {
        aUIThread = activity;       //!< Activity
        handler = new Handler();    //!< 핸들러 객체생성
        cViewMain = new ViewMain(aUIThread);    //!< ViewMain 객체생성
    }

    @Override
    public void run() {
        super.run();
        while(true) {                       //!< 쓰레드 작동줄일때
            handler.post(new Runnable() {   //!< Runnable 객체를 활용하여 RequestQueue에 전달
                @Override
                public void run() {
                    try {
                        System.out.println("쓰레드 진입");   //!< 디버그
                        cViewMain.setViewMain();           //!< ViewMain행동처리메서드 시작
                        cViewMain.SetBackground();         //!< 배경화면 온도에따라 바뀌는 메서드 시작

                    }catch (OutOfMemoryError e) {
                        System.out.println("Memory leak");
                    }catch (Exception e) {

                    }
                }
            });

            try {

                /**
                 * Thread 시간 예외처리
                 * 값이 들어오지 않을경우 1초마다 호출
                 * 값을 전부 받아오면 10분단위로 타이머 변경
                 */

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
