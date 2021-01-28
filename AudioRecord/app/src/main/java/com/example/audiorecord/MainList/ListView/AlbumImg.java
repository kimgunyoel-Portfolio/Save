package com.example.audiorecord.MainList.ListView;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

import com.example.audiorecord.Common.Define;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AlbumImg {

        public static final BitmapFactory.Options options = new BitmapFactory.Options();            //!< 비트맵팩토리옵션 객체생성

        public static Bitmap getAlbumImage(Context context, int album_id, int MAX_IMAGE_SIZE) {     //!< 비트맵 사용해서 앨범 이미지 가져옴

            ContentResolver res = context.getContentResolver();                                     //!< 컨텐트리졸버
            Uri uri = Uri.parse("content://media/external/audio/albumart/" + album_id);             //!< 음악앨범 경로
            if (uri != null) {
                ParcelFileDescriptor fd = null;
                try {
                    fd = res.openFileDescriptor(uri, "r");


                    //!<inJustDecodeBounds값이 true로 설정되면 decoder가 bitmap object에 대해 메모리를 할당하지 않고, 따라서 bitmap을 반환하지도 않는다.
                    //!< 이미지의 크기를 포함한 다양한 정보들을 얻어올 수 있다.
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFileDescriptor(fd.getFileDescriptor(), null, options);
                    int scale = 0;
                    if (options.outHeight > MAX_IMAGE_SIZE || options.outWidth > MAX_IMAGE_SIZE) {
                        scale = (int) Math.pow(2, (int) Math.round(Math.log(MAX_IMAGE_SIZE / (double) Math.max(options.outHeight, options.outWidth)) / Math.log(0.5)));
                    }
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = scale;
                    
                    Bitmap bitmap = BitmapFactory.decodeFileDescriptor(
                            fd.getFileDescriptor(), null, options);

                    if (bitmap != null) {
                        // finally rescale to exactly the size we need
                        if (options.outWidth != MAX_IMAGE_SIZE || options.outHeight != MAX_IMAGE_SIZE) {
                            Bitmap tmp = Bitmap.createScaledBitmap(bitmap, MAX_IMAGE_SIZE, MAX_IMAGE_SIZE, true);
                            bitmap.recycle();
                            bitmap = tmp;
                            System.out.println("result : " + tmp.toString());
                            Define.ins().album = tmp;
                        }
                    }

                    return bitmap;
                } catch (FileNotFoundException e) {
                } finally {
                    try {
                        if (fd != null)
                            fd.close();
                    } catch (IOException e) {
                    }
                }
            }
            return null;
        }
    }
