# Relatório do Projeto Integrador IV-A: Calculadora com Testes

## 1. Visão Geral
Este projeto consiste no desenvolvimento de uma classe `Calculadora` em Java, com foco na aplicação de testes unitários e funcionais automatizados com JUnit 5 e no gerenciamento de versão com Git e GitHub.

## 2. Estrutura do Código
- **Calculadora.java:** Contém a lógica de negócio para as quatro operações matemáticas básicas. O método de divisão inclui um tratamento para evitar a divisão por zero, lançando uma `IllegalArgumentException`.
- **CalculadoraTest.java:** Contém os testes unitários para cada um dos métodos da calculadora, cobrindo cenários com números positivos, negativos, zero e o caso de exceção da divisão por zero, utilizando as asserções do JUnit 5.

## 3. Fluxo de Versionamento
O desenvolvimento foi realizado em uma branch separada (`feature/calculadora`) para isolar as novas implementações. Após a conclusão e teste da funcionalidade, a branch foi mesclada à branch principal (`main`) através de um Pull Request, simulando um ambiente de desenvolvimento colaborativo e garantindo a integridade da base de código principal.

## 4. Video de Apresentação
Link: [Apresentação](https://pucdegoias-my.sharepoint.com/:v:/g/personal/1132024101084_pucgo_edu_br/ESWrpdO9f6BFp7A-LOP5UM0BWxEJDdBJuWkItwpJ41oz6Q?e=P7gAut)