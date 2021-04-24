package com.example.myapplication.data.repo

import com.example.myapplication.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}