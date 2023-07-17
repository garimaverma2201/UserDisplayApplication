package com.app.userdisplayapp.api

import com.app.userdisplayapp.models.AddUserResponse
import com.app.userdisplayapp.models.UserListResponse
import com.app.userdisplayapp.models.UserRequest
import com.app.userdisplayapp.models.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {

    @POST("register")
    suspend fun registerUser(@Body userRequest: UserRequest): Response<UserResponse>

    @POST("login")
    suspend fun  loginUser(@Body userRequest: UserRequest) : Response<UserResponse>

    @GET("users?")
    suspend fun getUserList(@Query("page") page: String) : Response<UserListResponse>

    @POST("users")
    suspend fun addUser(@Body addUserRequest: UserRequest) : Response<AddUserResponse>

}