package com.andersenlab.mylivecoding.ui.adapter

import androidx.recyclerview.widget.DiffUtil
import com.andersenlab.mylivecoding.domain.model.TransferDomain

internal class Comparator : DiffUtil.ItemCallback<TransferDomain>() {
    override fun areItemsTheSame(oldItem: TransferDomain, newItem: TransferDomain): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: TransferDomain, newItem: TransferDomain): Boolean {
        return oldItem == newItem
    }
}