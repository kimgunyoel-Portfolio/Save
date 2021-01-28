package com.example.notepad.NoteList.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.example.notepad.R;

import java.util.List;

public class ListViewDialog extends Dialog {

    private Context mContext;
    List<String> list;

    //생성자
    public ListViewDialog(@NonNull Context context) {
        super(context);
        mContext = context;
    }

    // 리스트뷰 다이얼로그 연결
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_dialog);


    }


}
