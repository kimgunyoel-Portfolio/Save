package com.example.weather.GPS.Day;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.weather.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GPSDay {

    TextView textViewday;       //!< 텍스트뷰
    AppCompatActivity aGPSDay;  //!< Activity

    /**
     * 생성자
     * @param appCompatActivity - Activity
     */
    public GPSDay(AppCompatActivity appCompatActivity) {

        aGPSDay = appCompatActivity;                                    //!< Activity
        textViewday = (TextView)aGPSDay.findViewById(R.id.tvgpsday);    //!< 날짜 텍스트뷰 id값 연결
        textViewday.setText(getDay());                                  //!< 날짜 메서드 setText
    }

    /**
     * 날짜 가져오는 메서드
     * @return
     */
    public String getDay() {
        Calendar cal = Calendar.getInstance();  //!< 캘린더 객체생성
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");   //!< 날짜 객체생성 (년,월,일)
        String date = format.format(Calendar.getInstance().getTime());          //!< date 변수에 getInstance
        System.out.println("Rexwdc:" + date);

        return date;

    }


}
