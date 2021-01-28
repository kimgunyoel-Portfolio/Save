package com.example.flashlight.permission;

import android.Manifest;
import android.app.Activity;
import android.os.Handler;
import android.os.Message;

import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.ArrayList;

public class Permission {
    Activity aPermssion;

    private static final int MESSAGE_PERMISSION_GRANTED = 101;
    private static final int MESSAGE_PERMISSION_DENIED = 102;

    public MainHandler mainHandler = new MainHandler();

    public Permission(Activity activity) {
        aPermssion = activity;
        showPermissionDialog();
    }

    private void showPermissionDialog() {
        PermissionListener permissionListener = new PermissionListener() {
            @Override
            public void onPermissionGranted() {
                mainHandler.sendEmptyMessage(MESSAGE_PERMISSION_GRANTED);
            }

            @Override
            public void onPermissionDenied(ArrayList<String> deniedPermissions) {
                mainHandler.sendEmptyMessage(MESSAGE_PERMISSION_DENIED);
            }
        };

        new TedPermission(aPermssion)
                .setPermissionListener(permissionListener)
                .setRationaleMessage("무엇무엇을 이용하기 위해서는 접근 권한이 필요합니다")
                .setRationaleConfirmText("확인")
                .setDeniedMessage("이 작업은 [설정] > [애플리케이션] > [권한] 에서 다시 설정하실 수 있습니다")
                .setDeniedCloseButtonText("닫기")
                .setGotoSettingButton(true)
                .setGotoSettingButtonText("설정")
                .setPermissions(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA)
                //추가 가능
                .check();
    }
//핸들러 복붙 ㄱㄴ

    private class MainHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MESSAGE_PERMISSION_GRANTED:

                    break;

                case MESSAGE_PERMISSION_DENIED:

                    break;

                default:
                    super.handleMessage(msg);
                    break;
            }
        }
    }
}
