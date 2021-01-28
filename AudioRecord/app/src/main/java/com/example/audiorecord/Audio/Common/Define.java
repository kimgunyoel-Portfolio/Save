package com.example.audiorecord.Audio.Common;

public class Define {
    /**
     * 시간쓰레드 작동상태 디파인
     */
    //!< 초기상태
    public static final int INIT = 0;
    //!< 가동상태
    public static final int RUN = 1;
    //!< 멈춤상태
    public static final int PAUSE = 2;
    //!< 초기상태 넣어줄 변수
    public int STATS = INIT;

    //!< 실수담을 변수상자 2개
    public long lBaseTime;
    public long IPauseTime;


    //!< 싱글토오오온
    /**
     * @author
     * @since	2014 - 08 - 05
     * @param	instance Singleton Pattern
     */
    private static Define instance;
    public static Define ins() {
        if (instance == null) {
            instance = new Define();
        }

        return instance;

    }
}
