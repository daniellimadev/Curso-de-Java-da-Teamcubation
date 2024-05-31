# Desafios!

## Desafio 01
Link do repositório no Github: [Unitary tests FizzBuzz](https://github.com/daniellimadev/Unitary-tests-FizzBuzz)
```
Descrição do desafio
Escreva um código onde você receberá um número n, e deverá imprimir todos os números, começando de 1 a n, com a seguinte condição:
1. Se um número for divisível por 3, em vez de imprimir o número, você deverá imprimir Fizz.

2. Se um número for divisível por 5, em vez de imprimir o número, você deverá imprimir Buzz.

3. Se um número for divisível por 3 e 5 ao mesmo tempo, você deverá imprimir o FizzBuzz.

4. Se nenhum dos casos acima for atendido, basta imprimir o número.

```


## Desafio 02

Link do repositório no Github: [Desafio de Mock](https://github.com/daniellimadev/Desafio-de-Mock)

### Objetivo:
- Fixar o aprendizado de uso de mocks e spies em testes unitários
- Verificar a diferença de comportamento entre o mock e o spy

### Pré-requisito:
- Ter o JUnit e o Mockito nas dependências do projeto

### Preparo das classes:
- Crie uma classe CaixaEletronico que tenha uma dependência de uma classe Banco
- A classe Banco deve ter dois métodos que retornem double: getSaldoContaCorrente e getSaldoContaPoupanca
- Crie um método na classe CaixaEletronico que chame os dois métodos da classe Banco e faça qualquer coisa com eles

### Preparo dos testes:
- Crie uma classe de teste CaixaEletronicoTest
- Crie um método de teste para testar o seu método da classe CaixaEletronico

### Teste 1:
- Teste seu método da classe CaixaEletronico usando um MOCK da classe Banco, onde você irá fazer com que os dois métodos da classe Banco retornem valores diferentes dos valores reais.

### Teste 2:
- Teste seu método da classe CaixaEletronico usando um SPY da classe Banco, onde você irá fazer com que um dos métodos da classe Banco retorne um valor diferente do valor real, e o outro método você não irá modificar.


## Desafio 03

Link do repositório no Github: [ChecklistTest TDD](https://github.com/daniellimadev/ChecklistTest-TDD)

### Exercício de TDD!

- Aqui temos um ChecklistTest, os testes unitários já prontos de uma aplicação de "To Do" (lista de tarefas).

- O desafio consiste em criar duas classes (Checklist e Tarefa) que vão atender aos 7 testes unitários dessa classe ChecklistTest.

- O desafio será considerado concluído quando os 7 testes unitários estiverem passando.

- Lembrando que não se deve alterar a classe ChecklistTest.


- Neste desafio será necessário ter aprendido os conceitos de várias coisas já vistas até aqui, desde variáveis, passando por algoritmos, classes, objetos e métodos, até chegar nos assuntos dessa semana: operações em listas e testes unitários.

