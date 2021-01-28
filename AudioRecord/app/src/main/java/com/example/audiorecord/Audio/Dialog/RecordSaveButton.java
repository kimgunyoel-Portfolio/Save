package com.example.audiorecord.Audio.Dialog;

import android.app.Dialog;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.audiorecord.Audio.Button.Define.DefineFileName;
import com.example.audiorecord.R;


public class RecordSaveButton {

    AppCompatActivity aRecordSaveButton;        //!< Activity
    Dialog dRecordSaveButton;                   //!< 저장버튼 Dialog
    Button recordsavebutton;                    //!< 저장버튼 Activity
    EditText etFileName;                        //!< EditText

    /**
     * 생성자
     * @param appCompatActivity - Activity
     * @param dialog - 다이얼로그
     */
    public RecordSaveButton(AppCompatActivity appCompatActivity , Dialog dialog){
        aRecordSaveButton = appCompatActivity;  //!< Activity
        dRecordSaveButton = dialog;             //!< 다이얼로그

        setRecordSaveButton();                  //!< 다이얼로그 버튼 메서드
    }

    public void setRecordSaveButton(){
        recordsavebutton = (Button)dRecordSaveButton.findViewById(R.id.dialog_savebt);      //!< 다이얼로그 저장버튼 id값 연결
        etFileName = (EditText)dRecordSaveButton.findViewById(R.id.dialog_et1);             //!< 파일이름 출력 editText id값 연결

        recordsavebutton.setOnClickListener(new View.OnClickListener() {            //!< 버튼 클릭 리스너
            @Override
            public void onClick(View view) {
                DefineFileName.ins().sFileName = etFileName.getText().toString();       //!< 디파인 변수에 EditText값 저장
                System.out.println("DefineFileName.ins().sFileName : " + DefineFileName.ins().sFileName);       //!< 디버그
                DefineFileName.ins().bRecord = true;                                    //!< 디파인 bool함수 true
                dRecordSaveButton.dismiss();                                            //!< 다이얼로그 종료
            }
        });

    }

}
