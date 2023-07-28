# Use a imagem base do Java 17
FROM openjdk:17-jdk-alpine

# Copie o arquivo JAR para a imagem
COPY build/libs/app.jar FinancialBank.jar

# Exponha a porta que a sua aplicação usa (altere para a porta correta se não for 8080)
EXPOSE 8080

# Defina o comando para iniciar a sua aplicação
ENTRYPOINT ["java", "-jar", "/FinancialBank.jar"]
