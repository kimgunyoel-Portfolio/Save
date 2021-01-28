package com.example.weather.Area.Dialog.Province;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.weather.R;

import java.util.List;

public class ProvinceAdapter extends BaseAdapter {

    private Context context;
    private List<String> list;
    private LayoutInflater inflate;
    private ViewHolder viewHolder;


    public ProvinceAdapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
        this.inflate = LayoutInflater.from(context);
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

        if (convertView == null) {
            convertView = inflate.inflate(R.layout.listview_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.textView = (TextView)convertView.findViewById(R.id.tv1);
            convertView.setTag(viewHolder);

        }
        else {
            viewHolder = (ViewHolder)convertView.getTag();
        }

        viewHolder.textView.setText(list.get(position));
        viewHolder.textView.setTextColor(Color.WHITE);
        return convertView;
    }

    class ViewHolder {
        public TextView textView;
    }
}
