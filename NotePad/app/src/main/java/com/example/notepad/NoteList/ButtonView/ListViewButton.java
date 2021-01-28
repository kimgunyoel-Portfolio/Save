package com.example.notepad.NoteList.ButtonView;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.notepad.R;

public class ListViewButton {

    Button button;

    /**
     * 메모추가버튼 누르면 리스트뷰 다이얼로그 띄움
     */
    public void setDialogChange() {
       final Button button = (Button).findViewById();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("nlbt1 눌림 ");


            }
        });



    }
}
