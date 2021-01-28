package com.example.notepad.NoteList.ListView;

public class ListViewItem {

    /**
     * 리스트뷰 아이템
     * 리스트뷰 아이템 내부에 들어갈 내용을 저장하는 클래스
     * 각 뷰의 내용마다 set, get이 가능하도록 구현
     * */
    private String List;

    public void setList(String List){
        this.List = List;
    }

    public String getList(){
        return List;
    }
}
