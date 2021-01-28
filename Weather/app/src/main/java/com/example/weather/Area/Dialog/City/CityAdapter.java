package com.example.weather.Area.Dialog.City;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.weather.R;

import java.util.ArrayList;
import java.util.List;

public class CityAdapter extends BaseAdapter {

    private Context context;            //!<컨텍스트
    private List<String> list ;         //!< 리스트
    private LayoutInflater inflate;     //!< 레이아웃인플레이터
    private CityAdapter.ViewHolder viewHolder;  //!< 뷰홀더

    /**
     * 생성자
     * @param list  - 리스트
     * @param mContext - 컨텍스트
     */
    public CityAdapter(List<String> list, Context mContext) {
        this.list = list;   //!< 리스트
        this.context = mContext;    //!< 컨텍스트
        this.inflate = LayoutInflater.from(context);    //!< 레이아웃인플레이터 컨텍스트연결
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();

        if(convertView == null) {   //!< 컨버트뷰가 NULL일때
            convertView = inflate.inflate(R.layout.city_listview_item, parent, false);  //!< 컨버트뷰 리트브
            viewHolder = new ViewHolder();  //!< 뷰홀더 객체생성
            viewHolder.textView = (TextView)convertView.findViewById(R.id.cltv1);   //!< 텍스트뷰 ID값 연결
            convertView.setTag(viewHolder); //!< 뷰홀더 settag
        }else {
            viewHolder = (ViewHolder)convertView.getTag();  //!< 컨버트뷰가 NULL이 아니면 뷰홀더 gettag
        }
        viewHolder.textView.setText(list.get(position));    //!< 리스트 포지션에맞게 출력
        viewHolder.textView.setTextColor(Color.WHITE);      //!< 텍스트 컬러 흰색
        return convertView;                                 //!< 리턴 컨버트뷰
    }

    public class ViewHolder {
        public TextView textView;   //!<
    }

}
