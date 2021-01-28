package com.example.weather.Area.Dialog.Province;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import com.example.weather.R;

import java.util.ArrayList;
import java.util.List;

public class ProvinceDialog extends Dialog {

    private Context mContext;


    List<String> list = new ArrayList<String>();
    ListView listView;
    EditText editText;
    ProvinceAdapter provinceAdapter;
    ArrayList<String> arraylist;

    //CustomDialogListener customDialogListener;
    ProvinceDialogInterface provinceDialogInterface;

    public void setDialogListener(ProvinceDialogInterface provinceDialogInterface) {
        this.provinceDialogInterface = provinceDialogInterface;
    }

    public ProvinceDialog(@NonNull Context context) {
        super(context);
        mContext = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.province_dialog);

        ProvincesetButton();

        editText = (EditText)findViewById(R.id.provinceet1);
        listView = (ListView)findViewById(R.id.provincelv1);

        arraylist = new ArrayList<String>();
        arraylist.addAll(list);
        provinceAdapter = new ProvinceAdapter(list, mContext);
        listView.setAdapter(provinceAdapter);

        //선생님
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("리스트뷰 클릭 : " + list.get(position));
                provinceDialogInterface.onPositiveClicked(list.get(position));
                dismiss();
            }
        });


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                System.out.println("afterTextChanged in()...");

                String text = editText.getText().toString();
                search(text);
            }
        });

    }

    public  void search(String charText) {
        System.out.println("Search in ()...");
        // 문자 입력시마다 리스트를 지우고 새로 뿌려준다.
        list.clear();

        // 문자 입력이 없을때는 모든 데이터를 보여준다.
        if (charText.length() == 0) {
            list.addAll(arraylist);
            System.out.println("list11 : " + list);
        }
        // 문자 입력을 할때..
        else
        {
            // 리스트의 모든 데이터를 검색한다.
            for(int i = 0;i < arraylist.size(); i++)
            {
                // arraylist의 모든 데이터에 입력받은 단어(charText)가 포함되어 있으면 true를 반환한다.
                if (arraylist.get(i).toLowerCase().contains(charText))
                {
                    // 검색된 데이터를 리스트에 추가한다.
                    list.add(arraylist.get(i));
                }
            }
        }
        // 리스트 데이터가 변경되었으므로 아답터를 갱신하여 검색된 데이터를 화면에 보여준다.
        provinceAdapter.notifyDataSetChanged();
    }

    public void ProvincesetButton(){
        list.add("서울특별시");
        list.add("세종특별자치시");
        list.add("인천광역시");
        list.add("대전광역시");
        list.add("대구광역시");
        list.add("울산광역시");
        list.add("부산광역시");
        list.add("광주광역시");
        list.add("경기도");
        list.add("강원도");
        list.add("충청북도");
        list.add("충청남도");
        list.add("경상북도");
        list.add("경상남도");
        list.add("전라북도");
        list.add("전라남도");
        list.add("제주특별자치도");

    }
}
