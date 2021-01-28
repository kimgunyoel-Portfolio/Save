package com.example.audiorecord.MP3.Activity;

import android.media.MediaPlayer;

import androidx.appcompat.app.AppCompatActivity;

import com.example.audiorecord.MP3.Button.AllButton;
import com.example.audiorecord.MP3.SeekBar.ViewSeekBar;
import com.example.audiorecord.MainList.ListView.MListViewItem;

import java.util.ArrayList;

public class InMusic {

    AppCompatActivity aInMusic; //!< Activity
    MediaPlayer mInMusic;       //!< 미디어 플레이어
    AllButton cAllButton;       //!< 버튼 클래스
    ViewSeekBar cViewSeekBar;   //!< SeekBar 클래스

    public InMusic(AppCompatActivity appCompatActivity, MediaPlayer mediaPlayer, int position, ArrayList<MListViewItem> list){

        /**
         * 인자값
         */
        aInMusic = appCompatActivity;    //!< Activity
        mInMusic = mediaPlayer;          //!< 미디어 플레이어

        /**
         * 클래스 선언
         */
        cAllButton = new AllButton(aInMusic, mInMusic, position, list);         //!< 버튼클래스
        cViewSeekBar = new ViewSeekBar(aInMusic, mInMusic, position, list);     //!< SeekBar 클래스

    }

}
