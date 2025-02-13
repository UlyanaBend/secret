package com.andersenlab.mylivecoding.data.models

data class TransferItem(
    val id: Int,
    val amount: Double,
    val currency: String,
    val date: String,
    val details: String,
    val photoUrl: String,
    val recipientName: String,
    val status: TransferStatus
)

enum class TransferStatus{
    DONE, PENDING
}