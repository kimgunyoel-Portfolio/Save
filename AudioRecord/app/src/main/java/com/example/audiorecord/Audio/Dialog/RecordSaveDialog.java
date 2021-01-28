package com.example.audiorecord.Audio.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.audiorecord.R;

public class RecordSaveDialog extends Dialog{

    AppCompatActivity aRecordSaveDialog;        //!< Activity
    Context mContext;                           //!< 컨텍스트

    RecordSaveButton cRecordSaveButton;         //!< 다이얼로그 저장버튼
    RecordCancelButton cRecordCancelButton;     //!< 다이얼로그 취소버튼

    /**
     * 생성자
     * @param context   - 컨텍스트
     * @param appCompatActivity -Activity
     */
    public RecordSaveDialog(@NonNull Context context, AppCompatActivity appCompatActivity) {
        super(context);             //!< super
        mContext = context;         //!< 컨텍스트 연결
        aRecordSaveDialog = appCompatActivity;  //!< Activity


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recordsave_dialog);
        //!<#fe5c5c

        cRecordSaveButton = new RecordSaveButton(aRecordSaveDialog ,this);          //!< 다이얼로그 저장버튼 객체생성
        cRecordCancelButton = new RecordCancelButton(aRecordSaveDialog , this);     //!< 다이얼로그 취소버튼 객체생성
    }

}
