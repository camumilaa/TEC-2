# TEC2 - Projetos Java II

Este repositório contém os projetos e atividades desenvolvidos na disciplina de **Java II** durante o curso de **Desenvolvimento de Software Multiplataforma** na **FATEC Praia Grande**, sob orientação do professor **Alessandro Ferreira Paz Lima**.

---

## 📚 Estrutura das atividades

Cada pasta representa uma aula ou prática diferente, contendo seu respectivo código-fonte e, quando necessário, um `README.md` específico com explicações detalhadas.

### ▶️ Aulas e Práticas

| Pasta     | Conteúdo                                                                 |
|-----------|--------------------------------------------------------------------------|
| `aula01`  | CRUD Simples com Banco de Dados (PostgreSQL)                             |
| `pratica2`| Consulta de CEP com a API ViaCEP                                        |
| `pratica3`| Consulta de preços de veículos com a API da Tabela FIPE                  |
| `pratica4`| Consumir API do Gemini com Java e Spring                                |
| `pratica5`| Manipulação de dados de funcionários e produtos utilizando Streams e Lambdas |
| `pratica6`| Processamento de Dados da API JSONPlaceholder com Streams e Lambdas      |

---

## 🛠️ Tecnologias utilizadas

- **Java 11**
- **Maven** (em projetos que utilizam bibliotecas externas como Gson)
- **Gson** (para manipulação de JSON)
- **Java Streams e Expressões Lambda**

---

## 📌 Observações

- Todos os projetos foram desenvolvidos com foco em praticar conceitos de **Programação Funcional com Java**, utilizando `Streams`, `Lambdas`, e boas práticas com orientação a objetos.
- Os códigos foram testados com a versão 11 do JDK.

---

## 📄 Descrição de cada pasta

### `aula01`: CRUD Simples com Banco de Dados (PostgreSQL)
Este projeto implementa um CRUD simples para inserção e listagem de alunos em um banco de dados PostgreSQL utilizando JDBC. O sistema permite que o usuário insira novos alunos e visualize os alunos cadastrados.

### `pratica2`: Consulta de CEP
Projeto em Java que utiliza a API ViaCEP para realizar consultas de endereços. O usuário digita o CEP, e o sistema retorna as informações do endereço e as grava em um arquivo de log.

### `pratica3`: Consulta de preços de veículos com a API da Tabela FIPE
Este projeto consulta informações sobre veículos, como preço, marca, modelo e ano, utilizando a API da Tabela FIPE. O sistema permite ao usuário selecionar a marca, modelo e ano do veículo e exibir o preço médio.

### `pratica4`: Consumir API do Gemini
Projeto que consome a API do Gemini para um chatbot simples. O usuário faz perguntas no terminal, e o sistema envia para a API, recebendo uma resposta de IA que é exibida. Além disso, as conversas são registradas em um arquivo de log.

### `pratica5`: Manipulação de Dados com Streams e Lambdas
O projeto é dividido em duas partes: a primeira manipula dados de funcionários, filtrando, ordenando e calculando salários; a segunda parte lida com dados de produtos, realizando filtragem, aplicando descontos e calculando a soma dos preços.

### `pratica6`: Processamento de Dados da API JSONPlaceholder
Este projeto consome dados do endpoint **/posts** da API JSONPlaceholder e aplica uma série de operações utilizando **Streams** e **Expressões Lambda**, como filtragem, ordenação, agrupamento e mapeamento dos dados.

---

## 👨‍🏫 Professor responsável

**Alessandro Ferreira Paz Lima**  
Disciplina: Java II  
Instituição: FATEC Praia Grande

---
