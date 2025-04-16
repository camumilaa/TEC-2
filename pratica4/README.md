# Prática 4 - Consumir API do Gemini

Chatbot simples feito em Java com Spring, que consome a API do Gemini para responder perguntas do usuário via terminal.

## Funcionalidades

- Envia pergunta do usuário para a API
- Recebe e exibe a resposta da IA
- Grava o histórico da conversa com data, hora e autor
- Sai ao digitar `fatec_sair`
- Trata erros de conexão com a API

## Como usar

1. Coloque sua chave da API no campo `API_URL` no código.
2. Compile e execute o projeto.
3. Faça perguntas no terminal.
4. Digite `fatec_sair` para encerrar.

As conversas são salvas no arquivo `chat_log.txt`.
