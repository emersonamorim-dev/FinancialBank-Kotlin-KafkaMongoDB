## FinancialBank - API de Serviços Financeiros

Codificação em Kotlin de API de Serviços Financeiros, que fiz a implementação de  endpoints para manipular transações e atualizações de saldo. A API foi desenvolvida utilizando o framework Spring Boot e armazena os dados em um banco de dados MongoDB juntamente com Kafka.

-** Endpoints - BalanceUpdateController**
A API oferece os seguintes endpoints para manipulação das atualizações de saldo:

1. Listar todas as atualizações de saldo
1. Método: GET
2. URL: /balance-updates
3. Descrição: Retorna uma lista contendo todas as atualizações de saldo registradas no sistema.

2. Obter uma atualização de saldo por ID
1. Método: GET
2. URL: /balance-updates/{id}
3. Parâmetros:
4. id (String) - O ID único da atualização de saldo desejada.
5. Descrição: Retorna os detalhes de uma atualização de saldo específica com base no ID fornecido.

**Estrutura do Projeto**
O projeto está organizado em pacotes para melhor separação de responsabilidades:

1. Pacote com.financialBank.FinancialBank.controller
Este pacote contém os controladores (controllers) da API, que são responsáveis por lidar com as requisições HTTP e retornar as respostas apropriadas. O controlador relacionado às atualizações de saldo é BalanceUpdateController.

2. Pacote com.financialBank.FinancialBank.data
Este pacote contém as classes de dados (data classes) utilizadas para representar as entidades do sistema. No contexto deste projeto, a classe utilizada é BalanceUpdate, que representa uma atualização de saldo.

3. Pacote com.financialBank.FinancialBank.repositories
Este pacote contém as interfaces de repositório (repositories) que definem as operações de acesso a dados relacionadas às atualizações de saldo. O repositório utilizado neste projeto é BalanceUpdateRepository, que é uma extensão de MongoRepository.

4. Pacote com.financialBank.FinancialBank.service
Este pacote contém as classes de serviço (services), que implementam a lógica de negócio relacionada às atualizações de saldo. A classe de serviço utilizada é BalanceUpdateService.

**Executando a API**
Para executar a API, certifique-se de que você tenha as seguintes ferramentas instaladas:

Java JDK
Kotlin
MongoDB
Kafka

Clone o repositório do projeto:

git clone <url_do_repositorio>
Navegue para o diretório raiz do projeto:

cd FinancialBank
Execute a aplicação usando o Gradle Wrapper:
./gradlew bootRun

A API será iniciada e estará disponível em http://localhost:8080. Você pode acessar os endpoints descritos acima através de um cliente HTTP ou testá-los utilizando ferramentas como o Postman.

**- Endpoints - CreditTransactionController**
A API oferece os seguintes endpoints para manipulação das transações de crédito:

1. Listar todas as transações de crédito

1. Método: GET
2. URL: /credit-transactions
3. Descrição: Retorna uma lista contendo todas as transações de crédito registradas no sistema.

2. Obter uma transação de crédito por ID

1. Método: GET
2. URL: /credit-transactions/{id}
3. Parâmetros:
4. id (String) - O ID único da transação de crédito desejada.
5. Descrição: Retorna os detalhes de uma transação de crédito específica com base no ID fornecido.

O projeto está organizado em pacotes para melhor separação de responsabilidades:

1. Pacote com.financialBank.FinancialBank.controller
Este pacote contém os controladores (controllers) da API, que são responsáveis por lidar com as requisições HTTP e retornar as respostas apropriadas. O controlador relacionado às transações de crédito é CreditTransactionController.

2. Pacote com.financialBank.FinancialBank.model
Este pacote contém as classes de modelo (model classes) utilizadas para representar as entidades do sistema. No contexto deste projeto, a classe utilizada é Transaction, que representa uma transação de crédito.

3. Pacote com.financialBank.FinancialBank.repositories
Este pacote contém as interfaces de repositório (repositories) que definem as operações de acesso a dados relacionadas às transações de crédito. O repositório utilizado neste projeto é CreditTransactionRepository, que é uma extensão de MongoRepository.

4. Pacote com.financialBank.FinancialBank.service
Este pacote contém as classes de serviço (services), que implementam a lógica de negócio relacionada às transações de crédito. A classe de serviço utilizada é CreditTransactionService.



- **Endpoints - DebitController**
A API oferece os seguintes endpoints para manipulação das transações:

1. Listar todas as transações

1. Método: GET
2. URL: /transactions
3. Descrição: Retorna uma lista contendo todas as transações registradas no sistema.
4. 2. Obter uma transação por ID
5. Método: GET
6. URL: /transactions/{id}
7. Parâmetros:
8. id (String) - O ID único da transação desejada.
9. Descrição: Retorna os detalhes de uma transação específica com base no ID fornecido.
10. Estrutura do Projeto
11. O projeto está organizado em pacotes para melhor separação de responsabilidades:

