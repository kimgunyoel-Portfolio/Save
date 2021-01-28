package com.example.weather.GPS.Define.DefineAPI;

public class DefineAPI {
    //https://openweathermap.org/current

    public String latitude = "";        //!< API 담을 변수
    public String longitude = "";       //!< API 담을 변수

    /**
     * 날씨 API 키번호
     */
    //"http://api.openweathermap.org/data/2.5/weather?" + latitude + "=lat&lon=" + longitude + "&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURLHeader = "http://api.openweathermap.org/data/2.5/weather?lat=";   //!< API주소 3등분
    public String sURLMid = "&lon=";                                                    //!< API주소 3등분
    public String sURLFooter = "&appid=400c72073669554d1dc38abdbaf0892f";               //!< API주소 3등분


    /**
     * GPS날씨현황
     */
    public String sName = "";           //!< 도시이름
    public String sWeather = "";        //!< 날씨아이콘
    public String sTemp = "";           //!< 온도
    public String sFells_like = "";     //!< 체감온도
    public String sPressure = "";       //!< 대기압
    public String sHumidity = "";       //!< 습도.
    public String sSpeed = "";          //!< 풍속

    /**
     * 지역별날씨현황
     */
    public String aName = "";           //!< 도시이름
    public String aWeather = "";        //!< 날씨아이콘
    public String aTemp = "";           //!< 온도
    public String aFells_like = "";     //!< 체감온도
    public String aPressure = "";       //!< 대기압
    public String aHumidity = "";       //!< 습도.
    public String aSpeed = "";          //!< 풍속


    /**
     * 5일 주간 날씨현황
     */
    public String wTemp =  "";          //<! 주간 5일 온도
    public String wIcon = "";           //!< 주간 5일 날씨 아이콘
    public String wTime = "";           //!< 주간 5일 시간

    public String wTemp1 = "";          //<! 주간 5일 온도
    public String wIcon1 = "";          //!< 주간 5일 날씨 아이콘
    public String wTime1 = "";          //!< 주간 5일 시간

    public String wTemp2 = "";          //<! 주간 5일 온도
    public String wIcon2 = "";          //!< 주간 5일 날씨 아이콘
    public String wTime2 = "";          //!< 주간 5일 시간

    public String wTemp3 = "";          //<! 주간 5일 온도
    public String wIcon3 = "";          //!< 주간 5일 날씨 아이콘
    public String wTime3 = "";          //!< 주간 5일 시간

    public String wTemp4 = "";          //<! 주간 5일 온도
    public String wIcon4 = "";          //!< 주간 5일 날씨 아이콘
    public String wTime4 = "";          //!< 주간 5일 시간


    //public boolean bCheckAPI = true;
    /**
     * @author
     * @since	2020-06-04
     * @param	instance Singleton Pattern
     */
    private static DefineAPI instance;
    public static DefineAPI ins() {
        if (instance == null) {
            instance = new DefineAPI();
        }

        return instance;

    }

}
