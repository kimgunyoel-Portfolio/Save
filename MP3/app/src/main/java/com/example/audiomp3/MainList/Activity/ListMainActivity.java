package com.example.audiomp3.MainList.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.audiomp3.Permission.CheckPermission;
import com.example.audiomp3.R;

/**
 * 리스트뷰 사용하기위한 Activity
 */
public class ListMainActivity extends AppCompatActivity {

    CheckPermission cCheckPermission;        //!< 퍼미션
    ListMain cListMain;                      //!< 엑티비티 하위 클래스

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 클래스 선언
         */
        cCheckPermission = new CheckPermission(this);   //!< 퍼미션
        cListMain = new ListMain(this);                 //!< 엑티비티 하위 클래스

    }


}
