package com.financialBank.FinancialBank

import com.financialBank.FinancialBank.data.BalanceUpdate
import com.financialBank.FinancialBank.data.FinancialData
import com.financialBank.FinancialBank.data.StatementRequest
import com.financialBank.FinancialBank.data.Transaction
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.Query

@SpringBootApplication
class FinancialBankApplication {

    @Bean
    fun init(mongoTemplate: MongoTemplate): CommandLineRunner {
        return CommandLineRunner {
            // Aqui você pode inicializar suas collections e documentos
            // Por exemplo, para criar uma nova collection e inserir um documento:
            if (!mongoTemplate.collectionExists("balanceUpdates")) {
                mongoTemplate.createCollection("balanceUpdates")
            }
            val balanceUpdate = BalanceUpdate("1", 1000.0)
            mongoTemplate.save(balanceUpdate, "balanceUpdates")

            if (!mongoTemplate.collectionExists("financialData")) {
                mongoTemplate.createCollection("financialData")
            }
            val financialData = FinancialData("1", 2000.0)
            mongoTemplate.save(financialData, "financialData")

            if (!mongoTemplate.collectionExists("statementRequests")) {
                mongoTemplate.createCollection("statementRequests")
            }
            val statementRequest = StatementRequest("1", "1001")
            mongoTemplate.save(statementRequest, "statementRequests")

            if (!mongoTemplate.collectionExists("transactions")) {
                mongoTemplate.createCollection("transactions")
            }
            val transaction = Transaction("1", 500.0)
            mongoTemplate.save(transaction, "transactions")
        }
    }
}

fun main(args: Array<String>) {
    runApplication<FinancialBankApplication>(*args)
}
