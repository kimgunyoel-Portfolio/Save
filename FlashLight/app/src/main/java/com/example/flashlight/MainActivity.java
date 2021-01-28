package com.example.flashlight;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.flashlight.permission.Permission;
import com.example.flashlight.util.UtilFlash;

public class MainActivity extends AppCompatActivity {

    private Button bt_switch;       //!< 버튼선언
    private ImageView iv_switch;    //!< 이미지뷰 선언
    private FrameLayout fra_background; //!< 프레인레이아웃선언
    Permission cPermission;         //!< 퍼미션
    boolean bSwitch = false;        //!< bool함수 false 값

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cPermission = new Permission(this);                 //!< 퍼미션 객체생성
        bt_switch = (Button) findViewById(R.id.bt_switch);          //!< 버튼 id값 연결
        iv_switch = (ImageView) findViewById(R.id.idIV_Switch);     //!< 이미지뷰 id값 연결
        fra_background = (FrameLayout) findViewById(R.id.idFra_background); //!< 프레임레이아웃 id값 연결
        bt_switch.setOnClickListener(new View.OnClickListener() {   //!< 버튼 클릭 리스너
            @Override
            public void onClick(View v) {
                if(bSwitch) {
                    //!< bool함수 false값이면
                    iv_switch.setImageResource(R.drawable.off);     //!< 이미지뷰 꺼짐상태
                    fra_background.setBackgroundColor(Color.parseColor("#C5C5C5")); //!< 백그라운트 꺼짐상태
                    UtilFlash.flash_off();                          //!< 플래쉬 OFF
                    bSwitch = false;                                //!< false
                }
                else {
                    iv_switch.setImageResource(R.drawable.on);      //!< 이미지뷰 켜짐상태
                    fra_background.setBackgroundColor(Color.parseColor("#575757")); //!< 백그라운드 켜짐상태
                    UtilFlash.flash_on();                           //!< 플래쉬On
                    bSwitch = true;                                 //!< bool함수 true변경
                }
            }
        });
    }
}
