# BFF Crud

> Descrição curta da aplicação.

![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.0-6DB33F?style=for-the-badge&logo=spring-boot)
![Kafka](https://img.shields.io/badge/Kafka-3.0.0-231F20?style=for-the-badge&logo=apache-kafka)
![MongoDB](https://img.shields.io/badge/MongoDB-5.0.0-47A248?style=for-the-badge&logo=mongodb)
![Arquitetura Hexagonal](https://img.shields.io/badge/Arquitetura-Hexagonal-000000?style=for-the-badge)

## Sumário

- [Visão Geral](#visão-geral)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Arquitetura](#arquitetura)
- [Instalação e Configuração](#instalação-e-configuração)
- [Uso](#uso)
- [Testes](#testes)
- [Contribuindo](#contribuindo)
- [Licença](#licença)

## Visão Geral

Esta aplicação foi desenvolvida utilizando Java 17, Spring Boot, Kafka, e MongoDB, seguindo os princípios da arquitetura hexagonal (Ports and Adapters). A aplicação é projetada para ser altamente modular e de fácil manutenção, permitindo a integração de novos recursos e adaptações sem afetar o core do sistema.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação principal.
- **Spring Boot**: Framework para criação de aplicações Java.
- **Apache Kafka**: Plataforma de streaming de eventos para comunicação assíncrona entre serviços.
- **MongoDB**: Banco de dados NoSQL utilizado para armazenar dados da aplicação.
- **Arquitetura Hexagonal**: Abordagem arquitetural que promove a separação clara entre as camadas da aplicação.

## Arquitetura

### Arquitetura Hexagonal (Ports and Adapters)

A aplicação segue o padrão de Arquitetura Hexagonal, que organiza o código em três componentes principais:

1. **Core (Domínio)**: Contém a lógica de negócios da aplicação, completamente independente de frameworks e tecnologias externas.
   - Entidades de Domínio
   - Serviços de Domínio
   - Portas (Interfaces)
   
2. **Adapters**: Implementações das interfaces definidas no core. Adaptadores para os mecanismos externos, como persistência (MongoDB) e comunicação (Kafka).
   - Adapters de Saída: Implementações de repositórios e mensagens.
   - Adapters de Entrada: Controladores e listeners.

3. **Ports**: Interfaces que conectam o Core às bordas do sistema, permitindo a entrada e saída de dados sem acoplamento direto com as tecnologias externas.

### Estrutura do Projeto

├── src │ ├── main │ │ ├── java │ │ │ └── com │ │ │ └── exemplo │ │ │ ├── core (Domínio) │ │ │ ├── adapters (Implementações de Ports) │ │ │ ├── ports (Interfaces do Core) │ │ │ ├── config (Configurações de Spring) │ │ │ └── Application.java (Classe principal) │ ├── test │ │ ├── java │ │ │ └── com │ │ │ └── exemplo │ │ │ └── tests (Testes unitários e de integração) ├── pom.xml (Configuração do Maven) └── README.md

## Instalação e Configuração

### Pré-requisitos

- **Java 17** instalado
- **Apache Maven** para gerenciamento de dependências
- **Docker** (opcional, para Kafka e MongoDB)

### Configuração do Kafka e MongoDB

Você pode executar o Kafka e o MongoDB utilizando Docker:

```bash
docker-compose up -d
```