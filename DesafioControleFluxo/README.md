# 🎉 Desafio Controle de Fluxo 🚀

Este projeto é um desafio proposto pela [Digital Innovation One (DIO)](https://www.dio.me/) e tem como objetivo reforçar os conceitos de controle de fluxo em Java, além de lidar com entrada de dados e criação de exceções personalizadas. 

## 📖 Sobre o Projeto

O projeto é um programa que, a partir de dois parâmetros inteiros recebidos pelo terminal, realiza a impressão de uma série de números incrementados conforme o intervalo entre esses dois parâmetros. Ele também inclui uma validação que garante que o primeiro parâmetro seja menor que o segundo.

### ✅ Funcionalidades

1. **Recebimento de Parâmetros**: O programa solicita dois números inteiros pelo terminal, representando o intervalo para a contagem. 
2. **Validação de Parâmetros**: 
   - Se o primeiro parâmetro for maior que o segundo, uma exceção personalizada (`ParametrosInvalidosException`) é lançada. ❌
   - Caso contrário, o programa realiza uma contagem baseada na diferença entre os dois números. ✅
3. **Impressão de Resultados**: Para cada incremento entre o intervalo dos números, uma mensagem é exibida no console, indicando o número atual da contagem. 🖨️

### 💡 Exemplo de Execução

Para exemplificar, considere o seguinte cenário de entrada:

```
Digite o primeiro parâmetro:
12
Digite o segundo parâmetro:
30
```

Saída esperada:

```
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
...
Imprimindo o número 18
```

Caso o primeiro parâmetro seja maior que o segundo, o programa exibirá uma mensagem de erro:

```
O segundo parâmetro deve ser maior que o primeiro
```

## 🛠️ Estrutura do Projeto

O projeto contém duas classes principais:

- **Contador**: A classe principal que contém a lógica do programa. Ela:
  - Recebe os parâmetros do usuário; 
  - Chama o método `contar`, que realiza a contagem ou lança a exceção personalizada.

- **ParametrosInvalidosException**: Classe de exceção personalizada que é acionada caso o primeiro parâmetro seja maior que o segundo. ⚠️

## 🚀 Como Executar o Projeto

1. Clone o repositório ou faça o download dos arquivos.
2. Compile o projeto em um ambiente Java.
3. Execute a classe `Contador`:
   ```bash
   java Contador
   ```
4. Insira os dois números conforme solicitado.

## 💻 Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto.
- **IDE**: Recomenda-se o uso de IDEs como IntelliJ IDEA ou Eclipse para facilitar a execução e depuração.

## 📞 Contato

Este projeto foi desenvolvido durante o curso de **Controle de Fluxo em Java** na Digital Innovation One. 