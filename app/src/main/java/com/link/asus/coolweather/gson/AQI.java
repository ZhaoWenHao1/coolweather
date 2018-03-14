package com.link.asus.coolweather.gson;

/**
 * Created by Asus on 2018/3/14.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
