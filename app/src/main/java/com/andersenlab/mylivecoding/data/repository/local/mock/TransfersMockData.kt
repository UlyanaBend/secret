package com.andersenlab.mylivecoding.data.repository.local.mock

import com.andersenlab.mylivecoding.data.models.TransferItem
import com.andersenlab.mylivecoding.data.models.TransferStatus

object TransferMockData {
    val transfers = listOf(
        TransferItem(
            id = 1,
            amount = 19.5,
            currency = "EUR",
            date = "Feb 22, 2023 1:21:22 PM",
            details = "Luka's transfer details",
            photoUrl = "https://upload.wikimedia.org/wikipedia/commons/6/6c/Luka_Doncic_2021_%28cropped%29.jpg",
            recipientName = "Luka Dončić",
            status = TransferStatus.DONE
        ),
        TransferItem(
            id = 2,
            amount = 451.99,
            currency = "EUR",
            date = "Feb 22, 2023 8:45:16 AM",
            details = "Giannis' transfer details",
            photoUrl = "https://upload.wikimedia.org/wikipedia/commons/9/9c/Giannis_Antetokounmpo_%2851915153421%29_%28cropped%29.jpg",
            recipientName = "Giannis Antetokounmpo",
            status = TransferStatus.DONE
        ),
        TransferItem(
            id = 3,
            amount = 121.25,
            currency = "EUR",
            date = "Feb 22, 2023 7:59:01 AM",
            details = "Nikola's transfer details",
            photoUrl = "https://upload.wikimedia.org/wikipedia/commons/7/7e/Nikola_Jokic_free_throw_%28cropped%29.jpg",
            recipientName = "Nikola Jokić",
            status = TransferStatus.DONE
        ),
        TransferItem(
            id = 4,
            amount = 998.99,
            currency = "EUR",
            date = "Feb 18, 2023 4:41:18 PM",
            details = "Damian's transfer details",
            photoUrl = "https://upload.wikimedia.org/wikipedia/commons/8/8e/Damian_Lillard_%282021%29_%28cropped%29.jpg",
            recipientName = "Damian Lamonte Ollie Lillard Sr.",
            status = TransferStatus.DONE
        )
    )
}
