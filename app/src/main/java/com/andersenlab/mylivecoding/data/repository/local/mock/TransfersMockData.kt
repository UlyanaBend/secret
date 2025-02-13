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
        ),
        TransferItem(
            id = 5,
            amount = 139.00,
            currency = "EUR",
            date = "Feb 18, 2023 3:52:26 PM",
            details = "Kyrie' transfer details",
            photoUrl = "https://upload.wikimedia.org/wikipedia/commons/0/01/Kyrie_Irving_-_51831772061_01_%28cropped%29.jpg",
            recipientName = "Kyrie Andrew Irving",
            status = TransferStatus.DONE
        ),
        TransferItem(
            id = 6,
            amount = 452.01,
            currency = "EUR",
            date = "Jan 8, 2023 6:33:46 PM",
            details = "Kevin's transfer details",
            photoUrl = "https://upload.wikimedia.org/wikipedia/commons/3/3a/Kevin_Durant_%28Wizards_v._Warriors%2C_1-24-2019%29_%28cropped%29.jpg",
            recipientName = "Kevin Wayne Durant",
            status = TransferStatus.DONE
        ),
        TransferItem(
            id = 7,
            amount = 701.70,
            currency = "EUR",
            date = "Dec 20, 2022 2:11:13 PM",
            details = "LeBron's transfer details",
            photoUrl = "https://upload.wikimedia.org/wikipedia/commons/b/bf/LeBron_James_-_51959723161_%28cropped%29.jpg",
            recipientName = "LeBron Raymone James Sr.",
            status = TransferStatus.PENDING
        ),
        TransferItem(
            id = 8,
            amount = 499.99,
            currency = "EUR",
            date = "Dec 19, 2022 10:34:24 PM",
            details = "Kawhi' transfer details",
            photoUrl = "https://upload.wikimedia.org/wikipedia/commons/a/a9/Kawhi_Leonard_%287440607%29_%28cropped%29.jpg",
            recipientName = "Kawhi Anthony Leonard",
            status = TransferStatus.PENDING
        ),
        TransferItem(
            id = 9,
            amount = 99.01,
            currency = "EUR",
            date = "Dec 16, 2022 8:42:22 PM",
            details = "Steph's transfer details",
            photoUrl = "https://upload.wikimedia.org/wikipedia/commons/a/aa/TechCrunch_Disrupt_2019_%2848834853256%29_%281%29.jpg",
            recipientName = "Wardell Stephen Curry II",
            status = TransferStatus.PENDING
        ),
        TransferItem(
            id = 10,
            amount = 812.13,
            currency = "EUR",
            date = "Dec 13, 2022 6:21:31 PM",
            details = "Ja's transfer details",
            photoUrl = "https://upload.wikimedia.org/wikipedia/commons/a/a1/Ja_Morant_2021.jpg",
            recipientName = "Ja Morant",
            status = TransferStatus.PENDING
        ),
        TransferItem(
            id = 11,
            amount = 1235.95,
            currency = "EUR",
            date = "Dec 11, 2022 1:31:21 PM",
            details = "Ja's transfer details",
            photoUrl = "https://upload.wikimedia.org/wikipedia/commons/1/13/Joel_Embiid_2019.jpg",
            recipientName = "Joel' transfer details",
            status = TransferStatus.PENDING
        ),
        TransferItem(
            id = 12,
            amount = 12.75,
            currency = "EUR",
            date = "Dec 6, 2022 9:41:35 AM",
            details = "Bam's transfer details",
            photoUrl = "https://upload.wikimedia.org/wikipedia/commons/7/7d/Bam_Adebayo_%28cropped%29.jpg",
            recipientName = "Bam Adebayo",
            status = TransferStatus.PENDING
        )
    )
}
