package com.link.asus.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Asus on 2018/3/14.
 */

public class Weather {
    public String Status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
