package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dw on 2018/8/8.
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
