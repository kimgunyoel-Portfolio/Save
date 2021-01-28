package com.example.weather.GPS.WeekData.GetWeekData;

import android.app.Activity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.weather.GPS.Define.DefineAPI.DefineAPI;

import org.json.JSONObject;

public class GetWeekData {

    Activity aGetWeekData;      //!< Activity
    RequestQueue rQueue;        //!< 리퀘스트큐

    /**
     * 생성자
     * @param activity
     */
    public GetWeekData(Activity activity) {
        aGetWeekData = activity;    //!< Activity
        rQueue = Volley.newRequestQueue(aGetWeekData);  //!< 리퀘스트Q 객체생성
    }

    /**
     * 주간날씨 API 값 받기
     */
    public void getweekData(){

        String s5dayURL = "http://api.openweathermap.org/data/2.5/forecast?lat=" + DefineAPI.ins().latitude + "&lon=" + DefineAPI.ins().longitude + "&appid=bf8c805a95801972d67de2937f059aad";  //!< 주간날씨 API키번호
        System.out.println("s5dayURL : " + s5dayURL);   //!< 디버그

        if(!s5dayURL.equals("")) {
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(s5dayURL, new Response.Listener<JSONObject>() {     //!< 제이썬오브젝트 객체생성
                @Override
                public void onResponse(JSONObject response) {
                    try {
                        /**
                         * API값에서 8의 배수값을 넣어주면 24시간이 넘어가 내일날짜로 받을수 있음
                         */
                        System.out.println("time : " + response.getJSONArray("list").getJSONObject(0).get("dt_txt"));
                        System.out.println("main : " + response.getJSONArray("list").getJSONObject(0).getJSONObject("main").get("temp"));
                        System.out.println("humidity : " + response.getJSONArray("list").getJSONObject(0).getJSONObject("main").get("humidity"));
                        System.out.println("icon : " + response.getJSONArray("list").getJSONObject(0).getJSONArray("weather").getJSONObject(0).get("icon").toString());
                        //1일날씨
                        DefineAPI.ins().wTime = response.getJSONArray("list").getJSONObject(0).get("dt_txt").toString();                                                     //!< 1일차 날짜
                        DefineAPI.ins().wTemp = response.getJSONArray("list").getJSONObject(0).getJSONObject("main").get("temp").toString();                                 //!< 1일차 온도
                        DefineAPI.ins().wIcon = response.getJSONArray("list").getJSONObject(0).getJSONArray("weather").getJSONObject(0).get("icon").toString(); //!< 1일차 아이콘

                        //2일날씨
                        DefineAPI.ins().wTime1 = response.getJSONArray("list").getJSONObject(8).get("dt_txt").toString();                                                     //!< 2일차 날짜
                        DefineAPI.ins().wTemp1 = response.getJSONArray("list").getJSONObject(8).getJSONObject("main").get("temp").toString();                                 //!< 2일차 온도
                        DefineAPI.ins().wIcon1 = response.getJSONArray("list").getJSONObject(8).getJSONArray("weather").getJSONObject(0).get("icon").toString(); //!< 2일차 아이콘

                        //3일날씨
                        DefineAPI.ins().wTime2 = response.getJSONArray("list").getJSONObject(16).get("dt_txt").toString();                                                     //!< 3일차 날짜
                        DefineAPI.ins().wTemp2 = response.getJSONArray("list").getJSONObject(16).getJSONObject("main").get("temp").toString();                                 //!< 3일차 온도
                        DefineAPI.ins().wIcon2 = response.getJSONArray("list").getJSONObject(16).getJSONArray("weather").getJSONObject(0).get("icon").toString(); //!< 3일차 아이콘

                        //4일날씨
                        DefineAPI.ins().wTime3 = response.getJSONArray("list").getJSONObject(24).get("dt_txt").toString();                                                     //!< 4일차 날짜
                        DefineAPI.ins().wTemp3 = response.getJSONArray("list").getJSONObject(24).getJSONObject("main").get("temp").toString();                                 //!< 4일차 온도
                        DefineAPI.ins().wIcon3 = response.getJSONArray("list").getJSONObject(24).getJSONArray("weather").getJSONObject(0).get("icon").toString(); //!< 4일차 아이콘

                        //5일날씨
                        DefineAPI.ins().wTime4 = response.getJSONArray("list").getJSONObject(32).get("dt_txt").toString();                                                      //!< 5일차 날짜
                        DefineAPI.ins().wTemp4 = response.getJSONArray("list").getJSONObject(32).getJSONObject("main").get("temp").toString();                                  //!< 5일차 온도
                        DefineAPI.ins().wIcon4 = response.getJSONArray("list").getJSONObject(32).getJSONArray("weather").getJSONObject(0).get("icon").toString();  //!< 5일차 아이콘


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
