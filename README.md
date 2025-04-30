# TEC2 - Projetos Java II

![Java](https://img.shields.io/badge/Java-11-blue?logo=java&logoColor=white) 
![Maven](https://img.shields.io/badge/Maven-3.8.1-c71a36?logo=apache-maven&logoColor=white)

Este repositório contém os projetos e atividades desenvolvidos na disciplina de **Java II** durante o curso de **Desenvolvimento de Software Multiplataforma** na **FATEC Praia Grande**, sob orientação do professor **Alessandro Ferreira Paz Lima**.

---

## 📚 Estrutura das atividades

Cada pasta representa uma aula ou prática diferente, contendo seu respectivo código-fonte e, quando necessário, um `README.md` específico com explicações detalhadas.

### ▶️ Aulas e Práticas

| Pasta     | Conteúdo                                                                 |
|-----------|--------------------------------------------------------------------------|
| [aula01](aula01)  | CRUD Simples com Banco de Dados (PostgreSQL)                             |
| [pratica2](pratica2) | Consulta de CEP com a API ViaCEP                                        |
| [pratica3](pratica3) | Consulta de preços de veículos com a API da Tabela FIPE                  |
| [pratica4](pratica4) | Consumir API do Gemini com Java e Spring                                |
| [pratica5](pratica5) | Manipulação de dados de funcionários e produtos utilizando Streams e Lambdas |
| [pratica6](pratica6) | Processamento de Dados da API JSONPlaceholder com Streams e Lambdas      |
| [pratica7](pratica7) | Consumo de API externa com persistência condicional (Spring JPA + Hibernate) |

---

## 🛠️ Tecnologias Utilizadas

- **Java 11**: Ambiente de desenvolvimento.
- **Maven**: Gerenciamento de dependências e build.
- **Gson**: Manipulação de JSON.
- **Spring Boot**: Framework para construção de aplicações web e APIs.
- **Hibernate/JPA**: Persistência de dados com mapeamento objeto-relacional.
- **Java Streams e Expressões Lambda**: Manipulação funcional de dados.

---

## 📌 Observações

- Todos os projetos foram desenvolvidos com foco em praticar conceitos de **Programação Funcional com Java**, utilizando `Streams`, `Lambdas`, e boas práticas com orientação a objetos.
- Os códigos foram testados com a versão 11 do JDK.

---

## 📄 Descrição de cada pasta

### [aula01](aula01): CRUD Simples com Banco de Dados (PostgreSQL)
Este projeto implementa um CRUD simples para inserção e listagem de alunos em um banco de dados PostgreSQL utilizando JDBC. O sistema permite que o usuário insira novos alunos e visualize os alunos cadastrados.

### [pratica2](pratica2): Consulta de CEP
Projeto em Java que utiliza a API ViaCEP para realizar consultas de endereços. O usuário digita o CEP, e o sistema retorna as informações do endereço e as grava em um arquivo de log.

### [pratica3](pratica3): Consulta de preços de veículos com a API da Tabela FIPE
Este projeto consulta informações sobre veículos, como preço, marca, modelo e ano, utilizando a API da Tabela FIPE. O sistema permite ao usuário selecionar a marca, modelo e ano do veículo e exibir o preço médio.

### [pratica4](pratica4): Consumir API do Gemini
Projeto que consome a API do Gemini para um chatbot simples. O usuário faz perguntas no terminal, e o sistema envia para a API, recebendo uma resposta de IA que é exibida. Além disso, as conversas são registradas em um arquivo de log.

### [pratica5](pratica5): Manipulação de Dados com Streams e Lambdas
O projeto é dividido em duas partes: a primeira manipula dados de funcionários, filtrando, ordenando e calculando salários; a segunda parte lida com dados de produtos, realizando filtragem, aplicando descontos e calculando a soma dos preços.

### [pratica6](pratica6): Processamento de Dados da API JSONPlaceholder
Este projeto consome dados do endpoint **/posts** da API JSONPlaceholder e aplica uma série de operações utilizando **Streams** e **Expressões Lambda**, como filtragem, ordenação, agrupamento e mapeamento dos dados.

### [pratica7](pratica7): Consumo de API externa com persistência condicional (Spring JPA + Hibernate)
Este projeto consome uma API externa de receitas e permite ao usuário buscar receitas pelo terminal. O sistema exibe os dados recebidos e oferece a opção de salvar a receita em um banco de dados PostgreSQL. As receitas salvas podem ser listadas posteriormente. O projeto utiliza Spring Boot, JPA, Hibernate e anotações como `@Entity` e `@ElementCollection` para persistência dos dados.

---

## 👨‍🏫 Professor responsável

**Alessandro Ferreira Paz Lima**  
Disciplina: Java II  
Instituição: FATEC Praia Grande
