package com.example.notepad.NoteList.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.notepad.R;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends BaseAdapter {

    private Context context;
    private List<String> list = new ArrayList<String>();
    private LayoutInflater inflate;
    private ListViewAdapter.ViewHolder viewHolder;

    //생성자
    public ListViewAdapter(List<String> list, Context mContext) {
        this.list = list;
        this.context = mContext;
        this.inflate = LayoutInflater.from(context);

    }

    //뷰홀더 심볼 생성?
    public class ViewHolder {
        public TextView textView;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();

        if(convertView == null) {
            convertView = inflate.inflate(R.layout.note_listview_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.textView = (TextView)convertView.findViewById(R.id.nltv1);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder)convertView.getTag();
        }
        viewHolder.textView.setText(list.get(position));


        return convertView;

    }


}
