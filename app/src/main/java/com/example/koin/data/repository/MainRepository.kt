package com.example.koin.data.repository

import com.example.koin.data.api.ApiHelper

class MainRepository(private val apiHelper:ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}