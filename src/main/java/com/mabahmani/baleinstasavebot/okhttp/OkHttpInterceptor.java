package com.mabahmani.baleinstasavebot.okhttp;


import com.mabahmani.baleinstasavebot.BaleInstaSaveBotApplication;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public final class OkHttpInterceptor implements Interceptor {

    @NotNull
    @Override
    public Response intercept(Chain chain) throws IOException {
        return chain.proceed(chain.request().newBuilder().addHeader(
                "Cookie",
                BaleInstaSaveBotApplication.cookie
        ).addHeader(
                "User-Agent",
                BaleInstaSaveBotApplication.userAgent
        ).build());
    }
}
