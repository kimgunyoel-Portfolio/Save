package com.example.weather.Area.AreaDay;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.weather.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AreaDay {

    AppCompatActivity aAreaDay; //!< Activity
    TextView textViewareaday;   //!< 텍스트뷰

    /**
     * 생성자
     * @param appCompatActivity
     */
    public AreaDay(AppCompatActivity appCompatActivity){
        aAreaDay = appCompatActivity;       //!< Activity
        textViewareaday = (TextView)aAreaDay.findViewById(R.id.tvareaday);  //!< 지역현재날짜 텍스트뷰 id값 연결
        textViewareaday.setText(getAreaDay());  //!< 출력

    }

    /**
     * 날짜 가져오는 메서드
     * @return
     */
    public String getAreaDay(){
        Calendar cal = Calendar.getInstance();  //!< 캘린더 객체생성
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");   //!< SimpleDateFormat객체생성
        String date = format.format(Calendar.getInstance().getTime());          //!< date 변수에 getInstance
        System.out.println("Rexwdc:" + format.format(Calendar.getInstance().getTime()));    //!< 디버그

        return date;
    }
}
