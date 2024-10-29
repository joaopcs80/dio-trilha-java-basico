# 🏦 Projeto ContaBanco

Este projeto faz parte da trilha de estudos de Java na plataforma [Digital Innovation One](https://www.dio.me/), e foi desenvolvido para praticar conceitos básicos de manipulação de dados via terminal, uso de variáveis, tipos de dados e formatação de strings.

## 📋 Descrição

O **ContaBanco** é uma aplicação de console que simula a criação de uma conta bancária. O usuário insere dados como o número da conta, agência, nome do cliente e saldo inicial, e o sistema exibe uma mensagem personalizada com os dados fornecidos, simulando a finalização de cadastro.

### Exemplo de Fluxo do Programa

1. O programa solicita os dados do usuário:
    - Número da Conta
    - Número da Agência
    - Nome do Cliente
    - Saldo Inicial

2. Após a inserção dos dados, uma mensagem de boas-vindas é exibida, confirmando o sucesso do cadastro da conta bancária.

### Exemplo de Saída

```plaintext
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```

## 🚀 Funcionalidades

- Leitura de dados do usuário via terminal com `Scanner`.
- Armazenamento de dados em variáveis.
- Exibição de uma mensagem de confirmação utilizando concatenação de strings.

## 🛠️ Tecnologias Utilizadas

- **Java** - Linguagem de programação.
- **Scanner** - Para entrada de dados do usuário via terminal.
- **Concatenação de Strings** - Para personalizar a mensagem final exibida ao usuário.

## 📂 Estrutura de Arquivo

O projeto possui a seguinte estrutura:

```
ContaBanco/
├── ContaTerminal.java
└── README.md
```

## 📝 Como Executar

1. Compile o arquivo `ContaTerminal.java`.
2. Execute o programa e insira os dados solicitados diretamente no terminal.