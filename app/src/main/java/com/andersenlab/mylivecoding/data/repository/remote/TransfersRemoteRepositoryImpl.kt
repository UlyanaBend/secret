package com.andersenlab.mylivecoding.data.repository.remote

import com.andersenlab.mylivecoding.data.mapper.TransferItemMapper
import com.andersenlab.mylivecoding.data.repository.local.mock.TransferMockData
import com.andersenlab.mylivecoding.domain.model.TransferDomain
import com.andersenlab.mylivecoding.domain.repository.TransferRepository
import javax.inject.Inject

class TransfersRemoteRepositoryImpl @Inject constructor(
    private val transferAPI: TransfersAPI
) : TransferRepository {
    override suspend fun getAllTransfers() : List<TransferDomain> {
        return try {
            val transfersDataList = transferAPI.getAllTransfers()
            return transfersDataList.map { TransferItemMapper.toDomain(it) }
        } catch (e: Exception) {
            return TransferMockData.transfers.map { TransferItemMapper.toDomain(it) }
        }
    }
}