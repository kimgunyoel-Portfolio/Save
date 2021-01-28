package com.example.audiorecord.MainList.Activity;

import androidx.appcompat.app.AppCompatActivity;

import com.example.audiorecord.MainList.ListView.MListView;


public class ListMain {

    AppCompatActivity aListMain; //!< Activity
    MListView cMListView;        //!<  리스트뷰

    /**
     * 생성자
     * @param appCompatActivity
     */
    public ListMain(AppCompatActivity appCompatActivity){

        aListMain = appCompatActivity;              //!< Activity
        cMListView = new MListView(aListMain);      //!< 리스트뷰

    }

}
