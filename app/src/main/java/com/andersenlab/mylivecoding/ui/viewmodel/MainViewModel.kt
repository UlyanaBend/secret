package com.andersenlab.mylivecoding.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.andersenlab.mylivecoding.domain.model.TransferDomain
import com.andersenlab.mylivecoding.domain.usecase.GetAllTransfersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getAllTransfersUseCase: GetAllTransfersUseCase
) : ViewModel() {

    private val _transferList = MutableLiveData<List<TransferDomain>>()
    val transferList: LiveData<List<TransferDomain>> get() = _transferList

    init {
        loadTransfers()
    }

    private fun loadTransfers() {
        viewModelScope.launch {
            try {
                val transfers = getAllTransfersUseCase.execute()
                _transferList.value = transfers
            } catch (e: Exception) {
                Log.e("LoadTransfers", "Error loading transfers", e)
            }
        }
    }
}