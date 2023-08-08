package com.example.beering.api

import com.example.beering.data.Jwt
import com.google.gson.annotations.SerializedName

data class TokenRequest(
    val refreshToken : String
)

data class TokenResponse(
    val isSuccess : Boolean,
    val responseCode : Int,
    val responseMessage : String,
    @SerializedName("result") val jwt : Jwt
)
