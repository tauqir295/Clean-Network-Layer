package com.food.delivery.app.network.remote

import com.food.delivery.app.menu.model.MenuItems
import com.food.delivery.app.network.ApiClient
import com.food.delivery.app.network.AppDataSource
import com.food.delivery.app.network.RequestInterface
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

class AppRemoteDataSource : AppDataSource {

    /**
     *  Using retrofit 2 to fetch data from API
     */
    override fun getMenuList(): Observable<MenuItems>? {
        // initiating ApiInterface via retrofit
        return ApiClient.getClient()?.create(RequestInterface::class.java)?.getMenuList()?.subscribeOn(
            Schedulers.io())
    }

}