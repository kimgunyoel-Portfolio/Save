package com.example.weather.GPS.View.SetView;

import android.app.Activity;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.weather.GPS.Define.DefineAPI.DefineAPI;
import com.example.weather.R;

import java.text.DecimalFormat;

public class ViewMain {

    Activity aViewMain;             //!< Activity
    DecimalFormat decimalFormat;    //!< 날짜
    LinearLayout linearLayout;      //!< 리니어레이아웃


    //GPS --------------
    TextView tvTemp;        //!< 온도
    TextView tvName;        //!< 지역이름
    TextView tvFeels_like;  //!< 체감온도
    TextView tvPressure;    //!< 대기압
    TextView tvHumidity;    //!< 습도
    TextView tvSpeed;       //!< 풍속
    ImageView ivicon;       //!< 날씨 아이콘

    //5일 --------------
    //1일차
    TextView dayTemp;       //!< 1일차 온도
    TextView dayweek;       //!< 1일차 날짜
    ImageView dayimage;     //!< 1일차 날씨 아이콘
    //!< 2일차
    TextView dayTemp1;      //!< 2일차 온도
    TextView dayweek1;      //!< 2일차 날짜
    ImageView dayimage1;    //!<2일차 날씨 아이콘
    //!< 3일차
    TextView dayTemp2;      //!< 3일차 온도
    TextView dayweek2;      //!< 3일차 날짜
    ImageView dayimage2;    //!< 3일차 날씨 아이콘
    //!< 4일차
    TextView dayTemp3;      //!< 4일차 온도
    TextView dayweek3;      //!< 4일차 날짜
    ImageView dayimage3;    //!< 4일차 날씨 아이콘
    //!< 5일차
    TextView dayTemp4;      //!< 5일차 온도
    TextView dayweek4;      //!< 5일차 날짜
    ImageView dayimage4;    //!< 5일차 날씨 아이콘

