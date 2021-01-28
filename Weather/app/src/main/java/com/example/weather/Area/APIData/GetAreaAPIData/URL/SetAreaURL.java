package com.example.weather.Area.APIData.GetAreaAPIData.URL;

import com.example.weather.Area.Define.DefineArea.DefineCity;

public class SetAreaURL {

    /**
     * 대한민국 시, 군 URL
     * @param area
     * @return
     */
    public String getURL(String area) {
        System.out.println("area111 : " + area);    //!< 디버그

        /**
         * 전라남도
         */
        if(area.equals("광양시")) {
            return DefineCity.ins().sURL_Gwangyang;
        }

        else if(area.equals("목포시")) {
            return DefineCity.ins().sURL_Mokpo;
        }

        else if(area.equals("나주시")) {
            return DefineCity.ins().sURL_Naju;
        }

        else if(area.equals("순천시")) {
            return DefineCity.ins().sURL_Suncheon;
        }

        else if(area.equals("여수시")) {
            return DefineCity.ins().sURL_Yeosu;
        }

        else if(area.equals("곡성군")) {
            return DefineCity.ins().sURL_Gokseong;
        }

        else if(area.equals("강진군")) {
            return DefineCity.ins().sURL_Gangjin;
        }

        else if(area.equals("고흥군")) {
            return DefineCity.ins().sURL_Goheung;
        }

        else if(area.equals("구례군")) {
            return DefineCity.ins().sURL_Gurye;
        }

        else if(area.equals("담양군")) {
            return DefineCity.ins().sURL_Damyang;
        }

        else if(area.equals("무안군")) {
            return DefineCity.ins().sURL_Muan;
        }

        else if(area.equals("보성군")) {
            return DefineCity.ins().sURL_Boseong;
        }

        else if(area.equals("신안군")) {
            return DefineCity.ins().sURL_Sinan;
        }

        else if(area.equals("영광군")) {
            return DefineCity.ins().sURL_Yeonggwang;
        }

        else if(area.equals("영암군")) {
            return DefineCity.ins().sURL_Yeongam;
        }

        else if(area.equals("영암군")) {
            return DefineCity.ins().sURL_Yeongam;
        }

        else if(area.equals("완도군")) {
            return DefineCity.ins().sURL_Wando;
        }

        else if(area.equals("장성군")) {
            return DefineCity.ins().sURL_Jangseong;
        }

        else if(area.equals("장흥군")) {
            return DefineCity.ins().sURL_Jangheung;
        }

        else if(area.equals("진도군")) {
            return DefineCity.ins().sURL_jindo;
        }

        else if(area.equals("함평군")) {
            return DefineCity.ins().sURL_Hampyeong;
        }

        else if(area.equals("해남군")) {
            return DefineCity.ins().sURL_Haenam;
        }

        else if(area.equals("화순군")) {
            return DefineCity.ins().sURL_Hwasun;
        }

        /**
         * 전라북도
         */
        else if(area.equals("군산시")) {
            return DefineCity.ins().sURL_Gunsan;
        }

        else if(area.equals("김제시")) {
            return DefineCity.ins().sURL_Gimje;
        }

        else if(area.equals("남원시")) {
            return DefineCity.ins().sURL_Namwon;
        }

        else if(area.equals("익산시")) {
            return DefineCity.ins().sURL_Iksan;
        }

        else if(area.equals("전주시")) {
            return DefineCity.ins().sURL_Jeonju;
        }

        else if(area.equals("전주시")) {
            return DefineCity.ins().sURL_Jeonju;
        }

        else if(area.equals("정읍시")) {
            return DefineCity.ins().sURL_Jeongeup;
        }

        else if(area.equals("고창군")) {
            return DefineCity.ins().sURL_Gochang;
        }

        else if(area.equals("무주군")) {
            return DefineCity.ins().sURL_Muju;
        }

        else if(area.equals("부안군")) {
            return DefineCity.ins().sURL_Buan;
        }

        else if(area.equals("장수군")) {
            return DefineCity.ins().sURL_Jangsu;
        }

        else if(area.equals("순창군")) {
            return DefineCity.ins().sURL_Sunchang;
        }

        else if(area.equals("완주군")) {
            return DefineCity.ins().sURL_Wanju;
        }

        else if(area.equals("임실군")) {
            return DefineCity.ins().sURL_Imsil;
        }

        else if(area.equals("진안군")) {
            return DefineCity.ins().sURL_Jinan;
        }

        /**
         * 경상남도
         */
        else if(area.equals("거제시")) {
            return DefineCity.ins().sURL_Geoje;
        }

        else if(area.equals("김해시")) {
            return DefineCity.ins().sURL_Gimhae;
        }

        else if(area.equals("밀양시")) {
            return DefineCity.ins().sURL_Miryang;
        }

        else if(area.equals("사천시")) {
            return DefineCity.ins().sURL_Sichuan;
        }

        else if(area.equals("양산시")) {
            return DefineCity.ins().sURL_Yangsan;
        }

        else if(area.equals("진주시")) {
            return DefineCity.ins().sURL_Jinju;
        }

        else if(area.equals("창원시")) {
            return DefineCity.ins().sURL_Changwon;
        }

        else if(area.equals("통영시")) {
            return DefineCity.ins().sURL_Tongyeong;
        }

        else if(area.equals("거창군")) {
            return DefineCity.ins().sURL_Geochang;
        }

        else if(area.equals("(경남)고성군")) {
            return DefineCity.ins().sURL_Goseong;
        }

        else if(area.equals("산청군")) {
            return DefineCity.ins().sURL_Sancheong;
        }

        else if(area.equals("남해군")) {
            return DefineCity.ins().sURL_Namhae;
        }

        else if(area.equals("의령군")) {
            return DefineCity.ins().sURL_Uiryeong;
        }

        else if(area.equals("창녕군")) {
            return DefineCity.ins().sURL_Changnyeong;
        }

        else if(area.equals("합천군")) {
            return DefineCity.ins().sURL_Hapcheon;
        }

        else if(area.equals("하동군")) {
            return DefineCity.ins().sURL_Hadong;
        }

        else if(area.equals("함안군")) {
            return DefineCity.ins().sURL_Haman;
        }

        else if(area.equals("함양군")) {
            return DefineCity.ins().sURL_Hamyang;
        }

        /**
         * 경상북도
         */
        else if(area.equals("경산시")) {
            return DefineCity.ins().sURL_Gyeongsan;
        }

        else if(area.equals("경주시")) {
            return DefineCity.ins().sURL_Gyeongju;
        }

        else if(area.equals("구미시")) {
            return DefineCity.ins().sURL_Gumi;
        }

        else if(area.equals("김천시")) {
            return DefineCity.ins().sURL_Gimcheon;
        }

        else if(area.equals("문경시")) {
            return DefineCity.ins().sURL_Mungyeong;
        }

        else if(area.equals("상주시")) {
            return DefineCity.ins().sURL_Sangju;
        }

        else if(area.equals("안동시")) {
            return DefineCity.ins().sURL_Andong;
        }

        else if(area.equals("영주시")) {
            return DefineCity.ins().sURL_yeongju;
        }

        else if(area.equals("영천시")) {
            return DefineCity.ins().sURL_Yeongcheon;
        }

        else if(area.equals("포항시")) {
            return DefineCity.ins().sURL_Pohang;
        }

        else if(area.equals("고령군")) {
            return DefineCity.ins().sURL_golyeong;
        }

        else if(area.equals("봉화군")) {
            return DefineCity.ins().sURL_Bonghwa;
        }

        else if(area.equals("성주군")) {
            return DefineCity.ins().sURL_Seongju;
        }

        else if(area.equals("영덕군")) {
            return DefineCity.ins().sURL_Yeongdeok;
        }

        else if(area.equals("영양군")) {
            return DefineCity.ins().sURL_Yeongyang;
        }

        else if(area.equals("예천군")) {
            return DefineCity.ins().sURL_Yecheon;
        }

        else if(area.equals("울릉군")) {
            return DefineCity.ins().sURL_Ulleung;
        }

        else if(area.equals("울진군")) {
            return DefineCity.ins().sURL_Uljin;
        }

        else if(area.equals("의성군")) {
            return DefineCity.ins().sURL_Uiseong;
        }

        else if(area.equals("청도군")) {
            return DefineCity.ins().sURL_Cheongdo;
        }

        else if(area.equals("청송군")) {
            return DefineCity.ins().sURL_Cheongsong;
        }

        else if(area.equals("칠곡군")) {
            return DefineCity.ins().sURL_Chilgok;
        }

        else if(area.equals("군위군")) {
            return DefineCity.ins().sURL_Gunwi;
        }

        /**
         * 강원도
         */
        else if(area.equals("강릉시")) {
            return DefineCity.ins().sURL_Gangneung;
        }

        else if(area.equals("동해시")) {
            return DefineCity.ins().sURL_donghae;
        }

        else if(area.equals("삼척시")) {
            return DefineCity.ins().sURL_Samcheok;
        }

        else if(area.equals("속초시")) {
            return DefineCity.ins().sURL_Sokcho;
        }

        else if(area.equals("원주시")) {
            return DefineCity.ins().sURL_wonju;
        }

        else if(area.equals("춘천시")) {
            return DefineCity.ins().sURL_chuncheon;
        }

        else if(area.equals("태백시")) {
            return DefineCity.ins().sURL_Taebaek;
        }

        else if(area.equals("(강원도)고성군")) {
            return DefineCity.ins().sURL_Goseong1;
        }

        else if(area.equals("양구군")) {
            return DefineCity.ins().sURL_Yanggu;
        }

        else if(area.equals("양양군")) {
            return DefineCity.ins().sURL_Yangyang;
        }

        else if(area.equals("영월군")) {
            return DefineCity.ins().sURL_Yeongwol;
        }

        else if(area.equals("인제군")) {
            return DefineCity.ins().sURL_Inje;
        }

        else if(area.equals("정선군")) {
            return DefineCity.ins().sURL_Jeongseon;
        }

        else if(area.equals("철원군")) {
            return DefineCity.ins().sURL_Cheolwon;
        }

        else if(area.equals("평창군")) {
            return DefineCity.ins().sURL_Pyeongchang;
        }

        else if(area.equals("홍천군")) {
            return DefineCity.ins().sURL_Hongcheon;
        }

        else if(area.equals("화천군")) {
            return DefineCity.ins().sURL_Hwacheon;
        }

        else if(area.equals("횡성군")) {
            return DefineCity.ins().sURL_Hoengseong;
        }

        /**
         * 충청북도
         */
        else if(area.equals("제천시")) {
            return DefineCity.ins().sURL_Jecheon;
        }

        else if(area.equals("청주시")) {
            return DefineCity.ins().sURL_cheongju;
        }

        else if(area.equals("충주시")) {
            return DefineCity.ins().sURL_Chungju;
        }

        else if(area.equals("괴산군")) {
            return DefineCity.ins().sURL_Goesan;
        }

        else if(area.equals("단양군")) {
            return DefineCity.ins().sURL_Danyang;
        }

        else if(area.equals("보은군")) {
            return DefineCity.ins().sURL_Boeun;
        }

        else if(area.equals("영동군")) {
            return DefineCity.ins().sURL_Yeongdong;
        }

        else if(area.equals("옥천군")) {
            return DefineCity.ins().sURL_Okcheon;
        }

        else if(area.equals("음성군")) {
            return DefineCity.ins().sURL_eumseong;
        }

        else if(area.equals("증평군")) {
            return DefineCity.ins().sURL_jeungpyeong;
        }

        else if(area.equals("진천군")) {
            return DefineCity.ins().sURL_Jincheon;
        }

        /**
         * 충청남도
         */
        else if(area.equals("공주시")) {
            return DefineCity.ins().sURL_gongju;
        }

        else if(area.equals("계룡시")) {
            return DefineCity.ins().sURL_Gyeryong;
        }

        else if(area.equals("논산시")) {
            return DefineCity.ins().sURL_Nonsan;
        }

        else if(area.equals("당진시")) {
            return DefineCity.ins().sURL_Dangjin;
        }

        else if(area.equals("보령시")) {
            return DefineCity.ins().sURL_Boryeong;
        }

        else if(area.equals("천안시")) {
            return DefineCity.ins().sURL_Cheonan;
        }

        else if(area.equals("서산시")) {
            return DefineCity.ins().sURL_Seosan;
        }

        else if(area.equals("아산시")) {
            return DefineCity.ins().sURL_Asan;
        }

        else if(area.equals("금산군")) {
            return DefineCity.ins().sURL_Geumsan;
        }

        else if(area.equals("부여군")) {
            return DefineCity.ins().sURL_buyeo;
        }

        else if(area.equals("서천군")) {
            return DefineCity.ins().sURL_Seocheon;
        }

        else if(area.equals("예산군")) {
            return DefineCity.ins().sURL_yesan;
        }

        else if(area.equals("청양군")) {
            return DefineCity.ins().sURL_Cheongyang;
        }

        else if(area.equals("태안군")) {
            return DefineCity.ins().sURL_Taean;
        }

        else if(area.equals("홍성군")) {
            return DefineCity.ins().sURL_Hongseong;
        }

        /**
         * 경기도
         */
        else if(area.equals("고양시")) {
            return DefineCity.ins().sURL_goyang;
        }

        else if(area.equals("과천시")) {
            return DefineCity.ins().sURL_Gwacheon;
        }

        else if(area.equals("광명시")) {
            return DefineCity.ins().sURL_gwangmyeong;
        }

        else if(area.equals("(경기)광주시")) {
            return DefineCity.ins().sURL_Gwangju1;
        }

        else if(area.equals("구리시")) {
            return DefineCity.ins().sURL_guli;
        }

        else if(area.equals("군포시")) {
            return DefineCity.ins().sURL_Gunpo;
        }

        else if(area.equals("김포시")) {
            return DefineCity.ins().sURL_Gimpo;
        }

        else if(area.equals("남양주시")) {
            return DefineCity.ins().sURL_Namyangju;
        }

        else if(area.equals("동두천시")) {
            return DefineCity.ins().sURL_Dongducheon;
        }

        else if(area.equals("부천시")) {
            return DefineCity.ins().sURL_Bucheon;
        }

        else if(area.equals("성남시")) {
            return DefineCity.ins().sURL_seongnam;
        }

        else if(area.equals("수원시")) {
            return DefineCity.ins().sURL_Suwon;
        }

        else if(area.equals("시흥시")) {
            return DefineCity.ins().sURL_Siheung;
        }

        else if(area.equals("안산시")) {
            return DefineCity.ins().sURL_Ansan;
        }

        else if(area.equals("안성시")) {
            return DefineCity.ins().sURL_Anseong;
        }

        else if(area.equals("안양시")) {
            return DefineCity.ins().sURL_Anyang;
        }

        else if(area.equals("양주시")) {
            return DefineCity.ins().sURL_yangju;
        }

        else if(area.equals("여주시")) {
            return DefineCity.ins().sURL_Yeoju;
        }

        else if(area.equals("오산시")) {
            return DefineCity.ins().sURL_Osan;
        }

        else if(area.equals("용인시")) {
            return DefineCity.ins().sURL_Yongin;
        }

        else if(area.equals("의왕시")) {
            return DefineCity.ins().sURL_Uiwang;
        }

        else if(area.equals("의정부시")) {
            return DefineCity.ins().sURL_Uijeongbu;
        }

        else if(area.equals("이천시")) {
            return DefineCity.ins().sURL_Icheon;
        }

        else if(area.equals("파주시")) {
            return DefineCity.ins().sURL_Paju;
        }

        else if(area.equals("평택시")) {
            return DefineCity.ins().sURL_Pyeongtaek;
        }

        else if(area.equals("포천시")) {
            return DefineCity.ins().sURL_Pocheon;
        }

        else if(area.equals("하남시")) {
            return DefineCity.ins().sURL_Hanam;
        }

        else if(area.equals("화성시")) {
            return DefineCity.ins().sURL_hwaseong;
        }

        else if(area.equals("가평군")) {
            return DefineCity.ins().sURL_Gapyeong;
        }

        else if(area.equals("양평군")) {
            return DefineCity.ins().sURL_Yangpyeong;
        }

        else if(area.equals("연천군")) {
            return DefineCity.ins().sURL_Yeoncheon;
        }

        /**
         * 특별 광역시 , 도
         */
        else if(area.equals("서울특별시")) {
            return DefineCity.ins().sURL_Seoul;
        }

        else if(area.equals("부산광역시")) {
            return DefineCity.ins().sURL_Busan;
        }

        else if(area.equals("대전광역시")) {
            return DefineCity.ins().sURL_Daejeon;
        }

        else if(area.equals("대구광역시")) {
            return DefineCity.ins().sURL_Daegu;
        }

        else if(area.equals("인천광역시")) {
            return DefineCity.ins().sURL_Incheon;
        }

        else if(area.equals("울산광역시")) {
            return DefineCity.ins().sURL_Ulsan;
        }

        else if(area.equals("광주광역시")) {
            return DefineCity.ins().sURL_Gwangju;
        }

        else if(area.equals("제주특별자치도")) {
            return DefineCity.ins().sURL_Jeju;
        }

        else if(area.equals("세종특별자치시")) {
            return DefineCity.ins().sURL_Sejong;
        }

        return "";
    }
}
