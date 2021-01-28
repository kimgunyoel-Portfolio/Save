package com.example.notepad.NoteList.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.notepad.NoteList.ButtonView.ListViewButton;
import com.example.notepad.R;

public class NoteListActivity extends AppCompatActivity {

   NoteList cNoteList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cNoteList = new NoteList(this);
        cNoteList.setNoteList();

    }



}
