package com.andersenlab.mylivecoding.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.andersenlab.mylivecoding.R
import com.andersenlab.mylivecoding.databinding.TransferItemBinding
import com.andersenlab.mylivecoding.domain.model.TransferDomain
import com.bumptech.glide.Glide

class TransferAdapter : ListAdapter<TransferDomain, TransferAdapter.Holder>(Comparator()) {

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = TransferItemBinding.bind(view)
        fun bind(transfer : TransferDomain) {
            val formattedAmount = when (transfer.currency) {
                "EUR" -> "€${transfer.amount}"
                else -> "${transfer.amount} ${transfer.currency}"
            }
            with(binding) {
                nameTransfer.text = transfer.recipientName
                detailsTransfer.text = transfer.details
                priceTransfer.text = formattedAmount
                Glide.with(root.context)
                    .load(transfer.photoUrl)
                    .into(imgTransfer)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.transfer_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val character = getItem(position)
        holder.bind(character)
    }
}