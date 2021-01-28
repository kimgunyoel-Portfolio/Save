package com.example.audiomp3.MainList.ListView;

import java.io.Serializable;
                            //!< 멤버 변수들을 연속된 메모리에 할당된 형태인 직렬화 형태로 변경
public class MListViewItem implements Serializable {

    /**
     * 리스트뷰 아이템
     * 리스트뷰 아이템 내부에 들어갈 내용을 저장하는 클래스
     * 각 뷰의 내용마다 set, get이 가능하도록 구현
     */

    private String id;              //!< 음악 id
    private String albumid;         //!< 앨범 id
    private String title;           //!< 제목
    private String artist;          //!< 아티스트

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public void setAlbumid(String albumid){
        this.albumid = albumid;
    }

    public String getAlbumid(){
        return albumid;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }
    public String getArtist(){
        return artist;
    }


}
