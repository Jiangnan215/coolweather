package com.example.administrator.haishiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/12/19 0019.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
