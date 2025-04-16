# Desafio: Processamento de Dados da API JSONPlaceholder com Streams e Lambdas

## Descrição

Este projeto em Java consome dados do endpoint **/posts** da API JSONPlaceholder e aplica uma série de operações utilizando **Streams** e **Expressões Lambda**. O objetivo é realizar operações como filtragem, ordenação, agrupamento, mapeamento e redução dos dados.

## Funcionalidades

- **Consumo da API**: Realiza uma requisição HTTP para o endpoint `https://jsonplaceholder.typicode.com/posts`.
- **Conversão para Objetos**: Converte a resposta JSON da API para uma lista de objetos `Post`.
- **Operações com Streams e Lambdas**:
  - **Filtragem**: Filtra os posts que contêm a palavra "qui" no título.
  - **Ordenação**: Ordena os posts filtrados pelo `id` em ordem crescente.
  - **Agrupamento**: Agrupa os posts por `userId` e exibe a quantidade de posts por usuário.
  - **Mapeamento**: Mapeia os posts filtrados para uma lista contendo apenas os títulos dos posts.
  
- **Exibição dos Resultados**: Imprime os resultados de cada operação no console de forma organizada.

## Estrutura do Projeto

### `Main.java`

Classe principal que executa o fluxo do projeto:
1. Realiza a requisição HTTP para a API.
2. Converte a resposta JSON em uma lista de objetos `Post`.
3. Processa os posts utilizando a classe `PostProcessor`.

### `ApiService.java`

Responsável por fazer a requisição HTTP para a API JSONPlaceholder e obter a resposta JSON.

### `Post.java`

Classe modelo que representa os posts da API com os atributos `userId`, `id`, `title`, e `body`.

### `PostProcessor.java`

Responsável pelo processamento dos posts com operações de filtragem, ordenação, agrupamento e mapeamento usando Streams e Lambdas.

### `PostService.java`

Classe auxiliar para converter a resposta JSON em uma lista de objetos `Post` utilizando a biblioteca **Gson**.

### `pom.xml`

Arquivo de configuração do Maven, incluindo a dependência para a biblioteca **Gson**.

## Como Usar

1. Clone este repositório.
2. Abra o projeto em sua IDE Java.
3. Verifique se a versão do Java está configurada para **Java 11** ou superior.
4. Compile e execute a classe `Main.java` para ver os resultados das operações aplicadas aos dados da API.

### Exemplo de Saída:

```plaintext
Posts filtrados e ordenados:
Post{id=4, title='qui est esse', userId=1}
Post{id=5, title='qui eu não sei', userId=2}

Contagem de posts por userId:
User 1: 1 posts
User 2: 1 posts

Soma dos IDs dos posts filtrados: 9

Títulos dos posts filtrados:
qui est esse
qui eu não sei
