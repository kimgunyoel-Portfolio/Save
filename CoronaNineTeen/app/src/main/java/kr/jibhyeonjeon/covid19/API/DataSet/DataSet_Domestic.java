package kr.jibhyeonjeon.covid19.API.DataSet;

import android.app.Activity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

import kr.jibhyeonjeon.covid19.API.Common.DefineAPIDataSet;
import kr.jibhyeonjeon.covid19.API.Common.DefineAPIURL;

public class DataSet_Domestic {
    Activity aDataSet_Domestic;
    RequestQueue rQueue;
    SimpleDateFormat simpleDate;
    Date date;
    long now;
    public DataSet_Domestic(Activity activity) {
        aDataSet_Domestic = activity;
        rQueue = Volley.newRequestQueue(aDataSet_Domestic);
        simpleDate = new SimpleDateFormat("yyyy-MM-dd");
        now = System.currentTimeMillis();
        date = new Date(now);
    }

    public void getData_Domestic() {
        System.out.println("getData_Domestic 진입");
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(DefineAPIURL.ins().sURL_Domestic, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{

                    /**
                     * API 값 저장
                     */
//                    DefineAPIDataSet.ins().sDomesticUpdateTime = response.get("current").toString();//infected 확진자 수 뜸
//                    DefineAPIDataSet.ins().sDomesticQuarantine = response.getJSONArray("datas").getJSONObject(0).get("value").toString();
//                    DefineAPIDataSet.ins().sDomesticReleased = response.getJSONArray("datas").getJSONObject(1).get("value").toString();
//                    DefineAPIDataSet.ins().sDomesticDeath = response.getJSONArray("datas").getJSONObject(2).get("value").toString();
//                    DefineAPIDataSet.ins().sDomesticConfirmedCases = response.getJSONArray("datas").getJSONObject(3).get("value").toString();
//                    DefineAPIDataSet.ins().sDomesticNegative = response.getJSONArray("datas").getJSONObject(4).get("value").toString();
//                    DefineAPIDataSet.ins().sDomesticUnderExamination = response.getJSONArray("datas").getJSONObject(6).get("value").toString();
//                    DefineAPIDataSet.ins().sDomesticTotalExamination = response.getJSONArray("datas").getJSONObject(5).get("value").toString();


                    DefineAPIDataSet.ins().sDomesticUpdateTime = simpleDate.format(date);
                    DefineAPIDataSet.ins().sDomesticQuarantine = response.get("active").toString();
                    DefineAPIDataSet.ins().sDomesticReleased = response.get("recovered").toString();
                    DefineAPIDataSet.ins().sDomesticConfirmedCases = response.get("cases").toString();
                    DefineAPIDataSet.ins().sDomesticDeath = response.get("deaths").toString();
                    DefineAPIDataSet.ins().sDomesticCompareDeath = response.get("todayDeaths").toString();

                    /**
                     * 디버그
                     */
                    System.out.println("최종 업데이트 : " + DefineAPIDataSet.ins().sDomesticUpdateTime);
                    System.out.println("확진환자(격리중) : " + DefineAPIDataSet.ins().sDomesticQuarantine);
                    System.out.println("확진환자(격리해제) : " + DefineAPIDataSet.ins().sDomesticReleased);
                    System.out.println("확진환자(사망) : " + DefineAPIDataSet.ins().sDomesticDeath);
                    System.out.println("확진환자(총계) : " + DefineAPIDataSet.ins().sDomesticConfirmedCases);
                    System.out.println("전일대비 확진자 : " + DefineAPIDataSet.ins().sDomesticCompareConfirmedCases);
                    System.out.println("전일대비 완치 : " + DefineAPIDataSet.ins().sDomesticCompareDeath);
//                    System.out.println("합계 : " + DefineAPIDataSet.ins().sDomesticTotalExamination);


                    DefineAPIDataSet.ins().bCheckAPI_Domestic = true;
                }catch (JSONException e) {
                    System.out.println("DataSet_Domestic Error : "+e.toString());
                    DefineAPIDataSet.ins().bCheckAPI_Domestic = false;
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                DefineAPIDataSet.ins().bCheckAPI_Domestic = false;
            }
        });
        rQueue.add(jsonObjectRequest);
    }
}
