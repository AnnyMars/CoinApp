package com.example.coinapp.data.remote

import com.example.coinapp.utils.Constants.API_KEY
import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val requestWithApiKey = originalRequest.newBuilder()
            .header("x-cg-demo-api-key", API_KEY)
            .build()
        return chain.proceed(requestWithApiKey)
    }
}