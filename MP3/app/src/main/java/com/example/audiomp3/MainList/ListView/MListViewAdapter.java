package com.example.audiomp3.MainList.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.audiomp3.Common.Define;
import com.example.audiomp3.R;

import java.util.ArrayList;

 //!< BaseAdapter 상속받기
public class MListViewAdapter extends BaseAdapter {

    AppCompatActivity aMListViewAdapter;            //!< Activity
    AlbumImg cAlbumImg;                             //!< 앨범 이미지 클래스

    public ArrayList<MListViewItem> mItem = new ArrayList<>();    //!< ArrayList 객체 생성

    //!< 생성자
    public MListViewAdapter(AppCompatActivity appCompatActivity){
        aMListViewAdapter = appCompatActivity; //!< Activity
        cAlbumImg = new AlbumImg();            //!< 앨범 이미지 클래스
    }

    @Override
    public int getCount() {
        return mItem.size();                //!< 리스트뷰 아이템갯수만큼 리턴
    }

    @Override
    public Object getItem(int position) {   //!<리스트뷰 아이템 자리에맞게 리턴
        return mItem.get(position);
    }

    @Override
    public long getItemId(int position) {   //!< 아이템 아이디 포지션 리턴
        return position;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        //!< Context 연결.
        Context context = parent.getContext();
        if(convertview == null){            //!컨버트뷰 null일때
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);    //!< 레이아웃 인플레이터 선언
            convertview = inflater.inflate(R.layout.musiclist_item,parent,false);                      //!< 컨버트뷰에 리스트뷰아이템 적용
        }
        /**
         *  View, Item  선언
         */
        MListViewItem mListViewItem = (MListViewItem)getItem(position);                  //!< 리스트뷰 포지션에 맞게 선언\
        TextView textView = (TextView)convertview.findViewById(R.id.lsttitle);           //!< 음악 제목 텍스트뷰 선언
        textView.setText(mListViewItem.getTitle());                                      //!< 텍스트뷰에 음악제목 출력
        TextView textView1 = (TextView)convertview.findViewById(R.id.lstartist);         //!< 아티스트 텍스트뷰 선언
        textView1.setText(mListViewItem.getArtist());                                    //!< 텍스트뷰에 아티스트 출력

        ImageView imageView = (ImageView)convertview.findViewById(R.id.lstalbum);        //!< 이미지뷰 선언
        //!< 앨범이미지 클래스 디파인에 저장하기
        //!<  이미지 size를 너무 많이 줄일 때 이미지 해상도가 떨어질 수 있으므로 해상도에 알맞게 resize 하는 것이 좋음.
        Define.ins().album = cAlbumImg.getAlbumImage(aMListViewAdapter, Integer.parseInt((mItem.get(position)).getAlbumid()), 170);
        //!< 디버그.
        System.out.println("앨범 ID str : " + (mItem.get(position)).getAlbumid());
        System.out.println("앨범 ID int : " + Integer.parseInt((mItem.get(position)).getAlbumid()));
        //!< 이미지뷰 setImageBitmap 디파인에저장한 앨범값 출력.
        imageView.setImageBitmap(Define.ins().album);


        return convertview;
    }

}
