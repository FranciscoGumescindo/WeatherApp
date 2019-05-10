package com.android.gumeoficial.weatherapp.API;

import com.android.gumeoficial.weatherapp.API.Deserializers.MyDeserializer;
import com.android.gumeoficial.weatherapp.Models.City;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API {

    public static final  String BASE_URL= "http://api.openweathermap.org/data/2.5/";
    public static final  String BASE_ICONS = "http://openweathermap.org/img/w/";
    public  static  final String EXTENSION_ICONS = ".png";

    private static Retrofit  retrofit = null;

    public  static final String APPKEY = "YOUR API_KEY OPEN WEATHER";

    public static  Retrofit getApi(){
        if (retrofit == null){
            GsonBuilder builder = new GsonBuilder();
            builder.registerTypeAdapter(City.class,
                    new MyDeserializer());

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory
                            .create(builder.create()))
                            .build();
        }
        return  retrofit;
    }
}
