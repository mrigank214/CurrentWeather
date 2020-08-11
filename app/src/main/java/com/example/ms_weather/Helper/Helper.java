package com.example.ms_weather.Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Helper {

    static String stream=null;
    public Helper(){


    }

    public String getHTTPData(String urlString){
       try{
           URL url=new URL(urlString);
           HttpsURLConnection httpsURLConnection=(HttpsURLConnection)url.openConnection();
           if(httpsURLConnection.getResponseCode()==200){
               BufferedReader r=new BufferedReader((new InputStreamReader(httpsURLConnection.getInputStream())));
               StringBuilder sb=new StringBuilder();
               String line;
               while((line=r.readLine())!=null)
                   sb.append(line);
                    stream =sb.toString();
                    httpsURLConnection.disconnect();
           }
       } catch (MalformedURLException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
    return stream;
    }


}
