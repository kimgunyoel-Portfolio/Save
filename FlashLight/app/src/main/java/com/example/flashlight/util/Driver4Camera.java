package com.example.flashlight.util;


import android.hardware.Camera;
import android.util.Log;

public class Driver4Camera {


    private Camera camera;          //!< 카메라 선언


    /**
     * 생성자
     */
    public Driver4Camera() {
        camera = getCameraInstance(getCameraId());
    }

    public int getCameraId() {
        System.out.println("getCameraId()");            //!< 디버그

        int cameraId = -1;                              //!< 카메라id -1;

        int numberOfCameras = Camera.getNumberOfCameras();      //!< 카메라 번호를 가져올 객체생성
        for (int i = 0; i < numberOfCameras; i++) {             //!< 카메라 번호가 0보다 크면
            Camera.CameraInfo info = new Camera.CameraInfo();   //!< 카메라 정보 생성자 객체생성
            Camera.getCameraInfo(i, info);                      //!< 카메라 정보를 가져옴
            if (info.facing == Camera.CameraInfo.CAMERA_FACING_BACK || numberOfCameras == 1) {  //!< 카메라가 후면카메라 , 카메라번호가 1번이면

                System.out.println("CameraInfo.CAMERA_FACING_BACK = "+ (info.facing == Camera.CameraInfo.CAMERA_FACING_BACK));  //!< 디버그

                cameraId = i;       //!, 카메라id 는 i값
                break;
            }
        }
        return cameraId;           //!< 리턴 카메라id
    }

    public static Camera getCameraInstance(int cameraId) {
        System.out.println("Driver4Camera getCameraInstance(" + cameraId + ")");

        Camera c = null;        //!< 카메라 c 값 null
        try {
            c = Camera.open(cameraId); // 카메라 인스턴스를 얻음
            Camera.Parameters cp = c.getParameters();   //!< 카메라 매개변수 c변수에
            System.out.println("Driver4Camera getCameraInstance(" + cameraId + ")" );
            System.out.println(" Camera.Parameters =" + cp.flatten());
        } catch (Exception e) {

            System.out.println("Camera.open" + cameraId);
            System.out.println("exception=" + e);
        }

        System.out.println("getCameraInstance:" + cameraId);
        System.out.println("return c:" + c);
        return c; //카메라를 사용할 수없는 경우 null을 반환
    }

    public Camera getCamera() {
        return camera;      //!< 리턴 카메라
    }

    private void releaseCamera() {
        if (camera != null) {       //!< 카메라가 null값이 아니면
            camera.release();       //!< 카메라 해체
            camera = null;          //!< 카메라 null값
        }
    }

    public void onPause() {
        releaseCamera();
    }

    public void onResume() {
        if (camera == null) {
            camera = getCameraInstance();
        }

    }

    /**
     * Camera 객체의 인스턴스를 얻는 안전한 방법
     */
    private static Camera getCameraInstance() {
        Camera c = null;
        try {
            c = Camera.open(); // 카메라 인스턴스 얻음
        } catch (Exception e) {

        }
        return c; //!< 리턴 c
    }

}
