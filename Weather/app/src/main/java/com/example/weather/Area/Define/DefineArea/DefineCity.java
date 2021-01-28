package com.example.weather.Area.Define.DefineArea;

public class DefineCity {

    /**
     * 지역별 API키 값 지역이름값이랑 위차랑 안맞는 부분이 많아서 위도 경도로 대체해서 저장함
     */
    public String sSelectArea = "";


    //!<"http://api.openweathermap.org/data/2.5/weather?" + latitude + "=lat&lon=" + longitude + "&appid=400c72073669554d1dc38abdbaf0892f";

    /**
     * 특별 광역시, 도
     */
    public String sURL_Seoul = "https://api.openweathermap.org/data/2.5/weather?q=Seoul&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Busan = "https://api.openweathermap.org/data/2.5/weather?q=Busan&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Daejeon = "https://api.openweathermap.org/data/2.5/weather?q=Daejeon&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Daegu = "https://api.openweathermap.org/data/2.5/weather?q=Daegu&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Incheon = "https://api.openweathermap.org/data/2.5/weather?q=Incheon&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Ulsan = "https://api.openweathermap.org/data/2.5/weather?q=Ulsan&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Gwangju = "https://api.openweathermap.org/data/2.5/weather?q=Gwangju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Jeju = "https://api.openweathermap.org/data/2.5/weather?q=Jeju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Sejong = "https://api.openweathermap.org/data/2.5/weather?q=Sejong&appid=400c72073669554d1dc38abdbaf0892f";


