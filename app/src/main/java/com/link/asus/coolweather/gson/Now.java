package com.link.asus.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Asus on 2018/3/14.
 */

public class Now {

    @SerializedName("tem")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
