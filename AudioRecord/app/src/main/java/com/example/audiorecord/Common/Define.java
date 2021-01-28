package com.example.audiorecord.Common;

import android.graphics.Bitmap;

public class Define {
    //!< 앨범 이미지 받아오는 DEfine ==
    public Bitmap album = null;  //!< 앨범 이미지 변수 null 세팅

    /**
     * @author
     * @since	2020 - 07 - 23
     * @param	instance Singleton Pattern
     */
    private static Define instance;
    public static Define ins() {
        if(instance == null){
            instance = new Define();
        }
        return instance;

    }
}
