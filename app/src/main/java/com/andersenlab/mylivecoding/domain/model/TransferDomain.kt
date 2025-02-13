package com.andersenlab.mylivecoding.domain.model

data class TransferDomain (
    val id: Int,
    val amount: Double,
    val currency: String,
    val date: String,
    val details: String,
    val photoUrl: String,
    val recipientName: String,
    val status: String
)