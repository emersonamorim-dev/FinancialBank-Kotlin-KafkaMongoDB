package com.financialBank.FinancialBank.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "transactions")
data class Transaction(
    @Id
    val id: String,
    val amount: Double,

)
