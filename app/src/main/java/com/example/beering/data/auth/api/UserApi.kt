package com.example.beering.data.auth.api

import com.example.beering.data.auth.dto.CheckIdResult
import com.example.beering.data.auth.dto.CheckNameResult
import com.example.beering.data.auth.dto.JoinRequest
import com.example.beering.data.auth.dto.JoinResponse
import com.example.beering.feature.auth.join.Member
import com.example.beering.feature.auth.join.MemberResponse
import com.example.beering.util.base.BaseResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface UserApi {
    @POST("/auth/signup")
    suspend fun signUp(@Body request : JoinRequest): Response<BaseResponse<JoinResponse>>

    @GET("/members/validate/username")
    suspend fun checkUserId(@Query("username") username: String): Response<BaseResponse<CheckIdResult>>

    @GET("/members/validate/nickname")
    suspend fun checkNickname(@Query("nickname") nickname: String): Response<BaseResponse<CheckNameResult>>

}