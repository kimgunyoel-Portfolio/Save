package com.example.weather.Area.FileIOStream;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import java.io.File;

/**
 * Created by 이승환 on 2017-12-20.
 */

/**
 * 소스코드 사용 시 FileIOStraea 패키지를 그대로 복사하는것을 추천한다.
 *
 * 파일입출력 순서
 * 안드로이드에서 파일입출력을 하기위해서는 경로, 파일을 확인 후 읽기 쓰기가 가능하다.
 * 1. 경로 확인 클래스 - FileIOStreamCheckDir
 * 2. 파일 확인 클래스 - FileIOStreamCheckFile
 * 3. 파일 쓰기 클래스 - FileIOStreamWrite
 * 4. 파일 읽기 클래스 - FileIOStreamRead
 */

public class FileIOStreamCheckDir {
    Context aFileIOStreamCheckDir;

    public FileIOStreamCheckDir(Context fragmentActivity) {
        aFileIOStreamCheckDir = fragmentActivity;
    }

    /**
     * @since	2017 - 10 - 27
     * @author - sweetycat-
     * @param
     * @exp    파일입출력을 위한 기본 폴더 여부 확인 기본 폴더가 없을 경우 생성한다.
     */
    public void checkDir() {
        String sDirPath = aFileIOStreamCheckDir.getFilesDir().getAbsolutePath();
        //        File fFile = new File(sDirPath);
        //
        //        if(!fFile.exists()) {
        //            fFile.mkdirs();
        //            System.out.println("기본폴더생성");
        //        }
        //
        //        if(fFile.exists()) {
        //            System.out.println("폴더있음");
        //
        //        }
        //
        //        //!< 테스트용
        //!< 폴더 삭제시 아래 주석제거 후 컴파일
        //fFile.delete();
        //System.out.println("폴더삭제");

    }

}
