package com.example.audiorecord.MainList.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.audiorecord.R;

/**
 * 리스트뷰 사용하기위한 Activity
 */
public class ListMainActivity extends AppCompatActivity {

    //CheckPermission cCheckPermission;        //!< 퍼미션
    ListMain cListMain;                      //!< 엑티비티 하위 클래스

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_save_data);

        /**
         * 클래스 선언
         */
        //cCheckPermission = new CheckPermission(this);   //!< 퍼미션
        cListMain = new ListMain(this);                 //!< 엑티비티 하위 클래스

    }


}
