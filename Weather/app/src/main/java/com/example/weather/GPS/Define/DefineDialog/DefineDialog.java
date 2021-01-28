package com.example.weather.GPS.Define.DefineDialog;

public class DefineDialog {

    public String sProvince = "";   //!< 다이얼로그 지역넣을 변수
    public String sCity = "";

    /**
     * @author
     * @since	2020 - 06 - 05
     * @param	instance Singleton Pattern
     */
    private static DefineDialog instance;
    public static DefineDialog ins() {
        if (instance == null) {
            instance = new DefineDialog();
        }

        return instance;

    }
}
