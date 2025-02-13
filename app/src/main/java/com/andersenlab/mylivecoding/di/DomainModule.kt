package com.andersenlab.mylivecoding.di

import com.andersenlab.mylivecoding.domain.repository.TransferRepository
import com.andersenlab.mylivecoding.domain.usecase.GetAllTransfersUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

    @Provides
    @Singleton
    fun provideGetAllTransfersUseCase(
        transferRepository: TransferRepository
    ): GetAllTransfersUseCase {
        return GetAllTransfersUseCase(transferRepository)
    }
}