package com.food.delivery.app.network.local

import com.food.delivery.app.menu.model.MenuItems
import com.food.delivery.app.network.AppDataSource
import com.food.delivery.app.utils.Constants
import com.food.delivery.app.utils.readTextFromFile
import com.google.gson.Gson
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

class AppLocalDataSource : AppDataSource {

    /**
     *  Using Gson library to parse data from local file
     */
    override fun getMenuList(): Observable<MenuItems> = Observable.fromCallable {
        readFile()
    }.subscribeOn(Schedulers.io())

    private fun readFile(): MenuItems {

        return Constants.FILE_NAME.readTextFromFile()?.let {
             Gson().fromJson(
                it,
                MenuItems::class.java
            )
        }?: MenuItems(arrayListOf())
    }
}