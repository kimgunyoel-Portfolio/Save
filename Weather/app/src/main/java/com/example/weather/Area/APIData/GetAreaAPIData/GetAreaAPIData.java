package com.example.weather.Area.APIData.GetAreaAPIData;

import android.app.Activity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.weather.Area.APIData.GetAreaAPIData.URL.SetAreaURL;
import com.example.weather.Area.Define.DefineArea.DefineCity;
import com.example.weather.GPS.Define.DefineAPI.DefineAPI;

import org.json.JSONObject;

public class GetAreaAPIData {

    Activity aGetAreaAPIData;       //!< Activity
    RequestQueue rQueue;            //!< 리퀘스트 큐
    private String sURL="";         //!< URL담을 변수
    SetAreaURL cSetAreaURL;         //!< 지역URL 클래스

    /**
     * 생성자
     * @param activity
     */
    public GetAreaAPIData(Activity activity) {
        aGetAreaAPIData = activity;                         //!< Activity
        rQueue = Volley.newRequestQueue(aGetAreaAPIData);   //!< 리퀘스트 큐 객체생성
        cSetAreaURL = new SetAreaURL();                     //!< 지역URL 객체생성
    }

    /**
     * API
     */
    public void getareadata() {

        sURL = cSetAreaURL.getURL(DefineCity.ins().sSelectArea);    //!< 지역URL클래스에서 정보 가져오기
        System.out.println("URL Test : " + sURL);   //!< 디버그

        if(!sURL.equals("")) {
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(sURL, new Response.Listener<JSONObject>() { //!< 제이썬오브젝트 객체생성
                @Override
                public void onResponse(JSONObject response) {
                    try {
                        System.out.println("지역 API 가져오기");
                        //!< 값 가져오기
                        DefineAPI.ins().aName = response.get("name").toString();        //!< 지역이름 가져오기
                        DefineAPI.ins().aWeather = response.getJSONArray("weather").getJSONObject(0).get("icon").toString();    //!< 지역아이콘 가져오기
                        DefineAPI.ins().aTemp = response.getJSONObject("main").get("temp").toString();              //!< 지역 온도 가져오기
                        DefineAPI.ins().aFells_like = response.getJSONObject("main").get("feels_like").toString();  //!< 지역 체감온도 가져오기
                        DefineAPI.ins().aPressure = response.getJSONObject("main").get("pressure").toString();      //!< 지역 대기압 가져오기
                        DefineAPI.ins().aHumidity = response.getJSONObject("main").get("humidity").toString();      //!< 지역 습도 가져오기
                        DefineAPI.ins().aSpeed = response.getJSONObject("wind").get("speed").toString();            //!< 지역 풍속 가져오기

                        //!< 디버그
                        System.out.println("response1 : " + response.toString());
                        System.out.println("aName : " + DefineAPI.ins().aName);
                        System.out.println("aWeather : " + DefineAPI.ins().aWeather);
                        System.out.println("aTemp : " + DefineAPI.ins().aTemp);
                        System.out.println("aFells_like : " + DefineAPI.ins().aFells_like);
                        System.out.println("aPressure : " + DefineAPI.ins().aPressure);
                        System.out.println("aHumidity : " + DefineAPI.ins().aHumidity);
                        System.out.println("aSpeed : " + DefineAPI.ins().aSpeed);



                    }catch (Exception e){

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
