package com.link.asus.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Asus on 2018/3/14.
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