    /**
     * 시 , 군
     */
    //전남
    public String sURL_Gwangyang = "https://api.openweathermap.org/data/2.5/weather?q=Gwangyang&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Naju = "https://api.openweathermap.org/data/2.5/weather?q=Naju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Mokpo = "https://api.openweathermap.org/data/2.5/weather?q=Mokpo&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Suncheon = "https://api.openweathermap.org/data/2.5/weather?q=Suncheon&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Yeosu = "https://api.openweathermap.org/data/2.5/weather?q=Yeosu&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Gangjin = "http://api.openweathermap.org/data/2.5/weather?lat=34.641988&lon=126.767231&appid=400c72073669554d1dc38abdbaf0892f"; //X 34.641988, 126.767231 <-------------이 거
    public String sURL_Goheung = "http://api.openweathermap.org/data/2.5/weather?lat=34.611162&lon=127.285099&appid=400c72073669554d1dc38abdbaf0892f"; //X 34.611162, 127.285099
    public String sURL_Gokseong = "https://api.openweathermap.org/data/2.5/weather?q=Gokseong&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Gurye = "http://api.openweathermap.org/data/2.5/weather?lat=35.202509&lon=127.462821&appid=400c72073669554d1dc38abdbaf0892f"; //x35.202509, 127.462821
    public String sURL_Damyang = "https://api.openweathermap.org/data/2.5/weather?q=Damyang&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Muan = "https://api.openweathermap.org/data/2.5/weather?q=Muan&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Boseong = "https://api.openweathermap.org/data/2.5/weather?q=Boseong&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Sinan = "https://api.openweathermap.org/data/2.5/weather?q=Sinan&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Yeonggwang = "https://api.openweathermap.org/data/2.5/weather?q=Yeonggwang&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Yeongam = "http://api.openweathermap.org/data/2.5/weather?lat=34.800160&lon=126.696835&appid=400c72073669554d1dc38abdbaf0892f"; //x 34.800160, 126.696835
    public String sURL_Wando = "https://api.openweathermap.org/data/2.5/weather?q=Wando&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Jangseong = "https://api.openweathermap.org/data/2.5/weather?q=Jangseong&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Jangheung = "http://api.openweathermap.org/data/2.5/weather?lat=34.681550&lon=126.907080&appid=400c72073669554d1dc38abdbaf0892f"; //x 34.681550, 126.907080
    public String sURL_jindo = "http://api.openweathermap.org/data/2.5/weather?lat=34.486748&lon=126.263476&appid=400c72073669554d1dc38abdbaf0892f"; //x 34.486748, 126.263476
    public String sURL_Hampyeong = "https://api.openweathermap.org/data/2.5/weather?q=Hampyeong&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Haenam = "https://api.openweathermap.org/data/2.5/weather?q=Haenam&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Hwasun = "https://api.openweathermap.org/data/2.5/weather?q=Hwasun&appid=400c72073669554d1dc38abdbaf0892f";
    //전북
    public String sURL_Gunsan = "https://api.openweathermap.org/data/2.5/weather?q=Gunsan&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Gimje = "https://api.openweathermap.org/data/2.5/weather?q=Gimje&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Namwon = "https://api.openweathermap.org/data/2.5/weather?q=Namwon&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Iksan = "https://api.openweathermap.org/data/2.5/weather?q=Iksan&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Jeonju = "https://api.openweathermap.org/data/2.5/weather?q=Jeonju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Jeongeup = "http://api.openweathermap.org/data/2.5/weather?lat=35.569798&lon=126.856041&appid=400c72073669554d1dc38abdbaf0892f"; //x 35.569798, 126.856041
    public String sURL_Gochang = "https://api.openweathermap.org/data/2.5/weather?q=Gochang&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Muju = "https://api.openweathermap.org/data/2.5/weather?q=Muju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Buan = "https://api.openweathermap.org/data/2.5/weather?q=Buan&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Sunchang = "https://api.openweathermap.org/data/2.5/weather?q=Sunchang&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Wanju = "https://api.openweathermap.org/data/2.5/weather?q=Wanju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Imsil = "https://api.openweathermap.org/data/2.5/weather?q=Imsil&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Jangsu = "https://api.openweathermap.org/data/2.5/weather?q=Jangsu&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Jinan = "https://api.openweathermap.org/data/2.5/weather?q=Jinan&appid=400c72073669554d1dc38abdbaf0892f";
    //경남
    public String sURL_Geoje = "http://api.openweathermap.org/data/2.5/weather?lat=34.880529&lon=128.621052&appid=400c72073669554d1dc38abdbaf0892f"; //x 34.880529, 128.621052
    public String sURL_Gimhae = "https://api.openweathermap.org/data/2.5/weather?q=Gimhae&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Miryang = "https://api.openweathermap.org/data/2.5/weather?q=Miryang&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Sichuan = "https://api.openweathermap.org/data/2.5/weather?q=Sichuan&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Yangsan = "https://api.openweathermap.org/data/2.5/weather?q=Yangsan&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Jinju = "https://api.openweathermap.org/data/2.5/weather?q=Jinju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Changwon = "https://api.openweathermap.org/data/2.5/weather?q=Changwon&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Tongyeong = "http://api.openweathermap.org/data/2.5/weather?lat=34.854388&lon=128.433203&appid=400c72073669554d1dc38abdbaf0892f"; //x 34.854388, 128.433203
    public String sURL_Geochang = "http://api.openweathermap.org/data/2.5/weather?lat=35.686357&lon=127.909442&appid=400c72073669554d1dc38abdbaf0892f"; //x 35.686357, 127.909442
    public String sURL_Goseong = "http://api.openweathermap.org/data/2.5/weather?lat=34.972884&lon=128.322429&appid=400c72073669554d1dc38abdbaf0892f";  // 경남 고성 강원 고성 겹침 34.972884, 128.322429
    public String sURL_Namhae = "https://api.openweathermap.org/data/2.5/weather?q=Namhae&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Sancheong = "http://api.openweathermap.org/data/2.5/weather?lat=35.415514&lon=127.873466&appid=400c72073669554d1dc38abdbaf0892f"; // x 35.415514, 127.873466
    public String sURL_Uiryeong = "https://api.openweathermap.org/data/2.5/weather?q=Uiryeong&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Changnyeong = "https://api.openweathermap.org/data/2.5/weather?q=Changnyeong&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Hadong = "https://api.openweathermap.org/data/2.5/weather?q=Hadong&appid=400c72073669554d1dc38abdbaf0892f"; //하동읍 사무소로 뜸
    public String sURL_Haman = "https://api.openweathermap.org/data/2.5/weather?q=Haman&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Hamyang = "https://api.openweathermap.org/data/2.5/weather?q=Hamyang&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Hapcheon = "https://api.openweathermap.org/data/2.5/weather?q=Hapcheon&appid=400c72073669554d1dc38abdbaf0892f";
    //경북
    public String sURL_Gyeongsan = "https://api.openweathermap.org/data/2.5/weather?q=Gyeongsan&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Gyeongju = "https://api.openweathermap.org/data/2.5/weather?q=Gyeongju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Gumi = "https://api.openweathermap.org/data/2.5/weather?q=Gumi&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Gimcheon = "https://api.openweathermap.org/data/2.5/weather?q=Gimcheon&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Mungyeong = "https://api.openweathermap.org/data/2.5/weather?q=Mungyeong&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Sangju = "https://api.openweathermap.org/data/2.5/weather?q=Sangju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Andong = "https://api.openweathermap.org/data/2.5/weather?q=Andong&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_yeongju = "https://api.openweathermap.org/data/2.5/weather?q=yeongju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Yeongcheon = "http://api.openweathermap.org/data/2.5/weather?lat=35.973216&lon=128.938578&appid=400c72073669554d1dc38abdbaf0892f"; //x 35.973216, 128.938578
    public String sURL_Pohang = "https://api.openweathermap.org/data/2.5/weather?q=Pohang&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_golyeong = "http://api.openweathermap.org/data/2.5/weather?lat=36.242833&lon=128.572943&appid=400c72073669554d1dc38abdbaf0892f"; //x 36.242833, 128.572943
    public String sURL_Gunwi = "https://api.openweathermap.org/data/2.5/weather?q=Gunwi&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Bonghwa = "https://api.openweathermap.org/data/2.5/weather?q=Bonghwa&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Seongju = "https://api.openweathermap.org/data/2.5/weather?q=Seongju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Yeongdeok = "http://api.openweathermap.org/data/2.5/weather?lat=36.415009&lon=129.366123&appid=400c72073669554d1dc38abdbaf0892f"; //x 36.415009, 129.366123
    public String sURL_Yeongyang = "https://api.openweathermap.org/data/2.5/weather?q=Yeongyang&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Yecheon = "https://api.openweathermap.org/data/2.5/weather?q=Yecheon&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Ulleung = "http://api.openweathermap.org/data/2.5/weather?lat=37.484363&lon=130.905897&appid=400c72073669554d1dc38abdbaf0892f"; //x37.484363, 130.905897
    public String sURL_Uljin = "http://api.openweathermap.org/data/2.5/weather?lat=36.99297&lon=129.400640&appid=400c72073669554d1dc38abdbaf0892f"; //x 36.99297 울릉군 2, 129.400640
    public String sURL_Uiseong = "https://api.openweathermap.org/data/2.5/weather?q=Uiseong&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Cheongdo = "https://api.openweathermap.org/data/2.5/weather?q=Cheongdo&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Cheongsong = "https://api.openweathermap.org/data/2.5/weather?q=Cheongsong&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Chilgok = "https://api.openweathermap.org/data/2.5/weather?q=Chilgok&appid=400c72073669554d1dc38abdbaf0892f";
    //강원도
    public String sURL_Gangneung = "https://api.openweathermap.org/data/2.5/weather?q=Gangneung&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_donghae = "https://api.openweathermap.org/data/2.5/weather?q=donghae&appid=400c72073669554d1dc38abdbaf0892f"; //x
    public String sURL_Samcheok = "https://api.openweathermap.org/data/2.5/weather?q=Samcheok&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Sokcho = "https://api.openweathermap.org/data/2.5/weather?q=Sokcho&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_wonju = "https://api.openweathermap.org/data/2.5/weather?q=wonju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_chuncheon = "https://api.openweathermap.org/data/2.5/weather?q=chuncheon&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Taebaek = "https://api.openweathermap.org/data/2.5/weather?q=Taebaek&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Goseong1 = "http://api.openweathermap.org/data/2.5/weather?lat=38.380601&lon=128.467822&appid=400c72073669554d1dc38abdbaf0892f"; //강원도 고성 경남 고성 겹침 38.380601, 128.467822
    public String sURL_Yanggu = "https://api.openweathermap.org/data/2.5/weather?q=Yanggu&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Yangyang = "https://api.openweathermap.org/data/2.5/weather?q=Yangyang&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Yeongwol = "http://api.openweathermap.org/data/2.5/weather?lat=37.183649&lon=128.461815&appid=400c72073669554d1dc38abdbaf0892f"; //x 37.183649, 128.461815
    public String sURL_Inje = "https://api.openweathermap.org/data/2.5/weather?q=Inje&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Jeongseon = "http://api.openweathermap.org/data/2.5/weather?lat=37.380599&lon=128.660825&appid=400c72073669554d1dc38abdbaf0892f"; //x 37.380599, 128.660825
    public String sURL_Cheolwon = "http://api.openweathermap.org/data/2.5/weather?lat=38.146658&lon=127.313371&appid=400c72073669554d1dc38abdbaf0892f"; //x 38.146658, 127.313371
    public String sURL_Pyeongchang = "http://api.openweathermap.org/data/2.5/weather?lat=37.370431&lon=128.390083&appid=400c72073669554d1dc38abdbaf0892f"; //x 37.370431, 128.390083
    public String sURL_Hongcheon = "http://api.openweathermap.org/data/2.5/weather?lat=37.697010&lon=127.888789&appid=400c72073669554d1dc38abdbaf0892f"; //x 37.697010, 127.888789
    public String sURL_Hwacheon = "https://api.openweathermap.org/data/2.5/weather?q=Hwacheon&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Hoengseong = "http://api.openweathermap.org/data/2.5/weather?lat=37.491665&lon=127.984996&appid=400c72073669554d1dc38abdbaf0892f"; //x 37.491665, 127.984996
    //충북
    public String sURL_Jecheon = "https://api.openweathermap.org/data/2.5/weather?q=Jecheon&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_cheongju = "https://api.openweathermap.org/data/2.5/weather?q=cheongju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Chungju = "https://api.openweathermap.org/data/2.5/weather?q=Chungju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Goesan = "http://api.openweathermap.org/data/2.5/weather?lat=36.815297&lon=127.786646&appid=400c72073669554d1dc38abdbaf0892f"; //x 36.815297, 127.786646
    public String sURL_Danyang = "https://api.openweathermap.org/data/2.5/weather?q=Danyang&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Boeun = "http://api.openweathermap.org/data/2.5/weather?lat=36.489436&lon=127.729716&appid=400c72073669554d1dc38abdbaf0892f"; //x 36.489436, 127.729716
    public String sURL_Yeongdong = "https://api.openweathermap.org/data/2.5/weather?q=Yeongdong&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Okcheon = "https://api.openweathermap.org/data/2.5/weather?q=Okcheon&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_eumseong = "https://api.openweathermap.org/data/2.5/weather?q=eumseong&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_jeungpyeong = "http://api.openweathermap.org/data/2.5/weather?lat=36.785144&lon=127.581435&appid=400c72073669554d1dc38abdbaf0892f"; //x 36.785144, 127.581435
    public String sURL_Jincheon = "http://api.openweathermap.org/data/2.5/weather?lat=36.855324&lon=127.435982&appid=400c72073669554d1dc38abdbaf0892f"; //x 36.855324, 127.435982
    //충남
    public String sURL_gongju = "https://api.openweathermap.org/data/2.5/weather?q=gongju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Gyeryong = "http://api.openweathermap.org/data/2.5/weather?lat=36.274523&lon=127.248559&appid=400c72073669554d1dc38abdbaf0892f"; //x 36.274523, 127.248559
    public String sURL_Nonsan = "https://api.openweathermap.org/data/2.5/weather?q=Nonsan&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Dangjin = "http://api.openweathermap.org/data/2.5/weather?lat=36.889951&lon=126.645745&appid=400c72073669554d1dc38abdbaf0892f"; //x 36.889951, 126.645745
    public String sURL_Boryeong = "https://api.openweathermap.org/data/2.5/weather?q=Boryeong&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Cheonan = "https://api.openweathermap.org/data/2.5/weather?q=Cheonan&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Seosan = "https://api.openweathermap.org/data/2.5/weather?q=Boeun&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Asan = "https://api.openweathermap.org/data/2.5/weather?q=Asan&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Geumsan = "http://api.openweathermap.org/data/2.5/weather?lat=36.108564&lon=127.489071&appid=400c72073669554d1dc38abdbaf0892f"; //x 36.108564, 127.489071
    public String sURL_buyeo = "https://api.openweathermap.org/data/2.5/weather?q=buyeo&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Seocheon = "http://api.openweathermap.org/data/2.5/weather?lat=36.080276&lon=126.691282&appid=400c72073669554d1dc38abdbaf0892f"; //x 36.080276, 126.691282
    public String sURL_yesan = "https://api.openweathermap.org/data/2.5/weather?q=yesan&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Cheongyang = "http://api.openweathermap.org/data/2.5/weather?lat=36.459178&lon=126.802162&appid=400c72073669554d1dc38abdbaf0892f"; //x 36.459178, 126.802162
    public String sURL_Taean = "https://api.openweathermap.org/data/2.5/weather?q=Taean&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Hongseong = "https://api.openweathermap.org/data/2.5/weather?q=Hongseong&appid=400c72073669554d1dc38abdbaf0892f";
    //경기도
    public String sURL_goyang = "https://api.openweathermap.org/data/2.5/weather?q=goyang&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Gwacheon = "https://api.openweathermap.org/data/2.5/weather?q=Gwacheon&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_gwangmyeong = "http://api.openweathermap.org/data/2.5/weather?lat=37.478506&lon=126.864820&appid=400c72073669554d1dc38abdbaf0892f"; //x 37.478506, 126.864820
    public String sURL_Gwangju1 = "http://api.openweathermap.org/data/2.5/weather?lat=37.429337&lon=127.255062&appid=400c72073669554d1dc38abdbaf0892f"; //광주 광역시 ,광주시 모름 37.429337, 127.255062
    public String sURL_guli = "https://api.openweathermap.org/data/2.5/weather?q=guli&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Gunpo = "https://api.openweathermap.org/data/2.5/weather?q=Gunpo&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Gimpo = "http://api.openweathermap.org/data/2.5/weather?lat=37.614934&lon=126.715889&appid=400c72073669554d1dc38abdbaf0892f"; //x 37.614934, 126.715889
    public String sURL_Namyangju = "https://api.openweathermap.org/data/2.5/weather?q=Namyangju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Dongducheon = "http://api.openweathermap.org/data/2.5/weather?lat=37.903558&lon=127.060389&appid=400c72073669554d1dc38abdbaf0892f"; //x 37.903558, 127.060389
    public String sURL_Bucheon = "https://api.openweathermap.org/data/2.5/weather?q=Bucheon&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_seongnam = "https://api.openweathermap.org/data/2.5/weather?q=seongnam&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Suwon = "https://api.openweathermap.org/data/2.5/weather?q=Suwon&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Siheung = "http://api.openweathermap.org/data/2.5/weather?lat=37.380025&lon=126.802881&appid=400c72073669554d1dc38abdbaf0892f"; //x 37.380025, 126.802881
    public String sURL_Ansan = "https://api.openweathermap.org/data/2.5/weather?q=Ansan&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Anseong = "https://api.openweathermap.org/data/2.5/weather?q=Anseong&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Anyang = "https://api.openweathermap.org/data/2.5/weather?q=Anyang&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_yangju = "https://api.openweathermap.org/data/2.5/weather?q=yangju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Yeoju = "https://api.openweathermap.org/data/2.5/weather?q=Yeoju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Osan = "https://api.openweathermap.org/data/2.5/weather?q=Osan&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Yongin = "https://api.openweathermap.org/data/2.5/weather?q=Yongin&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Uiwang = "https://api.openweathermap.org/data/2.5/weather?q=Uiwang&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Uijeongbu = "http://api.openweathermap.org/data/2.5/weather?lat=37.737944&lon=127.033928&appid=400c72073669554d1dc38abdbaf0892f"; //x 37.737944, 127.033928
    public String sURL_Icheon = "http://api.openweathermap.org/data/2.5/weather?lat=37.272186&lon=127.435039&appid=400c72073669554d1dc38abdbaf0892f"; //x 37.272186, 127.435039
    public String sURL_Paju = "https://api.openweathermap.org/data/2.5/weather?q=Paju&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Pyeongtaek = "https://api.openweathermap.org/data/2.5/weather?q=Pyeongtaek&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Pocheon = "http://api.openweathermap.org/data/2.5/weather?lat=37.894981&lon=127.200320&appid=400c72073669554d1dc38abdbaf0892f"; //x 37.894981, 127.200320
    public String sURL_Hanam = "https://api.openweathermap.org/data/2.5/weather?q=Hanam&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_hwaseong = "https://api.openweathermap.org/data/2.5/weather?q=hwaseong&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Gapyeong = "https://api.openweathermap.org/data/2.5/weather?q=Gapyeong&appid=400c72073669554d1dc38abdbaf0892f";
    public String sURL_Yangpyeong = "http://api.openweathermap.org/data/2.5/weather?lat=37.491935&lon=127.487526&appid=400c72073669554d1dc38abdbaf0892f"; //x 37.491935, 127.487526
    public String sURL_Yeoncheon = "http://api.openweathermap.org/data/2.5/weather?lat=38.096342&lon=127.075067&appid=400c72073669554d1dc38abdbaf0892f"; //x 38.096342, 127.075067


    /**
     * @author
     * @since	2020 - 06 - 04
     * @param	instance Singleton Pattern
     */
    private static DefineCity instance;
    public static DefineCity ins() {
        if (instance == null) {
            instance = new DefineCity();
        }

        return instance;

    }
}
