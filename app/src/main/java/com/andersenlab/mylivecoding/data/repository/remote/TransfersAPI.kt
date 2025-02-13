package com.andersenlab.mylivecoding.data.repository.remote

import com.andersenlab.mylivecoding.data.models.TransferItem
import retrofit2.http.GET

interface TransfersAPI {
    @GET("transfers")
    suspend fun getAllTransfers() : List<TransferItem>
}