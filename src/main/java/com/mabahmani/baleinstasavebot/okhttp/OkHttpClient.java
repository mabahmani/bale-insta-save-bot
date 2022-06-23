package com.mabahmani.baleinstasavebot.okhttp;

public class OkHttpClient {

    private static okhttp3.OkHttpClient okhttp = null;

    public static okhttp3.OkHttpClient getInstance(){

        if (okhttp == null){
            okhttp = new okhttp3.OkHttpClient.Builder()
                    .addInterceptor(new OkHttpInterceptor())
                    .build();
        }

        return okhttp;
    }
}
