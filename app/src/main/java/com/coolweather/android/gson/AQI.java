package com.coolweather.android.gson;

/**
 * Created by dw on 2018/8/8.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
