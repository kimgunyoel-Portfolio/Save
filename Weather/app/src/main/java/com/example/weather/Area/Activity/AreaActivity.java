package com.example.weather.Area.Activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.weather.Area.AreaDay.AreaDay;
import com.example.weather.Area.Define.DefineArea.DefineCity;
import com.example.weather.Area.Define.DefineDialog.AreaDialog;
import com.example.weather.Area.FileIOStream.FileIOStreamCheckDir;
import com.example.weather.Area.FileIOStream.FileIOStreamCheckFile;
import com.example.weather.Area.FileIOStream.FileIOStreamRead;
import com.example.weather.Area.FileIOStream.FileIOStreamWrite;
import com.example.weather.GPS.Activity.GPS;
import com.example.weather.GPS.Activity.GPSActivity;
import com.example.weather.R;

public class AreaActivity extends AppCompatActivity {

    Area cArea;             //!< Activity 하위 클래스
    AreaDay cAreaDay;       //!< 지역 날짜 클래스
    AreaDialog areaDialog;  //!< 지역선택 다이얼로그
    GPS cGPS;               //!< GPS Activity하위클래스

    FileIOStreamRead cFileIOStreamRead; //!< 파일입출력 파일읽기


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        //!< 파일입출력 #4 파일에서 문자 읽기
        cFileIOStreamRead = new FileIOStreamRead(this);
        DefineCity.ins().sSelectArea = cFileIOStreamRead.readData("area");


        cGPS = new GPS(this);   //!< GPS Activity 하위클래스 객체생성
        cGPS.setGPS();                           //!< GPS 메서드 (쓰레드)

        cArea = new Area(this); //!< 지역 Activity 하위클래스 객체생성
        cArea.setArea();                         //!< 지역Actity하위클래스 메서드

        cAreaDay = new AreaDay(this);   //!< 지역날짜 클래스 객체생성
        cAreaDay.getAreaDay();                           //!< 지역날짜 메서드

        areaDialog = new AreaDialog(this);  //!< 지역선택 다이얼로그 객체생성

        setActivityChange();    //!< 지역 화면에서 -> 메인 화면으로 전환 버튼기능 메서드
        AreaButtonChange();     //!< 지역 화면에서 지역선택 버튼 누름 메서드

    }

    /**
     * 지역 화면에서 -> 메인 화면으로 전환 버튼기능
     */
    public void setActivityChange() {
        Button button = (Button) findViewById(R.id.Areaexitbt1);    //!< GPS화면 돌아가기 버튼 id값 연결
        button.setOnClickListener(new View.OnClickListener() {      //!< 버튼 클릭 리스너
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AreaActivity.this, GPSActivity.class); //!< 인텐트 AreaActivity -> GPSActivity
                startActivity(intent);  //!< start
                finish();               //!< finish
            }
        });
    }

    /**
     * 지역 화면에서 지역선택 버튼 누름
     */
    public void AreaButtonChange() {
        Button button = (Button)findViewById(R.id.Areabt1);     //!< 지역선택버튼 id값 연결
        button.setOnClickListener(new View.OnClickListener() {  //!< 버튼 클릭 리스너
            @Override
            public void onClick(View v) {
                areaDialog.setCancelable(true); //!< 뒤로가기버튼 누르면 꺼짐
                areaDialog.show();              //!< 다이얼로그 출력
            }
        });

    }
}
