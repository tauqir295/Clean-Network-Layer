package com.food.delivery.app.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    companion object {
        private var retrofit: Retrofit? = null
        private const val baseUrl = "https://localhost:3360"

        /**
         * creating the [Retrofit] object using [Retrofit.Builder]
         * baseUrl - based on entity and build flavor
         * @return:Retrofit - use this returned class to call API
         */
        fun getClient(): Retrofit? {
            if (retrofit == null) {
                Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

            }
            return this.retrofit
        }
    }

}