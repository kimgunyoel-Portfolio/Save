package com.example.weather.Area.Dialog.City;

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

import com.example.weather.GPS.Define.DefineDialog.DefineDialog;
import com.example.weather.R;

import java.util.ArrayList;
import java.util.List;

public class CityDialog extends Dialog {

    private Context mContext;   //!< 컨텍스트

    List<String> list = new ArrayList<String>();    //!< 리스트변수 어레이리스트형태로  객체생성
    ListView listView;      //!< 리스트뷰
    EditText editText;      //!< 에딧텍스트
    CityAdapter cityAdapter;//!< 시/군 어댑터
    ArrayList<String> arrayList;//!< 어레이리스트


    CityDialogInterface cityDialogInterface;    //인터페이스선언

    /**
     * 다이얼로그에 포지션값들 저장하기위함
     * @param cityDialogInterface
     */
    public void setCityDialogInterface(CityDialogInterface cityDialogInterface) {
        this.cityDialogInterface = cityDialogInterface;
    }

    /**
     * 생성자
     * @param context
     */
    public CityDialog(@NonNull Context context) {
        super(context);
        mContext = context; //!< 컨텍스트 연결
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_dialog);

        CitysetButton();    //!< 시티 리스트 메서드 연결

        //시티 다이얼로그 텍스트 리스트 선언
        editText = (EditText)findViewById(R.id.cityet1);    //!< 에딧텍스트 id값 연결
        listView = (ListView)findViewById(R.id.citylv1);    //!< 리스트뷰 id값 연결

