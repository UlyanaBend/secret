package com.andersenlab.mylivecoding.data.repository.local

import com.andersenlab.mylivecoding.data.mapper.TransferItemMapper
import com.andersenlab.mylivecoding.data.repository.local.mock.TransferMockData
import com.andersenlab.mylivecoding.domain.model.TransferDomain
import com.andersenlab.mylivecoding.domain.repository.TransferRepository

class TransferLocalRepositoryImpl : TransferRepository {

    override suspend fun getAllTransfers() : List<TransferDomain> {
        return TransferMockData.transfers.map { TransferItemMapper.toDomain(it) }
    }
}