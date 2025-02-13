package com.andersenlab.mylivecoding.domain.repository

import com.andersenlab.mylivecoding.domain.model.TransferDomain

interface TransferRepository {
    suspend fun getAllTransfers(): List<TransferDomain>
}