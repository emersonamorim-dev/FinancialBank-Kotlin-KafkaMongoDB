 package com.financialBank.FinancialBank.controller
 
 import org.springframework.web.bind.annotation.*
 import org.springframework.data.mongodb.repository.MongoRepository
 import org.springframework.stereotype.Repository
 import org.springframework.stereotype.Service
 import com.financialBank.FinancialBank.model.Transaction
 import com.financialBank.FinancialBank.repositories.CreditTransactionRepository
 
 
 
 @RestController
 @RequestMapping("/credit-transactions")
 class CreditTransactionController(private val creditTransactionService: CreditTransactionService) {
 
 @GetMapping
 fun getAllCreditTransactions(): List<Transaction> {
     return creditTransactionService.getAllCreditTransactions()
 }
 
 
 @GetMapping("/{id}")
 fun getCreditTransactionById(@PathVariable id: String): Transaction {
     return creditTransactionService.getCreditTransactionById(id)
 }
}
 
 @Service
 class CreditTransactionService(private val creditTransactionRepository: CreditTransactionRepository) {
 
 fun getAllCreditTransactions(): List<Transaction> {
     return creditTransactionRepository.findAll()
 }
 
 fun getCreditTransactionById(id: String): Transaction {
     return creditTransactionRepository.findById(id).orElseThrow { Exception("Transação de crédito não encontrada") }
  }
 }
 
