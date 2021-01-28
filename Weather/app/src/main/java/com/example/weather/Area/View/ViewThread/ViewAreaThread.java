package com.example.weather.Area.View.ViewThread;

import android.app.Activity;
import android.os.Handler;

import com.example.weather.Area.View.SetView.ViewArea;

public class ViewAreaThread extends Thread{

    Activity aViewAreaThread;
    android.os.Handler handler;

    ViewArea cViewArea;

    public ViewAreaThread(Activity activity){
        aViewAreaThread = activity;
        handler = new Handler();
        cViewArea = new ViewArea(aViewAreaThread);
    }

    @Override
    public void run() {
        super.run();
        while(true) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("쓰레드 진입");
                        cViewArea.setViewArea();
                        cViewArea.SetAreaBackground();

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
