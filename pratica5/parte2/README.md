# README

## Descrição

Este projeto demonstra como manipular dados de produtos utilizando **Streams** e **Lambdas** em Java. O objetivo é filtrar produtos por categoria, aplicar um desconto em produtos específicos e calcular a soma do preço de todos os produtos.

### Funcionalidades

- **Filtragem**: Filtra produtos da categoria "Eletronico".
- **Desconto**: Aplica um desconto de 10% em produtos com preço superior a R$ 100.
- **Soma Total**: Calcula a soma total dos preços de todos os produtos.

### Arquivos

- **`Produto.java`**: Define a classe `Produto`, com os atributos `nome`, `categoria`, `preco` e métodos para aplicar desconto e exibir o produto.
- **`Main.java`**: Contém a lógica principal, realizando operações de filtragem e cálculo de soma dos preços dos produtos.

## Como Usar

1. Compile e execute os arquivos no seu ambiente Java.
2. A saída será exibida no console, mostrando os produtos com desconto e a soma total dos preços.

## Exemplo de Saída

```plaintext
Lista dos produtos com desconto aplicado: 
Notebook - Eletronico 2700.00
Iphone - Eletronico 6300.00
Teclado - Eletronico 270.00

Soma total dos preços de todos os produtos: 11670.00
