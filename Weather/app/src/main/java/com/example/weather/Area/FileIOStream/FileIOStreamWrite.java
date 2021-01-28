package com.example.weather.Area.FileIOStream;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by 이승환 on 2017-12-20.
 */

public class FileIOStreamWrite {
    Context aFileIOStreamWrite;
    FileIOStreamRead cFileIOStreamRead;

    public FileIOStreamWrite(Context fragmentActivity) {
        aFileIOStreamWrite = fragmentActivity;
        cFileIOStreamRead = new FileIOStreamRead(aFileIOStreamWrite);

    }

    /**
     * @since 2017-11-28
     * @exp 파일에 텍스트 쓰기
     * @param fileName
     * @param writeData
     */
    public void writeData(String fileName, String writeData) {
        String sDataFilePath = aFileIOStreamWrite.getFilesDir().getAbsolutePath();
        File fDataFile = new File(sDataFilePath + fileName);
        System.out.println("fileName : " + fileName);
        System.out.println("path : " + fDataFile.toString());
        System.out.println("WriteData : " + writeData);

        if(fDataFile.exists()) {
            try{
                FileOutputStream fosDataFile = new FileOutputStream(fDataFile, false);
                fosDataFile.write(writeData.getBytes());
                fosDataFile.close();
                System.out.println("파일 쓰기 성공");
                cFileIOStreamRead.readData(fileName);
            }catch(IOException e) {
                e.printStackTrace();

            }

        }



    }
}
