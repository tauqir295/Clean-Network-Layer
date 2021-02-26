package com.food.delivery.app.network

import com.food.delivery.app.menu.model.MenuItems
import io.reactivex.Observable
import retrofit2.http.GET

interface RequestInterface {

    @GET("api/menus")
    fun getMenuList(): Observable<MenuItems>
}