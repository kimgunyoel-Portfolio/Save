package com.example.audiomp3.Permission;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Settings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class CheckPermission {

    AppCompatActivity aCheckPermission;

    public static final int MY_PERMISSION_WRITE = 1000;
    public static final int MY_PERMISSION_READ = 1001;


    public CheckPermission(AppCompatActivity appCompatActivity){
        aCheckPermission = appCompatActivity;
        checkPermission();
    }


    public void checkPermission() {

        if(ContextCompat.checkSelfPermission(aCheckPermission, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            if(ActivityCompat.shouldShowRequestPermissionRationale(aCheckPermission, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                new AlertDialog.Builder(aCheckPermission).
                        setTitle("알림").
                        setMessage("앱 사용을 위한 쓰기 권한이 거부되었습니다.\n사용을 원하시면 설정에서 해당 권한을 직접 허용하셔야 합니다.").
                        setNegativeButton("설정", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                                intent.setData(Uri.parse("package:" + aCheckPermission.getPackageName()));
                                aCheckPermission.startActivity(intent);
                            }
                        }).setPositiveButton("종료", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        aCheckPermission.finish();
                    }
                }).setCancelable(false).create().show();

            }else {
                ActivityCompat.requestPermissions(aCheckPermission, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, MY_PERMISSION_WRITE);
            }
        }

        if(ContextCompat.checkSelfPermission(aCheckPermission, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            if(ActivityCompat.shouldShowRequestPermissionRationale(aCheckPermission, Manifest.permission.READ_EXTERNAL_STORAGE)) {
                new AlertDialog.Builder(aCheckPermission).
                        setTitle("알림").
                        setMessage("앱 사용을 위한 읽기 권한이 거부되었습니다.\n사용을 원하시면 설정에서 해당 권한을 직접 허용하셔야 합니다.").
                        setNegativeButton("설정", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                                intent.setData(Uri.parse("package:" + aCheckPermission.getPackageName()));
                                aCheckPermission.startActivity(intent);
                            }
                        }).setPositiveButton("종료", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        aCheckPermission.finish();
                    }
                }).setCancelable(false).create().show();

            }else {
                ActivityCompat.requestPermissions(aCheckPermission, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, MY_PERMISSION_READ);
            }
        }

    }

}
