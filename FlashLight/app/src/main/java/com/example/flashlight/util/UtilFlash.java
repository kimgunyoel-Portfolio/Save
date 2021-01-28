package com.example.flashlight.util;

import android.hardware.Camera;
import android.util.Log;

public class UtilFlash {

    private static Driver4Camera driver4Camera = null;

    public static void flash_on() {
        try {
            System.out.println("UtilFlash" + "flash_on!!");

                camera_release();                                   //!< 이전 카메라가 혹시나 남아있다면 카메라해체
                driver4Camera = new Driver4Camera();                //!< Camera를 객체생성
                Camera camera = driver4Camera.getCamera();          //!< Camera를 받아오기
                Camera.Parameters p = camera.getParameters();       //!< Camera파라미터 객체생성
                p.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH); //!< 플래시가 계속 켜있는상태로 유지
                camera.setParameters(p);                            //!< 카메라에 모드를 설정한 파라미터 객체를 Set
                camera.startPreview();                              //!< 카메라를 실행시키는 건아니지만 실행시키는것처럼 해줘야 정상작동

        } catch (Exception e) {
            System.out.println("UtilFlash : " + e);

        }
    }

    public static void flash_off() {
        try {
                if (null != driver4Camera.getCamera()) {            //!< 카메라가 null값이 아니면
                    camera_release();                               //!< 카메라 해체
                }
        } catch (Exception e) {
            System.out.println("UtilFlash : " + e);
        }
    }

    public static void camera_release() {
        if (driver4Camera == null)                                 //!< 카메라가 null값이면
            return;                                                //!< 리턴
        if (null != driver4Camera.getCamera()) {                   //!< 카메라가 null값이 아니면
            driver4Camera.getCamera().release();                   //!< 플래쉬를 끄면 더이상 카메라는 켜져있으면 안됨 카메라 해체
            driver4Camera = null;                                  //!< 카메라 null값
        }
    }

}