1. Pacote com.financialBank.FinancialBank.controller
Este pacote contém os controladores (controllers) da API, que são responsáveis por lidar com as requisições HTTP e retornar as respostas apropriadas. O controlador relacionado às transações é DebitController.

2. Pacote com.financialBank.FinancialBank.model
Este pacote contém as classes de modelo (model classes) utilizadas para representar as entidades do sistema. No contexto deste projeto, a classe utilizada é Transaction, que representa uma transação.

3. Pacote com.financialBank.FinancialBank.repositories
Este pacote contém as interfaces de repositório (repositories) que definem as operações de acesso a dados relacionadas às transações. O repositório utilizado neste projeto é TransactionRepository, que é uma extensão de MongoRepository.

4. Pacote com.financialBank.FinancialBank.service
Este pacote contém as classes de serviço (services), que implementam a lógica de negócio relacionada às transações. A classe de serviço utilizada é TransactionService.


- **Endpoints - StatementRequestController**
A API oferece os seguintes endpoints para manipulação das solicitações de extrato:

1. Listar todas as solicitações de extrato

Método: GET
1. URL: /statement-requests
2. Descrição: Retorna uma lista contendo todas as solicitações de extrato registradas no sistema.
3. 2. Obter uma solicitação de extrato por ID
4. Método: GET
5. URL: /statement-requests/{id}
6. Parâmetros:
7. id (String) - O ID único da solicitação de extrato desejada.
8. Descrição: Retorna os detalhes de uma solicitação de extrato específica com base no ID fornecido.
9. Estrutura do Projeto

O projeto está organizado em pacotes para melhor separação de responsabilidades:

1. Pacote com.financialBank.FinancialBank.controller
Este pacote contém os controladores (controllers) da API, que são responsáveis por lidar com as requisições HTTP e retornar as respostas apropriadas. O controlador relacionado às solicitações de extrato é StatementRequestController.

2. Pacote com.financialBank.FinancialBank.data
Este pacote contém as classes de dados (data classes) utilizadas para representar as entidades do sistema. No contexto deste projeto, a classe utilizada é StatementRequest, que representa uma solicitação de extrato.

3. Pacote com.financialBank.FinancialBank.repositories
Este pacote contém as interfaces de repositório (repositories) que definem as operações de acesso a dados relacionadas às solicitações de extrato. O repositório utilizado neste projeto é StatementRequestRepository, que é uma extensão de MongoRepository.

4. Pacote com.financialBank.FinancialBank.service
Este pacote contém as classes de serviço (services), que implementam a lógica de negócio relacionada às solicitações de extrato. A classe de serviço utilizada é StatementRequestService.




- **Endpoints - TransferTransactionController**
A API oferece os seguintes endpoints para manipulação das transações de transferência:

1. Listar todas as transações de transferência

1. Método: GET
2. URL: /transfer-transactions
3. Descrição: Retorna uma lista contendo todas as transações de transferência registradas no sistema.
4. 2. Obter uma transação de transferência por ID
5. Método: GET
6. URL: /transfer-transactions/{id}
7. Parâmetros:
8. id (String) - O ID único da transação de transferência desejada.
9. Descrição: Retorna os detalhes de uma transação de transferência específica com base no ID fornecido.

**Estrutura do Projeto**
O projeto está organizado em pacotes para melhor separação de responsabilidades:

1. Pacote com.financialBank.FinancialBank.controller
Este pacote contém os controladores (controllers) da API, que são responsáveis por lidar com as requisições HTTP e retornar as respostas apropriadas. O controlador relacionado às transações de transferência é TransferTransactionController.

2. Pacote com.financialBank.FinancialBank.data
Este pacote contém as classes de dados (data classes) utilizadas para representar as entidades do sistema. No contexto deste projeto, a classe utilizada é Transaction, que representa uma transação de transferência.

3. Pacote com.financialBank.FinancialBank.repositories
Este pacote contém as interfaces de repositório (repositories) que definem as operações de acesso a dados relacionadas às transações de transferência. O repositório utilizado neste projeto é TransferTransactionRepository, que é uma extensão de MongoRepository.

4. Pacote com.financialBank.FinancialBank.service
Este pacote contém as classes de serviço (services), que implementam a lógica de negócio relacionada às transações de transferência. A classe de serviço utilizada é TransferTransactionService.


**Observações**
Certifique-se de ter uma instância do MongoDB em execução ou configurar corretamente o acesso ao MongoDB para que a API funcione corretamente.

Autor:
**Emerson Amorim**
