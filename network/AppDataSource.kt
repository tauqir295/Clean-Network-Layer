package com.food.delivery.app.network

import com.food.delivery.app.menu.model.MenuItems
import io.reactivex.Observable

interface AppDataSource {
    fun getMenuList(): Observable<MenuItems>?
}