        arrayList = new ArrayList<String>();    //!<arrayList 객체생성
        arrayList.addAll(list);                 //!< arrayList에 리스트값 저장
        cityAdapter = new CityAdapter(list, mContext);  //!< 시/군 어댑터 객체생성 (리스트, 컨텍스트)
        listView.setAdapter(cityAdapter);       //!< 리스트뷰 어댑터 연결

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { //!< 리스트뷰 클릭리스너
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("리스트뷰 클릭 : " + list.get(position));  //!< 디버그
                cityDialogInterface.onPositiveClicked(list.get(position));  //!< 리스트뷰에있는 값들 클릭하여 저장하기 위함
                dismiss();
            }
        });

        editText.addTextChangedListener(new TextWatcher() { //!< 에딧텍스트
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                System.out.println("afterTextChanged in()...");

                String text = editText.getText().toString();    //!< 에딧텍스트 스트링형태로 저장
                // 서칭 텍스트
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
            list.addAll(arrayList);
            System.out.println("list11 : " + list);
        }
        // 문자 입력을 할때..
        else
        {
            // 리스트의 모든 데이터를 검색한다.
            for(int i = 0;i < arrayList.size(); i++)
            {
                // arraylist의 모든 데이터에 입력받은 단어(charText)가 포함되어 있으면 true를 반환한다.
                if (arrayList.get(i).toLowerCase().contains(charText))
                {
                    // 검색된 데이터를 리스트에 추가한다.
                    list.add(arrayList.get(i));
                }
            }
        }
        // 리스트 데이터가 변경되었으므로 아답터를 갱신하여 검색된 데이터를 화면에 보여준다.
        cityAdapter.notifyDataSetChanged();
    }


    //https://librewiki.net/wiki/%EB%8C%80%ED%95%9C%EB%AF%BC%EA%B5%AD/%ED%96%89%EC%A0%95%EA%B5%AC%EC%97%AD

    /**
     *  특별자치 도 , 시 가 눌리면 리스트뷰 출력하는 기능
     */
    public void CitysetButton(){
        list.clear();
        if(DefineDialog.ins().sProvince.equals("서울특별시")){
            list.add("서울특별시");
        }

        else if(DefineDialog.ins().sProvince.equals("세종특별자치시")){
            list.add("세종특별자치시");
        }

        else if(DefineDialog.ins().sProvince.equals("인천광역시")){
            list.add("인천광역시");
        }

        else if(DefineDialog.ins().sProvince.equals("대전광역시")){
            list.add("대전광역시");
        }

        else if(DefineDialog.ins().sProvince.equals("대구광역시")){
            list.add("대구광역시");
        }

        else if(DefineDialog.ins().sProvince.equals("울산광역시")){
            list.add("울산광역시");
        }

        else if(DefineDialog.ins().sProvince.equals("부산광역시")){
            list.add("부산광역시");
        }

        else if(DefineDialog.ins().sProvince.equals("광주광역시")){
            list.add("광주광역시");
        }

        if(DefineDialog.ins().sProvince.equals("제주특별자치도")){
            list.add("제주특별자치도");
        }

        else if(DefineDialog.ins().sProvince.equals("경기도")){
            list.add("가평군");
            list.add("양평군");
            list.add("연천군");
            list.add("고양시");
            list.add("과천시");
            list.add("광명시");
            list.add("(경기)광주시");
            list.add("구리시");
            list.add("군포시");
            list.add("김포시");
            list.add("남양주시");
            list.add("동두천시");
            list.add("부천시");
            list.add("성남시");
            list.add("수원시");
            list.add("시흥시");
            list.add("안산시");
            list.add("안성시");
            list.add("안양시");
            list.add("양주시");
            list.add("여주시");
            list.add("오산시");
            list.add("용인시");
            list.add("의왕시");
            list.add("의정부시");
            list.add("이천시");
            list.add("파주시");
            list.add("평택시");
            list.add("포천시");
            list.add("하남시");
            list.add("화성시");
        }

        else if(DefineDialog.ins().sProvince.equals("강원도")){
            list.add("강릉시");
            list.add("동해시");
            list.add("삼척시");
            list.add("속초시");
            list.add("원주시");
            list.add("춘천시");
            list.add("태백시");
            list.add("(강원도)고성군");
            list.add("양구군");
            list.add("양양군");
            list.add("영월군");
            list.add("인제군");
            list.add("정선군");

        }

        if(DefineDialog.ins().sProvince.equals("충청북도")){
            list.add("괴산군");
            list.add("단양군");
            list.add("보은군");
            list.add("영동군");
            list.add("옥천군");
            list.add("음성군");
            list.add("증평군");
            list.add("진천군");
            list.add("제천시");
            list.add("청주시");
            list.add("충주시");
        }

        if(DefineDialog.ins().sProvince.equals("충청남도")){
            list.add("공주시");
            list.add("계룡시");
            list.add("논산시");
            list.add("당진시");
            list.add("보령시");
            list.add("서산시");
            list.add("아산시");
            list.add("천안시");
            list.add("금산군");
            list.add("부여군");
            list.add("서천군");
            list.add("예산군");
            list.add("청양군");
            list.add("태안군");
            list.add("홍성군");
        }

        if(DefineDialog.ins().sProvince.equals("경상북도")){
            list.add("경산시");
            list.add("경주시");
            list.add("구미시");
            list.add("김천시");
            list.add("문경시");
            list.add("상주시");
            list.add("안동시");
            list.add("영주시");
            list.add("영천시");
            list.add("포항시");
            list.add("고령군");
            list.add("군위군");
            list.add("봉화군");
            list.add("성주군");
            list.add("영덕군");
            list.add("영양군");
            list.add("예천군");
            list.add("울릉군");
            list.add("울진군");
            list.add("의성군");
            list.add("청도군");
            list.add("청송군");
            list.add("칠곡군");
        }

        if(DefineDialog.ins().sProvince.equals("경상남도")){
            list.add("거제시");
            list.add("김해시");
            list.add("밀양시");
            list.add("사천시");
            list.add("양산시");
            list.add("진주시");
            list.add("창원시");
            list.add("통영시");
            list.add("거창군");
            list.add("(경남)고성군");
            list.add("남해군");
            list.add("산청군");
            list.add("의령군");
            list.add("창녕군");
            list.add("하동군");
            list.add("함안군");
            list.add("함양군");
            list.add("합천군");
        }

        if(DefineDialog.ins().sProvince.equals("전라북도")){
            list.add("군산시");
            list.add("김제시");
            list.add("남원시");
            list.add("익산시");
            list.add("전주시");
            list.add("정읍시");
            list.add("고창군");
            list.add("무주군");
            list.add("부안군");
            list.add("순창군");
            list.add("완주군");
            list.add("임실군");
            list.add("장수군");
            list.add("진안군");
        }

        if(DefineDialog.ins().sProvince.equals("전라남도")){
            list.add("광양시");
            list.add("목포시");
            list.add("나주시");
            list.add("순천시");
            list.add("여수시");
            list.add("강진군");
            list.add("고흥군");
            list.add("곡성군");
            list.add("구례군");
            list.add("담양군");
            list.add("무안군");
            list.add("보성군");
            list.add("신안군");
            list.add("영광군");
            list.add("영암군");
            list.add("완도군");
            list.add("장성군");
            list.add("장흥군");
            list.add("진도군");
            list.add("함평군");
            list.add("해남군");
            list.add("화순군");
        }

    }
}
