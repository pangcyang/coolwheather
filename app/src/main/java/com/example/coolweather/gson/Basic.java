package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 是在说我吗 on 2018/4/6.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
