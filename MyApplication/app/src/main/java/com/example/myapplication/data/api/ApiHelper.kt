package com.example.myapplication.data.api

import com.example.myapplication.data.model.User

interface ApiHelper {

    suspend fun getUsers(): List<User>
}