package com.example.ms_weather.Common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {

    public static String API_KEY="439d4b804bc8187953eb36d2a8c26a02";
    public static String API_link="https://openweathermap.org/data/2.5/weather";

    @org.jetbrains.annotations.NotNull
    public static String apiRequest(String lat, String lng){
     StringBuilder sb=new StringBuilder(API_link);
     sb.append(String.format("?lat=%s&lon=%s&appid=%s",lat,lng,API_KEY));
     return sb.toString();

}
    public static String unixTimeStamptoDateTime(double unixTimeStamp){

        DateFormat dateFormat=new SimpleDateFormat("HH:mm");
        Date date=new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    public static String getImage(String icon){
        return String.format("http://openweather.org/img/w/%s.png",icon);

    }

    public static String getdateNow(){
        DateFormat dateFormat=new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date=new Date();
        return dateFormat.format(date);
    }

}
