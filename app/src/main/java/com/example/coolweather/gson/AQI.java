package com.example.coolweather.gson;

/**
 * Created by 是在说我吗 on 2018/4/6.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
