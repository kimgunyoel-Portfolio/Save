package com.example.weather.GPS.WeekData.WeekThread;

import android.app.Activity;
import android.os.Handler;

import com.example.weather.GPS.WeekData.GetWeekData.GetWeekData;

public class WeekThread extends Thread{

    Activity weekThread;        //!< Activity
    android.os.Handler handler; //!< 핸들러
    GetWeekData cgetWeekData;   //!< 주간API

    /**
     * 생성자
     * @param activity
     */
    public WeekThread(Activity activity){
        weekThread = activity;      //!< Activity
        handler = new Handler();    //!< 핸들러 객체생성
        cgetWeekData = new GetWeekData(weekThread); //!< 주간5일 클래스 객체생성
    }

    @Override
    public void run() {
        super.run();
        while(true) {                       //!< 쓰레드 작동중일때
            handler.post(new Runnable() {   //!< Runnable 객체를 활용하여 RequestQueue에 전달
                @Override
                public void run() {
                    try {
                        System.out.println("쓰레드 진입");   //!<디버그
                        cgetWeekData.getweekData();         //!< 주간5일 API메서드 시작


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
