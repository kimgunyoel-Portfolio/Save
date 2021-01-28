package com.example.weather.GPS.APIData.APIThread;

import android.app.Activity;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.weather.GPS.APIData.GetAPIData.GetAPIData;
import com.example.weather.GPS.Activity.GPS;
import com.example.weather.GPS.Activity.GPSActivity;

public class APIThread extends Thread{

    AppCompatActivity aAPIThread;   //!< Activty
    android.os.Handler handler;     //!< 핸들러
    GetAPIData cGetAPIData;         //!< API클래스

    /**
     * 생성자
     * @param activity - Activity
     */
    public APIThread(AppCompatActivity activity) {
        aAPIThread = activity;                      //!< Activity
        handler = new Handler();                    //!< 핸들러 객체생성
        cGetAPIData = new GetAPIData(aAPIThread);   //!< API클래스 객체생성

    }

    @Override
    public void run() {
        super.run();
        while(true) {                       //!< 쓰레드 작동중알때
            handler.post(new Runnable() {   //!< Runnable 객체를 활용하여 RequestQueue에 전달
                @Override
                public void run() {
                    try {
                        System.out.println("쓰레드 진입");   //!< 디버그
                        cGetAPIData.getData();              //!< API정보를 쓰레드로 실행
                    }catch (OutOfMemoryError e) {           //!< 메모리 릭에러발생하면
                        System.out.println("Memory leak");  //!< 디버그
                    }catch (Exception e) {
                        System.out.println("exception : " + e); //!<디버그
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
