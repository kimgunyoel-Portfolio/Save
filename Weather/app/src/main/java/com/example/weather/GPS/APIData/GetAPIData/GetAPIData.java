package com.example.weather.GPS.APIData.GetAPIData;

import android.app.Activity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.weather.GPS.Define.DefineAPI.DefineAPI;

import org.json.JSONObject;

public class GetAPIData {

    Activity aGetAPIData;   //!< Activity
    RequestQueue rQueue;    //!< 서버 요청자. 다른 Request 클래스들의 정보대로 서버에 요청을 보내는 역할
    private String sURL=""; //!< URL담을 변수

    /**
     * 생성자
     * @param activity - Activity
     */
    public GetAPIData(Activity activity){

        aGetAPIData = activity;                         //!< Activity
        rQueue = Volley.newRequestQueue(aGetAPIData);   //!< RequestQueue 객체생성

    }

    /**
     * API 정보 처리 메서드
     */
    public void getData() {

        sURL = DefineAPI.ins().sURLHeader +DefineAPI.ins().latitude + DefineAPI.ins().sURLMid + DefineAPI.ins().longitude + DefineAPI.ins().sURLFooter; //!< API키번호 sURL 변수에 저장
        System.out.println("sURL : " + sURL);   //!< 디버그
        if(!sURL.equals("")) {      //!< sURL이  "" 와 같지 않다면
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(sURL, new Response.Listener<JSONObject>() { //!< JsonObjectRequest객체생성
                @Override
                public void onResponse(JSONObject response) {
                    try{
                        /**
                         * 값 가져오기
                         */
                        DefineAPI.ins().sName = response.get("name").toString();                                                                //!< 지역이름
                        DefineAPI.ins().sWeather = response.getJSONArray("weather").getJSONObject(0).get("icon").toString();       //!< 날씨아이콘
                        DefineAPI.ins().sTemp = response.getJSONObject("main").get("temp").toString();                                          //!< 온도
                        DefineAPI.ins().sFells_like = response.getJSONObject("main").get("feels_like").toString();                              //!< 체감온도
                        DefineAPI.ins().sPressure = response.getJSONObject("main").get("pressure").toString();                                  //!< 대기압
                        DefineAPI.ins().sHumidity = response.getJSONObject("main").get("humidity").toString();                                  //!< 습도
                        DefineAPI.ins().sSpeed = response.getJSONObject("wind").get("speed").toString();                                        //!< 풍속

                        /**
                         * 디버그
                         */
                        System.out.println("response : " + response.toString());
                        System.out.println("sName : " + DefineAPI.ins().sName);
                        System.out.println("sWeather : " + DefineAPI.ins().sWeather);
                        System.out.println("sTemp : " + DefineAPI.ins().sTemp);
                        System.out.println("sFells_like : " + DefineAPI.ins().sFells_like);
                        System.out.println("sPressure : " + DefineAPI.ins().sPressure);
                        System.out.println("sHumidity : " + DefineAPI.ins().sHumidity);
                        System.out.println("sSpeed : " + DefineAPI.ins().sSpeed);

                    }
                    catch (Exception e) {

                    }
                }
            }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError error) {
                    System.out.println("VelleyError : " + error.toString());
                }
            });
            rQueue.add(jsonObjectRequest);
        }
        else {
            System.out.println("URL 없음");
        }

    }
}
