# Prática 7 - Spring JPA Hibernate: Consumo de API de Receitas

Aplicação Java com Spring Boot que consome uma API pública de receitas e permite salvar os dados em um banco PostgreSQL.

## Funcionalidades

- Busca uma receita pelo ID via API externa
- Exibe os dados da receita no terminal
- Salva a receita no banco caso o usuário confirme
- Lista todas as receitas salvas
- Armazena ingredientes como lista (usando `@ElementCollection`)
- Menu simples via terminal

## Como usar

1. Configure o `application.properties` com os dados do seu banco PostgreSQL.
2. Execute a aplicação (`ReceitaApplication.java`).
3. Use o menu do terminal para:
   - Buscar receita por ID
   - Salvar receita
   - Ver todas as receitas salvas
4. Pressione `0` para sair.

A API usada é `https://dummyjson.com/recipes/{id}`.

> Exemplo de execução no terminal:
> 
> ```
> --- Menu ---
> 1. Buscar e salvar receita
> 2. Ver todas as receitas salvas
> 0. Sair
> ```

