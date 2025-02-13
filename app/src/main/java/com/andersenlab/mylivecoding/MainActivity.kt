package com.andersenlab.mylivecoding

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.andersenlab.mylivecoding.databinding.MainActivityBinding
import com.andersenlab.mylivecoding.ui.adapter.TransferAdapter
import com.andersenlab.mylivecoding.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lateinit var binding: MainActivityBinding
        lateinit var adapter: TransferAdapter

        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainViewModel: MainViewModel by viewModels()

        adapter = TransferAdapter()
        binding.rvTransfersList.layoutManager = LinearLayoutManager(this)
        binding.rvTransfersList.adapter = adapter

        mainViewModel.transferList.observe(this, Observer { items ->
            adapter.submitList(items)
        })
    }
}

