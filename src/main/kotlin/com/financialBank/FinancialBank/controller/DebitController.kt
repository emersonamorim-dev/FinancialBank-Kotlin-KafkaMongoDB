package com.financialBank.FinancialBank.controller

import org.springframework.web.bind.annotation.*
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import com.financialBank.FinancialBank.model.Transaction
import com.financialBank.FinancialBank.repositories.TransactionRepository


@RestController
@RequestMapping("/transactions")
class DebitController(private val transactionService: TransactionService) {

    @GetMapping
    fun getAllTransactions(): List<Transaction> {
        return transactionService.getAllTransactions()
    }

    @GetMapping("/{id}")
    fun getTransactionById(@PathVariable id: String): Transaction {
        return transactionService.getTransactionById(id)
    }
}

@Service
class TransactionService(private val transactionRepository: TransactionRepository) {

    fun getAllTransactions(): List<Transaction> {
        return transactionRepository.findAll()
    }

    fun getTransactionById(id: String): Transaction {
        return transactionRepository.findById(id).orElseThrow { Exception("Transação não encontrada") }
    }
}



