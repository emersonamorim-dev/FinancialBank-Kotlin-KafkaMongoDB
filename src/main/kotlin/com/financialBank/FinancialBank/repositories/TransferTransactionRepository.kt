package com.financialBank.FinancialBank.repositories

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import com.financialBank.FinancialBank.data.Transaction


@Repository
interface TransferTransactionRepository : MongoRepository<Transaction, String> {
}
