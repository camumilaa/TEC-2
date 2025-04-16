# Projeto: CRUD Simples com Banco de Dados (PostgreSQL)

## Descrição

Este projeto Java implementa um CRUD simples para inserção e listagem de alunos em um banco de dados PostgreSQL. O sistema utiliza JDBC para realizar conexões e executar comandos SQL diretamente no banco.

## Funcionalidades

- Inserção de um novo aluno via terminal (CPF e nome).
- Listagem de todos os alunos cadastrados no banco.
- Conexão com banco de dados PostgreSQL utilizando JDBC.

## Estrutura do Projeto

### `Main.java`

Classe principal do sistema. Permite ao usuário:
- Escolher entre cadastrar um novo aluno ou listar os existentes.
- Interagir via terminal (entrada de dados pelo console).

### `DB.java`

Classe responsável por estabelecer a conexão com o banco de dados PostgreSQL.

Parâmetros de conexão utilizados:
- URL: `jdbc:postgresql://localhost:5432/db_fatec`
- Usuário: `fatec`
- Senha: `fatec777`

### `Aluno.java`

Classe modelo que representa um aluno com os atributos:
- `cpf`: CPF do aluno
- `nome`: Nome do aluno

## Como Usar

1. Certifique-se de ter um banco PostgreSQL rodando com:
   - Banco: `db_fatec`
   - Tabela: `aluno(cpf VARCHAR, nome VARCHAR)`

2. Compile e execute a aplicação.
3. Escolha entre:
   - Inserir um novo aluno (opção 1)
   - Listar todos os alunos (opção 2)

### Exemplo de Saída

```plaintext
Escolha uma opção:
1. Inserir novo aluno
2. Listar todos os alunos
> 2
Aluno{cpf='12345678900', nome='João'}
Aluno{cpf='98765432100', nome='Maria'}
