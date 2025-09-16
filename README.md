# Desafio Backend BTG Pactual — Build & Run

Esse repositório contém a solução para o desafio backend do BTG Pactual promovido pela Build & Run.

## 🎯 Objetivo

Construir um microserviço com as seguintes funcionalidades principais:

- Criar microserviço em Spring Boot. 
- Consumir filas do RabbitMQ.  
- Comunicar com banco de dados MongoDB via Docker. 
- Mapear uma coleção (collection) do MongoDB para entidades no Spring. 
- Fazer agregações (aggregations) no MongoDB usando Spring. 
- Fazer logs usando SLF4J.  

---

## 🗂️ Estrutura do Repositório

- `src/main/java/...` — código-fonte do microserviço Spring Boot.  
- `src/main/resources` — configurações (aplicação, YAML/Properties, etc.).  
- `docker-compose.yml` — para orquestrar RabbitMQ, MongoDB. 

---

## 🛠️ Pré-requisitos

- Java (versão 21 ou superior)  
- Maven
- Docker & Docker Compose

---

## 🚀 Como rodar

1. Clonar o repositório  
   ```bash
   git clone https://github.com/lufrancazs/desafio_btg.git
   ```

2. Iniciar os serviços necessários via Docker Compose  
   ```bash
   docker-compose up
   ```

3. Construir e executar a aplicação  
   ```bash
   ./mvnw spring-boot:run
   ```

4. Verificar logs, conexão com RabbitMQ, MongoDB etc.

---

## 🔍 Funcionalidades

- Consumo de mensagens de uma fila no RabbitMQ.  
- Persistência de dados em MongoDB.  
- Operações de leitura e inserção.  
- Agregações no MongoDB (por exemplo agrupamentos, filtros).  
- Log estruturado via SLF4J para acompanhar o fluxo e possíveis erros.

---

## 📚 Links úteis

- [Repositório oficial do desafio](https://github.com/buildrun-tech/buildrun-desafio-backend-btg-pactual) ([brunograna.notion.site](https://brunograna.notion.site/Desafio-Backend-BTG-Pactual-Build-Run-3f48048e3e594fbea580c006eac6ff08))
