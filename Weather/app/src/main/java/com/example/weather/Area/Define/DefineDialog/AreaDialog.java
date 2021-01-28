package com.example.weather.Area.Define.DefineDialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;

import com.example.weather.Area.Define.DefineArea.DefineCity;
import com.example.weather.Area.Dialog.City.CityDialog;
import com.example.weather.Area.Dialog.City.CityDialogInterface;
import com.example.weather.Area.Dialog.Province.ProvinceDialog;
import com.example.weather.Area.Dialog.Province.ProvinceDialogInterface;
import com.example.weather.Area.FileIOStream.FileIOStreamCheckDir;
import com.example.weather.Area.FileIOStream.FileIOStreamCheckFile;
import com.example.weather.Area.FileIOStream.FileIOStreamWrite;
import com.example.weather.GPS.Define.DefineDialog.DefineDialog;
import com.example.weather.R;

import java.util.List;

public class AreaDialog extends Dialog {

    FileIOStreamCheckDir cFileIOStreamCheckDir;     //!< 파일입출력 파일생성
    FileIOStreamCheckFile cFileIOStreamCheckFile;   //!< 파일입출력 파일경로
    FileIOStreamWrite cFileIOStreamWrite;           //!< 파일입출력 파일쓰기

    private Context mContext;   //!< 컨텍스트

    ProvinceDialog provinceDialog;  //!< 특별광역시, 도 다이얼로그
    CityDialog cityDialog;          //!< 시 , 군 다이얼로그


    /**
     * 생성자
     * @param context
     */
    public AreaDialog(@NonNull Context context) {
        super(context);
        mContext = context; //!< 컨텍스트 연결
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area_dialog);

        setButton();    //!< 다이얼로그 버튼처리 메서드

    }

    /**
     * 다이얼로그 버튼처리 메서드
     */
    public void setButton() {
        final Button button1 = (Button)findViewById(R.id.adbt1);    //!< 광역시 / 도 버튼 id값 연결
        final Button button2 = (Button)findViewById(R.id.adbt2);    //!< 시 / 군 버튼 id값 연결
        final Button button3 = (Button)findViewById(R.id.adbt3);    //!< 저장 버튼 id값 연결

        button1.setOnClickListener(new View.OnClickListener() { //!< 광역시 / 도 버튼 클릭 리스너
            @Override
            public void onClick(View v) {
                System.out.println("adbt1 눌림"); //!< 디버그
                provinceDialog = new ProvinceDialog(mContext);  //!< 특별광역시, 도 다이얼로그 객체생성
                provinceDialog.setCancelable(true);             //!< 뒤로가기버튼 누르면 꺼짐
                provinceDialog.setDialogListener(new ProvinceDialogInterface() {    //!< 다이얼로그 리스너
                    @Override
                    public void onPositiveClicked(String area) {
                        button1.setText(area);                  //!< 광역시 / 도 버튼 누르면 area 출력
                        DefineDialog.ins().sProvince = area;    //!< 디파인 지역변수상자에 area값 저장
                        System.out.println("sProvince : " + DefineDialog.ins().sProvince);  //!< 디버그
                    }

                });

                provinceDialog.show();  //!< 다이얼로그 출력
            }
        });

        button2.setOnClickListener(new View.OnClickListener() { //!< 시 / 군 버튼 클릭 리스너
            @Override
            public void onClick(View v) {
                System.out.println("adbt2 눌림");         //!< 디버그
                cityDialog = new CityDialog(mContext);   //!<  시/군 다이얼로그 객체생성
                cityDialog.setCancelable(true);          //!< 뒤로가기버튼 누르면 꺼짐
                cityDialog.setCityDialogInterface(new CityDialogInterface() {   //!< 다이얼로그 인터페이스 리스너
                    @Override
                    public void onPositiveClicked(String area) {        //!< 다이얼로그 값들 들고오기
                        System.out.println("돌려받은값 : " + area);  //!< 디버그
                        button2.setText(area);          //!<  시 / 군 버튼 누르면 sSelectArea출력

                    }

                });
                cityDialog.show();  //!< 다이얼로그 출력

            }
        });

        button3.setOnClickListener(new View.OnClickListener() { //!< 저장버튼 클릭 리스너
            @Override
            public void onClick(View v) {
                System.out.println("저장버튼 눌림");  //!< 디버그
                DefineCity.ins().sSelectArea = button2.getText().toString();    //!< 디파인 변수에 시/군 정보 저장
                //!< #1 경로확인
                cFileIOStreamCheckDir = new FileIOStreamCheckDir(mContext);
                cFileIOStreamCheckDir.checkDir();

                //!< #2 파일확인 후 파일이 없을경우 파일생성
                cFileIOStreamCheckFile = new FileIOStreamCheckFile(mContext);
                cFileIOStreamCheckFile.checkFile("area", "서울특별시");

                //!< #3 파일에 문자 쓰기
                cFileIOStreamWrite = new FileIOStreamWrite(mContext);
                cFileIOStreamWrite.writeData("area", DefineCity.ins().sSelectArea);
                System.out.println("sSelectArea : " + DefineCity.ins().sSelectArea);
                dismiss();

            }
        });

    }

}