    /**
     * 생성자
     * @param activity
     */
    public ViewMain(Activity activity) {
        aViewMain = activity;       //!< Activity
        decimalFormat = new DecimalFormat("#.#");   //!< 날짜 객체생성

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void setViewMain(){

        //도시이름
        tvName = (TextView)aViewMain.findViewById(R.id.tvName);     //!< 도시이름 id값 연결
        tvName.setText((DefineAPI.ins().sName.toString()));         //!< 출력
        System.out.println("도시이름 :" + (DefineAPI.ins().sName.toString()));  //!< 디버그

        //온도
        tvTemp = (TextView)aViewMain.findViewById(R.id.tvTemp);     //!< 온도 id값 연결
        Double.toString((( Double.parseDouble(DefineAPI.ins().sTemp) - 32 ) / 1.8));
        System.out.println("온도 :" +  Double.toString(( Double.parseDouble(DefineAPI.ins().sTemp) - 273.15)));   //!< 디버그
        System.out.println("온도 포멧적용 : " + decimalFormat.format(Double.parseDouble(DefineAPI.ins().sTemp) - 273.15) + " °C");    //!< 디버그

        tvTemp.setText(decimalFormat.format(Double.parseDouble(DefineAPI.ins().sTemp) - 273.15) + " °C");   //!< -273.15 해주어야함 출력

        //체감온도
        tvFeels_like = (TextView)aViewMain.findViewById(R.id.tvFells_like); //!< 체감온도 ID값 연결
        tvFeels_like.setText(decimalFormat.format( Double.parseDouble(DefineAPI.ins().sFells_like) - 273.15) + " °C");  //!< 출력

        //대기압
        tvPressure = (TextView)aViewMain.findViewById(R.id.tvPressure);         //!< 대기압 id값연결
        tvPressure.setText(DefineAPI.ins().sPressure.toString() + " hPa");      //!< 출력
        System.out.println("Result :" + (DefineAPI.ins().sPressure.toString()));//!< 디버그

        //습도
        tvHumidity = (TextView)aViewMain.findViewById(R.id.tvHumidity); //!< 습도 id값 연결
        tvHumidity.setText(DefineAPI.ins().sHumidity.toString() + " %");//!< 출력

        //풍속
        tvSpeed = (TextView)aViewMain.findViewById(R.id.tvSpeed);       //!< 풍속 id값 연결
        tvSpeed.setText(DefineAPI.ins().sSpeed.toString() + " Knot");   //!< 출력

        /**
         * 날씨 아이콘 변화
         *  날씨아이콘 따로 받아와 API값에 맞게 이미지 출력함
         */
        ivicon = (ImageView)aViewMain.findViewById(R.id.ivicon);        //!< 날씨 아이콘 이미지뷰 id값 연결

        if(DefineAPI.ins().sWeather.equals("01d") || DefineAPI.ins().sWeather.equals("01n")) {
            ivicon.setImageResource(R.drawable.img_01d);
        }

        else if(DefineAPI.ins().sWeather.equals("02d") || DefineAPI.ins().sWeather.equals("02n")) {
            ivicon.setImageResource(R.drawable.img_02d);
        }

        else if(DefineAPI.ins().sWeather.equals("03d") || DefineAPI.ins().sWeather.equals("03n")) {
            ivicon.setImageResource(R.drawable.img_03d);
        }

        else if(DefineAPI.ins().sWeather.equals("04d") || DefineAPI.ins().sWeather.equals("04n")) {
            ivicon.setImageResource(R.drawable.img_04d);
        }

        else if(DefineAPI.ins().sWeather.equals("09d") || DefineAPI.ins().sWeather.equals("09n")) {
            ivicon.setImageResource(R.drawable.img_09d);
        }

        else if(DefineAPI.ins().sWeather.equals("10d") || DefineAPI.ins().sWeather.equals("10n")) {
            ivicon.setImageResource(R.drawable.img_10d);
        }

        else if(DefineAPI.ins().sWeather.equals("11d") || DefineAPI.ins().sWeather.equals("11n")) {
            ivicon.setImageResource(R.drawable.img_11d);
        }

        else if(DefineAPI.ins().sWeather.equals("13d") || DefineAPI.ins().sWeather.equals("13n")) {
            ivicon.setImageResource(R.drawable.img_13d);
        }

        else if(DefineAPI.ins().sWeather.equals("50d") || DefineAPI.ins().sWeather.equals("50n")) {
            ivicon.setImageResource(R.drawable.img_50d);
        }


        /**
         * 5일 날짜
         */

        //1일차---------------------------------------------------------------------------------------
        //!<날짜
        dayweek = (TextView)aViewMain.findViewById(R.id.onedaytv1);          //!< 1일차 날짜 id값 연결
        DefineAPI.ins().wTime = DefineAPI.ins().wTime.substring(0, 10);      //!< 년 월 일 뒤에 시간자름
        String sTemp[] = DefineAPI.ins().wTime.split("-");            //!< - 단위로 스플릿
        DefineAPI.ins().wTime = sTemp[0]+"년 "+sTemp[1]+"월 "+sTemp[2]+"일"; //!< - 년 월 일 로 교체
        System.out.println("wTime : " + DefineAPI.ins().wTime);             //!< 디버그
        dayweek.setText(DefineAPI.ins().wTime.toString());                  //!< 출력


        //!<온도
        dayTemp = (TextView)aViewMain.findViewById(R.id.onedaytv2);         //!< 1일차 온도 id값 연결
        Double.toString((( Double.parseDouble(DefineAPI.ins().wTemp) - 32 ) / 1.8));
        System.out.println("1일차온도 :" +  decimalFormat.format( Double.parseDouble(DefineAPI.ins().wTemp) - 273.15)); //!< 디버그
        dayTemp.setText(decimalFormat.format( Double.parseDouble(DefineAPI.ins().wTemp) - 273.15) +  " °C");    //!< 출력 API에서 받아온 값 - 273.15 해줘야 온도 나옴

        //!< 1일차 이미지
        //!< 날씨아이콘 따로 받아와 API값에 맞게 이미지 출력함
        dayimage = (ImageView)aViewMain.findViewById(R.id.onedayiv1);   //!< 1일차 이미지 id값 연결
        if(DefineAPI.ins().wIcon.equals("01d")){
            dayimage.setImageResource(R.drawable.img_s01d);
        }

        else if(DefineAPI.ins().wIcon.equals("02d")) {
            dayimage.setImageResource(R.drawable.img_s02d);
        }

        else if(DefineAPI.ins().wIcon.equals("03d")) {
            dayimage.setImageResource(R.drawable.img_s03d);
        }

        else if(DefineAPI.ins().wIcon.equals("04d")) {
            dayimage.setImageResource(R.drawable.img_s04d);
        }

        else if(DefineAPI.ins().wIcon.equals("09d")) {
            dayimage.setImageResource(R.drawable.img_s09d);
        }

        else if(DefineAPI.ins().wIcon.equals("10d")) {
            dayimage.setImageResource(R.drawable.img_s10d);
        }

        else if(DefineAPI.ins().wIcon.equals("11d")) {
            dayimage.setImageResource(R.drawable.img_s11d);
        }

        else if(DefineAPI.ins().wIcon.equals("13d")) {
            dayimage.setImageResource(R.drawable.img_s13d);
        }

        else if(DefineAPI.ins().wIcon.equals("50d")) {
            dayimage.setImageResource(R.drawable.img_s50d);
        }

        //2일차---------------------------------------------------------------------------------------
        //날짜
        dayweek1 = (TextView)aViewMain.findViewById(R.id.twodaytv1);                    //!< 2일차 날짜 id값 연결
        DefineAPI.ins().wTime1 = DefineAPI.ins().wTime1.substring(0, 10);               //!< 년,월,일 뒤에 시간 자름
        String sTemp1[] = DefineAPI.ins().wTime1.split("-");                     //!< - 단위로 스플릿
        DefineAPI.ins().wTime1 = sTemp1[0] + "년" + sTemp1[1] + "월" + sTemp1[2] + "일";//!< - 년,월,일 로 교체
        dayweek1.setText(DefineAPI.ins().wTime1.toString());                           //!< 출력

        //온도
        dayTemp1 = (TextView)aViewMain.findViewById(R.id.twodaytv2);                   //!< 2일차 온도 id값 연결
        Double.toString((( Double.parseDouble(DefineAPI.ins().wTemp1) - 32 ) / 1.8));
        System.out.println("2일차온도 :" +  Double.toString(( Double.parseDouble(DefineAPI.ins().wTemp1) - 273.15)));   //!< 디버그
        dayTemp1.setText(decimalFormat.format(Double.parseDouble(DefineAPI.ins().wTemp1) - 273.15) + " °C"); //!< 출력

        // 2일차 이미지
        //!< 날씨아이콘 따로 받아와 API값에 맞게 이미지 출력함
        dayimage1 = (ImageView)aViewMain.findViewById(R.id.twodayiv1);
        if(DefineAPI.ins().wIcon1.equals("01d") || DefineAPI.ins().wIcon1.equals("01n")){
            dayimage1.setImageResource(R.drawable.img_s01d);
        }

        else if(DefineAPI.ins().wIcon1.equals("02d") || DefineAPI.ins().wIcon1.equals("02n")) {
            dayimage1.setImageResource(R.drawable.img_s02d);
        }

        else if(DefineAPI.ins().wIcon1.equals("03d") || DefineAPI.ins().wIcon1.equals("03n")) {
            dayimage1.setImageResource(R.drawable.img_s03d);
        }

        else if(DefineAPI.ins().wIcon1.equals("04d") || DefineAPI.ins().wIcon1.equals("04n")) {
            dayimage1.setImageResource(R.drawable.img_s04d);
        }

        else if(DefineAPI.ins().wIcon1.equals("09d") || DefineAPI.ins().wIcon1.equals("09n")) {
            dayimage1.setImageResource(R.drawable.img_s09d);
        }

        else if(DefineAPI.ins().wIcon1.equals("10d") || DefineAPI.ins().wIcon1.equals("10n")) {
            dayimage1.setImageResource(R.drawable.img_s10d);
        }

        else if(DefineAPI.ins().wIcon1.equals("11d") || DefineAPI.ins().wIcon1.equals("11n")) {
            dayimage1.setImageResource(R.drawable.img_s11d);
        }

        else if(DefineAPI.ins().wIcon1.equals("13d") || DefineAPI.ins().wIcon1.equals("13n")) {
            dayimage1.setImageResource(R.drawable.img_s13d);
        }

        else if(DefineAPI.ins().wIcon1.equals("50d") || DefineAPI.ins().wIcon1.equals("50n")) {
            dayimage1.setImageResource(R.drawable.img_s50d);
        }

        //3일차---------------------------------------------------------------------------------------
        //날짜
        dayweek2 = (TextView)aViewMain.findViewById(R.id.threedaytv1);                    //!< 3일차 날짜 id값 연결
        DefineAPI.ins().wTime2 = DefineAPI.ins().wTime2.substring(0, 10);                 //!< 년,월,일 뒤에 시간 자름
        String sTemp2[] = DefineAPI.ins().wTime2.split("-");                       //!< -단위로 스플릿
        DefineAPI.ins().wTime2 = sTemp2[0] + "년" + sTemp2[1] + "월" + sTemp2[2] + "일";  //!< - 년, 월, 일 로 교 체
        dayweek2.setText(DefineAPI.ins().wTime2.toString());    //!< 출력

        //온도
        dayTemp2 = (TextView)aViewMain.findViewById(R.id.threedaytv2);                   //!< 3일차 온도 id값 연결
        Double.toString((( Double.parseDouble(DefineAPI.ins().wTemp2) - 32 ) / 1.8));
        dayTemp2.setText(decimalFormat.format(Double.parseDouble(DefineAPI.ins().wTemp2) - 273.15) + " °C");    //!< 출력

        // 이미지
        //!< 날씨아이콘 따로 받아와 API값에 맞게 이미지 출력함
        dayimage2 = (ImageView)aViewMain.findViewById(R.id.threedayiv1);
        if(DefineAPI.ins().wIcon2.equals("01d") || DefineAPI.ins().wIcon2.equals("01n")){
            dayimage2.setImageResource(R.drawable.img_s01d);
        }

        else if(DefineAPI.ins().wIcon2.equals("02d") || DefineAPI.ins().wIcon2.equals("02n")) {
            dayimage2.setImageResource(R.drawable.img_s02d);
        }

        else if(DefineAPI.ins().wIcon2.equals("03d") || DefineAPI.ins().wIcon2.equals("03n")) {
            dayimage2.setImageResource(R.drawable.img_s03d);
        }

        else if(DefineAPI.ins().wIcon2.equals("04d") || DefineAPI.ins().wIcon2.equals("04n")) {
            dayimage2.setImageResource(R.drawable.img_s04d);
        }

        else if(DefineAPI.ins().wIcon2.equals("09d") || DefineAPI.ins().wIcon2.equals("09n")) {
            dayimage2.setImageResource(R.drawable.img_s09d);
        }

        else if(DefineAPI.ins().wIcon2.equals("10d") || DefineAPI.ins().wIcon2.equals("10n")) {
            dayimage2.setImageResource(R.drawable.img_s10d);
        }

        else if(DefineAPI.ins().wIcon2.equals("11d") || DefineAPI.ins().wIcon2.equals("11n")) {
            dayimage2.setImageResource(R.drawable.img_s11d);
        }

        else if(DefineAPI.ins().wIcon2.equals("13d") || DefineAPI.ins().wIcon2.equals("13n")) {
            dayimage2.setImageResource(R.drawable.img_s13d);
        }

        else if(DefineAPI.ins().wIcon2.equals("50d") || DefineAPI.ins().wIcon2.equals("50n")) {
            dayimage2.setImageResource(R.drawable.img_s50d);
        }

        //4일차---------------------------------------------------------------------------------------
        //날짜
        dayweek3 = (TextView)aViewMain.findViewById(R.id.fourdaytv1);           //!< 4일차 날짜 id값 연결
        DefineAPI.ins().wTime3 = DefineAPI.ins().wTime3.substring(0, 10);       //!< 년 월 일 뒤에 시간자름
        String sTemp3[] = DefineAPI.ins().wTime3.split("-");             //!< -단위로 스플릿
        DefineAPI.ins().wTime3 = sTemp3[0] + "년" + sTemp3[1] + "월" + sTemp3[2] + "일";//!< - 년 월 일 로 교체
        dayweek3.setText(DefineAPI.ins().wTime3.toString());    //!< 출력

        //온도
        dayTemp3 = (TextView)aViewMain.findViewById(R.id.fourdaytv2);            //!< 4일차 온도 id값 연결
        Double.toString((( Double.parseDouble(DefineAPI.ins().wTemp3) - 32 ) / 1.8));
        dayTemp3.setText(decimalFormat.format(Double.parseDouble(DefineAPI.ins().wTemp3) - 273.15) + " °C");    //!< 출력

        // 이미지
        //!< 날씨아이콘 따로 받아와 API값에 맞게 이미지 출력함
        dayimage3 = (ImageView)aViewMain.findViewById(R.id.fourdayiv1);
        if(DefineAPI.ins().wIcon3.equals("01d") || DefineAPI.ins().wIcon3.equals("01n")) {
            dayimage3.setImageResource(R.drawable.img_s01d);
        }

        else if(DefineAPI.ins().wIcon3.equals("02d") || DefineAPI.ins().wIcon3.equals("02n")) {
            dayimage3.setImageResource(R.drawable.img_s02d);
        }

        else if(DefineAPI.ins().wIcon3.equals("03d") || DefineAPI.ins().wIcon3.equals("03n")) {
            dayimage3.setImageResource(R.drawable.img_s03d);
        }

        else if(DefineAPI.ins().wIcon3.equals("04d") || DefineAPI.ins().wIcon3.equals("04n")) {
            dayimage3.setImageResource(R.drawable.img_s04d);
        }

        else if(DefineAPI.ins().wIcon3.equals("09d") || DefineAPI.ins().wIcon3.equals("09n")) {
            dayimage3.setImageResource(R.drawable.img_s09d);
        }

        else if(DefineAPI.ins().wIcon3.equals("10d") || DefineAPI.ins().wIcon3.equals("10n")) {
            dayimage3.setImageResource(R.drawable.img_s10d);
        }

        else if(DefineAPI.ins().wIcon3.equals("11d") || DefineAPI.ins().wIcon3.equals("11n")) {
            dayimage3.setImageResource(R.drawable.img_s11d);
        }

        else if(DefineAPI.ins().wIcon3.equals("13d") || DefineAPI.ins().wIcon3.equals("13n")) {
            dayimage3.setImageResource(R.drawable.img_s13d);
        }

        else if(DefineAPI.ins().wIcon3.equals("50d") || DefineAPI.ins().wIcon3.equals("50n")) {
            dayimage3.setImageResource(R.drawable.img_s50d);
        }

        //5일차---------------------------------------------------------------------------------------
        //날짜
        dayweek4 = (TextView)aViewMain.findViewById(R.id.fivetv1);          //!< 5일차 날짜 id값 연결
        DefineAPI.ins().wTime4 = DefineAPI.ins().wTime4.substring(0, 10);   //!< 년 월 일 뒤에 시간자름
        String sTemp4[] = DefineAPI.ins().wTime4.split("-");         //!< - 단위로 스플릿
        DefineAPI.ins().wTime4 = sTemp4[0] + "년" + sTemp4[1] + "월" + sTemp4[2] + "일";  //!< - 년 월 일 로 교체
        dayweek4.setText(DefineAPI.ins().wTime4.toString());    //!< 출력

        //온도
        dayTemp4 = (TextView)aViewMain.findViewById(R.id.fivetv2);          //!< 5일차 온도 id값 연결
        Double.toString((( Double.parseDouble(DefineAPI.ins().wTemp4) - 32 ) / 1.8));
        dayTemp4.setText(decimalFormat.format(Double.parseDouble(DefineAPI.ins().wTemp4) - 273.15) + " °C");    //!< 출력

        // 이미지
        //!< 날씨아이콘 따로 받아와 API값에 맞게 이미지 출력함
        dayimage4 = (ImageView)aViewMain.findViewById(R.id.fiveiv1);
        if(DefineAPI.ins().wIcon4.equals("01d") || DefineAPI.ins().wIcon4.equals("01n")){
            dayimage4.setImageResource(R.drawable.img_s01d);
        }

        else if(DefineAPI.ins().wIcon4.equals("02d") || DefineAPI.ins().wIcon4.equals("02n")) {
            dayimage4.setImageResource(R.drawable.img_s02d);
        }

        else if(DefineAPI.ins().wIcon4.equals("03d") || DefineAPI.ins().wIcon4.equals("03n")) {
            dayimage4.setImageResource(R.drawable.img_s03d);
        }

        else if(DefineAPI.ins().wIcon4.equals("04d") || DefineAPI.ins().wIcon4.equals("04n")) {
            dayimage4.setImageResource(R.drawable.img_s04d);
        }

        else if(DefineAPI.ins().wIcon4.equals("09d") || DefineAPI.ins().wIcon4.equals("09n")) {
            dayimage4.setImageResource(R.drawable.img_s09d);
        }

        else if(DefineAPI.ins().wIcon4.equals("10d") || DefineAPI.ins().wIcon4.equals("10n")) {
            dayimage4.setImageResource(R.drawable.img_s10d);
        }

        else if(DefineAPI.ins().wIcon4.equals("11d") || DefineAPI.ins().wIcon4.equals("11n")) {
            dayimage4.setImageResource(R.drawable.img_s11d);
        }

        else if(DefineAPI.ins().wIcon4.equals("13d") || DefineAPI.ins().wIcon4.equals("13n")) {
            dayimage4.setImageResource(R.drawable.img_s13d);
        }

        else if(DefineAPI.ins().wIcon4.equals("50d") || DefineAPI.ins().wIcon4.equals("50n")) {
            dayimage4.setImageResource(R.drawable.img_s50d);
        }


    }

    /**
     * 배경화면 온도에따라 바뀌는 메서드
     */
    public void SetBackground() {

        linearLayout = (LinearLayout)aViewMain.findViewById(R.id.gpsbg);    //!< 리니어 레이아웃 id값연결

        if(Double.parseDouble(DefineAPI.ins().sTemp) <= 4) {                                                        //!< GPS온도가 4도, 4도이하면
            linearLayout.setBackground(ContextCompat.getDrawable(aViewMain, R.drawable.bg_4));                      //!< 배경출력
        }

        if(Double.parseDouble(DefineAPI.ins().sTemp) >= 5 && Double.parseDouble(DefineAPI.ins().sTemp) <= 8) {      //!< GPS온도가 5도이상 8도이하면
            linearLayout.setBackground(ContextCompat.getDrawable(aViewMain, R.drawable.bg_5_8));                    //!< 배경출력
        }

        if(Double.parseDouble(DefineAPI.ins().sTemp) >= 9 && Double.parseDouble(DefineAPI.ins().sTemp) <= 11) {     //!< GPS온도가 9도이상 11도이하면
            linearLayout.setBackground(ContextCompat.getDrawable(aViewMain, R.drawable.bg_9_11));                   //!< 배경출력
        }

        if(Double.parseDouble(DefineAPI.ins().sTemp) >= 12 && Double.parseDouble(DefineAPI.ins().sTemp) <= 16) {    //!< GPS온도가 12도이상 16도이하면
            linearLayout.setBackground(ContextCompat.getDrawable(aViewMain, R.drawable.bg_12_16));                  //!< 배경출력
        }

        if(Double.parseDouble(DefineAPI.ins().sTemp) >= 17 && Double.parseDouble(DefineAPI.ins().sTemp) <= 19) {    //!< GPS온도가 17도이상 19도 이하면
            linearLayout.setBackground(ContextCompat.getDrawable(aViewMain, R.drawable.bg_17_19));                  //!< 배경출력
        }

        if(Double.parseDouble(DefineAPI.ins().sTemp) >= 20 && Double.parseDouble(DefineAPI.ins().sTemp) <= 22) {    //!< GPS온도가 20도이상 22도이하면
            linearLayout.setBackground(ContextCompat.getDrawable(aViewMain, R.drawable.bg_20_22));                  //!< 배경출력
        }

        if(Double.parseDouble(DefineAPI.ins().sTemp) >= 23 && Double.parseDouble(DefineAPI.ins().sTemp) <= 27) {    //!< GPS온도가 23도이상 27도이하면
            linearLayout.setBackground(ContextCompat.getDrawable(aViewMain, R.drawable.bg_23_27));                  //!< 배경출력
        }

        if(Double.parseDouble(DefineAPI.ins().sTemp) >= 28) {                                                       //!< GPS온도가 28도 이상이면
            linearLayout.setBackground(ContextCompat.getDrawable(aViewMain, R.drawable.bg_28));                     //!< 배경출력
        }
        /**
         * 비오는 배경화면
         * 비오면 바뀌는 배경이 아이콘이 들어가야함  아이콘따라 배경화면 이미지 출력
         */
        if(DefineAPI.ins().sWeather.equals("10d")){                                                                 //!< 흐리거나 비오는 아이콘 값이면
            linearLayout.setBackground(ContextCompat.getDrawable(aViewMain, R.drawable.bg_rain_fog));               //!< 비오는 배경출력
        }
        else if(DefineAPI.ins().sWeather.equals("09d")) {                                                           //!< 비오는 아이콘 값이면
            linearLayout.setBackground(ContextCompat.getDrawable(aViewMain, R.drawable.bg_rain_fog));               //!< 비오는 배경출력
        }
    }

}

