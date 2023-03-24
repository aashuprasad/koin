package com.example.koin.data.api

import com.example.koin.data.model.User
import retrofit2.Response

@Singleton
interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>
}