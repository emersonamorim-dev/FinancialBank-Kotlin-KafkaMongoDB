package com.financialBank.FinancialBank.repositories

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import com.financialBank.FinancialBank.data.BalanceUpdate


@Repository
interface BalanceUpdateRepository : MongoRepository<BalanceUpdate, String> {
}
