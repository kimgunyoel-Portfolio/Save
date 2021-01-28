package com.example.weather.Area.View.SetView;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.weather.Area.Define.DefineArea.DefineCity;
import com.example.weather.GPS.Define.DefineAPI.DefineAPI;
import com.example.weather.R;


import java.text.DecimalFormat;

public class ViewArea {

    //지역 표시값
    TextView atvTemp;
    TextView atvName;
    TextView atvFeels_like;
    TextView atvPressure;
    TextView atvHumidity;
    TextView atvSpeed;
    ImageView aivicon;

    Activity aViewArea;
    DecimalFormat adecimalFormat;

    LinearLayout alinearLayout;

    //생성자
    public ViewArea(Activity activity) {
        aViewArea = activity;
        adecimalFormat = new DecimalFormat("#.#");
    }

    public void setViewArea(){
        System.out.println("setViewArea() 진입");
        //도시이름
        atvName = (TextView)aViewArea.findViewById(R.id.areatvName);
        atvName.setText(DefineCity.ins().sSelectArea);
        //atvName.setText((DefineAPI.ins().aName.toString()));
        System.out.println("도시이름 :" + (DefineAPI.ins().aName.toString()));

        //온도
        atvTemp = (TextView)aViewArea.findViewById(R.id.areatvTemp);
        Double.toString((( Double.parseDouble(DefineAPI.ins().aTemp) - 32 ) / 1.8));
        System.out.println("온도 :" +  Double.toString(( Double.parseDouble(DefineAPI.ins().aTemp) - 273.15)));
        System.out.println("온도 포멧적용 : " + adecimalFormat.format(Double.parseDouble(DefineAPI.ins().aTemp) - 273.15) + " °C");

        atvTemp.setText(adecimalFormat.format(Double.parseDouble(DefineAPI.ins().aTemp) - 273.15) + " °C");

        //체감온도
        atvFeels_like = (TextView)aViewArea.findViewById(R.id.areatvFells_like);
        atvFeels_like.setText(adecimalFormat.format( Double.parseDouble(DefineAPI.ins().aFells_like) - 273.15) + " °C");

        //대기압
        atvPressure = (TextView)aViewArea.findViewById(R.id.areatvPressure);
        atvPressure.setText(DefineAPI.ins().aPressure.toString() + " hPa");
        System.out.println("Result :" + (DefineAPI.ins().aPressure.toString()));

        //습도
        atvHumidity = (TextView)aViewArea.findViewById(R.id.areatvHumidity);
        atvHumidity.setText(DefineAPI.ins().aHumidity.toString() + " %");

        //풍속
        atvSpeed = (TextView)aViewArea.findViewById(R.id.areatvSpeed);
        atvSpeed.setText(DefineAPI.ins().aSpeed.toString() + " Knot");

        //아이콘
        aivicon = (ImageView)aViewArea.findViewById(R.id.areaiv1);

        if(DefineAPI.ins().aWeather.equals("01d") || DefineAPI.ins().aWeather.equals("01n")) {
            aivicon.setImageResource(R.drawable.img_01d);
        }

        else if(DefineAPI.ins().aWeather.equals("02d") || DefineAPI.ins().aWeather.equals("02n")) {
            aivicon.setImageResource(R.drawable.img_02d);
        }

        else if(DefineAPI.ins().aWeather.equals("03d") || DefineAPI.ins().aWeather.equals("03n")) {
            aivicon.setImageResource(R.drawable.img_03d);
        }

        else if(DefineAPI.ins().aWeather.equals("04d") || DefineAPI.ins().aWeather.equals("04n")) {
            aivicon.setImageResource(R.drawable.img_04d);
        }

        else if(DefineAPI.ins().aWeather.equals("09d") || DefineAPI.ins().aWeather.equals("09n")) {
            aivicon.setImageResource(R.drawable.img_09d);
        }

        else if(DefineAPI.ins().aWeather.equals("10d") || DefineAPI.ins().aWeather.equals("10n")) {
            aivicon.setImageResource(R.drawable.img_10d);
        }

        else if(DefineAPI.ins().aWeather.equals("13d") || DefineAPI.ins().aWeather.equals("13n")) {
            aivicon.setImageResource(R.drawable.img_13d);
        }

        else if(DefineAPI.ins().aWeather.equals("50d") || DefineAPI.ins().aWeather.equals("50n")) {
            aivicon.setImageResource(R.drawable.img_50d);
        }


    }

    // 지역화면 배경 온도맞게 변화
    public void SetAreaBackground() {

        alinearLayout = (LinearLayout)aViewArea.findViewById(R.id.linArea);

        if(Double.parseDouble(DefineAPI.ins().aTemp) <= 4) {
            alinearLayout.setBackground(ContextCompat.getDrawable(aViewArea, R.drawable.bg_area_4));
        }

        if(Double.parseDouble(DefineAPI.ins().aTemp) >= 5 && Double.parseDouble(DefineAPI.ins().aTemp) <= 8) {
            alinearLayout.setBackground(ContextCompat.getDrawable(aViewArea, R.drawable.bg_area_5_8));
        }

        if(Double.parseDouble(DefineAPI.ins().aTemp) >= 9 && Double.parseDouble(DefineAPI.ins().aTemp) <= 11) {
            alinearLayout.setBackground(ContextCompat.getDrawable(aViewArea, R.drawable.bg_area_9_11));
        }

        if(Double.parseDouble(DefineAPI.ins().aTemp) >= 12 && Double.parseDouble(DefineAPI.ins().aTemp) <= 16) {
            alinearLayout.setBackground(ContextCompat.getDrawable(aViewArea, R.drawable.bg_area_12_16));
        }

        if(Double.parseDouble(DefineAPI.ins().aTemp) >= 17 && Double.parseDouble(DefineAPI.ins().aTemp) <= 19) {
            alinearLayout.setBackground(ContextCompat.getDrawable(aViewArea, R.drawable.bg_area_17_19));
        }

        if(Double.parseDouble(DefineAPI.ins().aTemp) >= 20 && Double.parseDouble(DefineAPI.ins().aTemp) <= 22) {
            alinearLayout.setBackground(ContextCompat.getDrawable(aViewArea, R.drawable.bg_area_20_22));
        }

        if(Double.parseDouble(DefineAPI.ins().aTemp) >= 23 && Double.parseDouble(DefineAPI.ins().aTemp) <= 27) {
            alinearLayout.setBackground(ContextCompat.getDrawable(aViewArea, R.drawable.bg_area_23_27));
        }

        if(Double.parseDouble(DefineAPI.ins().aTemp) >= 28) {
            alinearLayout.setBackground(ContextCompat.getDrawable(aViewArea, R.drawable.bg_area_28));
        }
        // 비오면 바뀌는 배경이 아이콘이 들어가야 아이콘따라 넣어보자
        if(DefineAPI.ins().aWeather.equals("10d" ) || DefineAPI.ins().aWeather.equals("10n")) {
            alinearLayout.setBackground(ContextCompat.getDrawable(aViewArea, R.drawable.bg_area_rain_fog));
        }

        else if (DefineAPI.ins().aWeather.equals("09d") || DefineAPI.ins().aWeather.equals("09d")) {
            alinearLayout.setBackground(ContextCompat.getDrawable(aViewArea, R.drawable.bg_area_rain_fog));
        }

    }
}
