package com.example.audiorecord.Audio.Button;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.audiorecord.Audio.Button.Define.DefineFileName;
import com.example.audiorecord.Audio.Common.Define;
import com.example.audiorecord.Audio.Dialog.RecordSaveDialog;
import com.example.audiorecord.Audio.Time.TimeThread;
import com.example.audiorecord.MainList.Activity.ListMainActivity;
import com.example.audiorecord.MainList.ListView.MListViewItem;
import com.example.audiorecord.R;

import java.util.ArrayList;


public class RecordButton {
    final private static String RECOREDE_FILE = "/sdcard/recorded.mp4";

    AppCompatActivity aRecordButton;        //!< Activity
    MediaRecorder recorder;                 //!< 미디어리코더
    TimeThread cTimeThread;                 //!< 시간 쓰레드

    Button recorderplaybutton;              //!< 녹음 시작버튼
    Button recorderstopbutton;              //!< 녹음 중지버튼
    Button recorddatabutton;                //!< 녹음저장목록 버튼

    RecordSaveDialog cRecordSaveDialog;     //!< 녹음 저장목록 다이얼로그

    /**
     * 생성자
     * @param appCompatActivity - Activity
     * @param timeThread        - 시간 쓰레드
     */
    public RecordButton(AppCompatActivity appCompatActivity, TimeThread timeThread) {

        aRecordButton = appCompatActivity;          //!< Activity
        cTimeThread = timeThread;                   //!< 시간 쓰레드
        /**
         * id값 연결
         */
        recorderplaybutton = (Button) aRecordButton.findViewById(R.id.recordplay_bt);       //!< 녹음시작 버튼
        recorderstopbutton = (Button) aRecordButton.findViewById(R.id.recordstop_bt);       //!< 녹음중지 버튼
        recorddatabutton = (Button) aRecordButton.findViewById(R.id.recordlv_bt1);          //!< 녹음저장목록 버튼

        cRecordSaveDialog = new RecordSaveDialog(aRecordButton, aRecordButton);             //!< 녹음저장목록 다이얼로그 객체생성
        setAllButton();                                                                     //!< 버튼 메서드

    }

    /**
     * 버튼 처리 메서드 시작 , 중지 , 저장목록확인하는 버튼 .
     */
    public void setAllButton() {

        //!< 녹음 시작 버튼
        recorderplaybutton.setOnClickListener(new View.OnClickListener() {          //!< 버튼 클릭 리스너
            @Override
            public void onClick(View view) {
                System.out.println("녹음시작버튼 눌림");                              //!< 디버그

                if(!DefineFileName.ins().bRecord) {                  //!< 디파인에 저장된 bRecord (boolean) 거짓이 아니면
                    //recorderplaybutton.setText("녹음시작");           //!< 녹음시작 텍스트 출력

                    cRecordSaveDialog.setCancelable(true);           //!< setCancelable를 true로 설정하면 뒤로가기 키와 배경터치를 통해 대화창을 취소할 수 있음
                    cRecordSaveDialog.show();                        //!< 다이얼로그 띄우기
                    cRecordSaveDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));  //!< 다이얼로그 테두리 둥글게만듬

                }
                else {
                    //recorderplaybutton.setText("녹음시작");           //!< 녹음시작 텍스트 출력
                    if (recorder != null) {                          //!< 미디어리코더가 null값이 아니면
                        recorder.stop();                             //!< 미디어리코더 중지
                        recorder.release();                          //!< 미디어리코더 해체
                        recorder = null;                             //!< 미디어리코더 null값 으로
                    }
                    recorder = new MediaRecorder();                  //!< 미디어리코더 객체생성

                    recorder.setAudioSource(MediaRecorder.AudioSource.MIC); // 오디오 소스 -> 마이크
                    recorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4); // 압축 형식 설정 MPEG_4형식
                    recorder.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT);   //< 오디오 인코더 0

                    String sRecordFileName = DefineFileName.ins().sFileName;        //!< 파일이름 변수값 디파인변수와 같음
                    String RECOREDE_FILEA = "/sdcard/recode/"+sRecordFileName+".mp4";   //!< 파일경로
                    recorder.setOutputFile(RECOREDE_FILEA);                             //!< 미디어리코더 파일경로에 저장
                    System.out.println("저장 리스트 : " + RECOREDE_FILEA);               //!< 디버그

                    try {
                        Toast.makeText(aRecordButton, "녹음 시작됨.", Toast.LENGTH_LONG).show(); //!< 토스트메시지
                        recorder.prepare();                            //!< 미디어리코더 준비
                        recorder.start();                              //!< 미디어리코더 시작

                    } catch (Exception ex) {
                        System.out.println("녹음 시작" + ex);           //!< 디버그
                    }
                    recorderplaybutton.setVisibility(View.GONE);       //!< 녹음시작버튼 보이게 설정
                    recorderstopbutton.setVisibility(View.VISIBLE);    //!< 녹음중지버튼 안보이게 설정
                    //!< 시간 쓰레드
                    if (Define.ins().STATS == Define.INIT) {           //!< 디파인 상태가 초기상태면
                        Define.ins().lBaseTime = SystemClock.elapsedRealtime(); //!< 디파인 IBaseTime변수에 부팅이후의 시간 리턴
                        cTimeThread.startTimer();                               //!< 시간 쓰레드 시작
                        Define.ins().STATS = Define.RUN;                        //!< 디파인 상태 작동상태로 변경
                    }
                }
            }
        });

        //!< 녹음 중지 버튼
        recorderstopbutton.setOnClickListener(new View.OnClickListener() {          //!< 버튼 클릭 리스너
            @Override
            public void onClick(View view) {
                System.out.println("녹음중지버튼 눌림");                                //!< 디버그
                System.out.println("Define.ins().STATS : " + Define.ins().STATS);     //!< 디버그
                //!< 시간 쓰레드
                if (Define.ins().STATS == Define.RUN) {                               //!< 디파인 상태가 작동상태이면
                    cTimeThread.pauseTimer();                                         //!< 시간쓰레드 중지
                    Define.ins().IPauseTime = SystemClock.elapsedRealtime();          //!< 디파인 IPauseTime 변수에 부팅이후의 시간 리턴
                    Define.ins().STATS = Define.PAUSE;                                //!< 디파인 상태 중지상태로 변경
                    System.out.println("Define.status change :" + Define.ins().STATS);      //!< 디버그
                }

                if (recorder == null) {                                                //!< 미디어리코더 null값이면
                    return;                                                            //!< 리턴
                }
                recorder.stop();                                                       //!< 미디어리코더 중지
                recorder.release();                                                    //!< 미디어리코더 해체
                recorder = null;                                                       //!< 미디어리코더 null값

                Toast.makeText(aRecordButton, "녹음 저장됨.", Toast.LENGTH_LONG).show(); //!< 토스트메시지

                recorderplaybutton.setVisibility(View.VISIBLE);                        //!< 녹음시작버튼 보이게 설정
                DefineFileName.ins().bRecord = false;                                  //!< 녹음이 중지되면서 bool값 false

            }
        });

        //!< 저장파일 목록 버튼
        recorddatabutton.setOnClickListener(new View.OnClickListener() {                //!< 버튼 클릭 리스너
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(aRecordButton, ListMainActivity.class);      //!< 인텐트 녹음Activity -> 리스트뷰 Activity
                aRecordButton.startActivity(intent);                                    //!< startActivity
            }
        });

    }

}
