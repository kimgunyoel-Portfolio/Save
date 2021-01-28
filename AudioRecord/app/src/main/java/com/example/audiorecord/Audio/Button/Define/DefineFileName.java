package com.example.audiorecord.Audio.Button.Define;

import java.util.ArrayList;
import java.util.List;

public class DefineFileName {

    public String sFileName = "";                //!< 파일이름 담을 변수
    public boolean bRecord = false;              //!< 미디어리코더 작동상태 bool함수
    public final static String RECOREDE_FILE = "/sdcard/recode/";   //!< 경로
    public List<String> lstFileNameList = new ArrayList<>();        //!< 어레이리스트

    /**
     * @author
     * @since	2020 - 07 - 23
     * @param	instance Singleton Pattern
     */
    private static DefineFileName instance;
    public static DefineFileName ins() {
        if (instance == null) {
            instance = new DefineFileName();
        }

        return instance;

    }
}
