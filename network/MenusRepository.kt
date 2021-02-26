package com.food.delivery.app.network

class MenusRepository (private val dataSource: AppDataSource) {
    fun getMenus() = dataSource.getMenuList()
}
