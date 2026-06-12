package com.example.right_path.data.model

data class OTPRequest(
    val requestId: String = "",
    val childId: String = "",
    val parentId: String = "",
    val appName: String = "",
    val requestTime: Long = 0L,
    val status: String = ""
)