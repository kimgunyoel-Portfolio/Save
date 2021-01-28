package com.example.audiorecord.Audio.Dialog;

import android.app.Dialog;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.audiorecord.R;

public class RecordCancelButton {

    AppCompatActivity cRecordCancelButton;      //!< Activity
    Dialog dRecordCancelButton;                 //!< 다이얼로그
    Button cancelbutton;                        //!< 취소버튼

    /**
     * 생성자
     * @param appCompatActivity -Activity
     * @param dialog            - 다이얼로그
     */
    public RecordCancelButton(AppCompatActivity appCompatActivity, Dialog dialog){
        cRecordCancelButton = appCompatActivity;    //!< Activity
        dRecordCancelButton = dialog;               //!< 다이얼로그

        setRecordCancelButton();                    //!< 다이얼로그 취소버튼 메서드
    }

    public void setRecordCancelButton(){
        cancelbutton = (Button)dRecordCancelButton.findViewById(R.id.dialog_cancelbt);  //!< 다이얼로그 취소버튼 id값 연결
        cancelbutton.setOnClickListener(new View.OnClickListener() {            //!< 버튼 클릭 리스너
            @Override
            public void onClick(View view) {
                System.out.println("취소버튼 눌림");      //!< 디버그
                dRecordCancelButton.dismiss();          //!< 다이얼로그 종료

            }
        });

    }
}
