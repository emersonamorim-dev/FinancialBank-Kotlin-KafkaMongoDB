package com.financialBank.FinancialBank.repositories

import com.financialBank.FinancialBank.model.Transaction
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CreditTransactionRepository : MongoRepository<Transaction, String>{
}
