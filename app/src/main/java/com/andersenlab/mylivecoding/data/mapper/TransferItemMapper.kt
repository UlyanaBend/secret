package com.andersenlab.mylivecoding.data.mapper

import com.andersenlab.mylivecoding.data.models.TransferItem
import com.andersenlab.mylivecoding.data.models.TransferStatus
import com.andersenlab.mylivecoding.domain.model.TransferDomain

internal object TransferItemMapper {

    fun fromDomain(domain: TransferDomain): TransferItem {
        return TransferItem(
            id = domain.id,
            amount = domain.amount,
            currency = domain.currency,
            date = domain.date,
            details = domain.details,
            photoUrl = domain.photoUrl,
            recipientName = domain.recipientName,
            status = TransferStatus.valueOf(domain.status)
        )
    }

    fun toDomain(item: TransferItem): TransferDomain {
        return TransferDomain(
            id = item.id,
            amount = item.amount,
            currency = item.currency,
            date = item.date,
            details = item.details,
            photoUrl = item.photoUrl,
            recipientName = item.recipientName,
            status = item.status.name
        )
    }
}