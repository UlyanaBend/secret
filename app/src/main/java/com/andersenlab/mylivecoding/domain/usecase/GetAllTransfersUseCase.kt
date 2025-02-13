package com.andersenlab.mylivecoding.domain.usecase

import com.andersenlab.mylivecoding.domain.model.TransferDomain
import com.andersenlab.mylivecoding.domain.repository.TransferRepository
import javax.inject.Inject

class GetAllTransfersUseCase @Inject constructor(
    private val transferRepository: TransferRepository
) {
    suspend fun execute(): List<TransferDomain> {
        return transferRepository.getAllTransfers()
    }
}