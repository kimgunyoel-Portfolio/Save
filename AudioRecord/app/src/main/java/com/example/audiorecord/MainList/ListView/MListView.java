package com.example.audiorecord.MainList.ListView;

import android.content.Intent;
import android.database.Cursor;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.audiorecord.MP3.Activity.InMusicActivity;
import com.example.audiorecord.R;

import java.util.ArrayList;

public class MListView {

    AppCompatActivity aMListView;                       //!< Activity
    ArrayList<MListViewItem> list = new ArrayList<MListViewItem>(); //!< 리스트뷰

    public MListViewAdapter cMListViewAdapter;          //!< 리스트뷰 Adapter
    //!< 생성자
    public MListView(AppCompatActivity appCompatActivity){
        aMListView = appCompatActivity;                 //!< Activity
        /**
         * 클래스 선언
         */
        cMListViewAdapter = new MListViewAdapter(aMListView);   //!< 리스트뷰 어댑터

        setMListView();
    }

    /**
     * 리스트뷰 클릭 기능
     * 음악 앨범 정보 구현,리스트뷰 연결.
     */

    public void setMListView(){

        /**
         * 가져오고 싶은 컬럼 명을 나열, 음악의 아이디, 앰블럼 아이디, 제목, 아스티스트 정보를 가져오기.
         */
        String[] projection = {MediaStore.Audio.Media._ID,  //!< String 배열로 아이디값 저장
                MediaStore.Audio.Media.ALBUM_ID,            //!< String 배열로 앨범아이디값 저장
                MediaStore.Audio.Media.TITLE,               //!< String 배열로 제목값 저장
                MediaStore.Audio.Media.ARTIST               //!< String 배열로 아티스트값 저장
        };

          Cursor cursor = aMListView.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,projection      //!< 커서 에 파일경로 저장
          ,MediaStore.Audio.Media.DATA + " like ? ", new String[]{"%recode%"},null);
        System.out.println("cursor : " + cursor.getCount());            //!< 디버그


        while(cursor.moveToNext()){
            MListViewItem musicDto = new MListViewItem();                                                   //!< 리스트뷰아이템 객체생성
            musicDto.setId(cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media._ID)));            //!< 음악id 값 세팅
            musicDto.setAlbumid(cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ALBUM_ID)));  //!< 앨범id 값 세팅
            musicDto.setTitle(cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.TITLE)));       //!< 제목 값 세팅
            musicDto.setArtist(cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ARTIST)));     //!< 아티스트 값 세팅
            list.add(musicDto);
            cMListViewAdapter.mItem.add(musicDto);      //!< add 아이템 하기
        }

        System.out.println("list확인 : " + list.size());      //< 디버그

        //cursor.close();

        ListView listView = (ListView)aMListView.findViewById(R.id.savedata_lv1);         //!< 리스트뷰 선언
        listView.setAdapter(cMListViewAdapter);                                           //!< 리스트뷰 어뎁터 연결

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {           //!< 리스트뷰 클릭 이벤트 처리
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("리스트뷰  눌림");                               //!< 디버그
                //!< 인텐트 putExtra 정보 전달 -> MP3패키지 (InMusicActivity)
                Intent intent = new Intent(aMListView, InMusicActivity.class);    //!< 인텐트 객체생성
                intent.putExtra("position", position);                     //!< 인텐트 포지션값 넘기기
                intent.putExtra("playlist", list);                         //!< 인텐트 리스트목록 넘기기

                //!< 디버그.
                for(int i = 0 ; i < list.size() ; i++) {
                    System.out.println("리스트뷰 클릭 list title : " + list.get(i).getTitle());

                }
                System.out.println("리스트뷰 클릭 position : " + position);   //!< 디버그
                aMListView.startActivity(intent);                           //!< 인텐트 startActivity-
            }
        });
    }


}
