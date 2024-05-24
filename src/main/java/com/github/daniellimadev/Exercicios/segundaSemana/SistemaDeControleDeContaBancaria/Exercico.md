**Exercício de Java: Sistema de Controle de Conta Bancária**

**Objetivo:** Este exercício visa praticar a criação e o uso de classes e métodos em Java. Os alunos irão desenvolver um sistema simples de controle de contas bancárias, onde será possível gerenciar contas, realizar depósitos, saques e transferências entre contas.

**Descrição do Exercício:**

1. **Classe ContaBancaria:**
- Atributos:
- String titular
- String numeroConta
- double saldo
- Métodos:
- ContaBancaria(String titular, String numeroConta, double saldoInicial) - Construtor para inicializar os atributos.
- void depositar(double valor) - Método para depositar um valor na conta.
- boolean sacar(double valor) - Método para sacar um valor da conta. Retorna true se a operação for bem-sucedida e false se não houver saldo suficiente.
- boolean transferir(double valor, ContaBancaria destino) - Método para transferir um valor para outra conta. Retorna true se a operação for bem-sucedida e false se não houver saldo suficiente.
2. **Classe Banco:**
- Atributos:
- List<ContaBancaria> contas
- Métodos:
- void adicionarConta(ContaBancaria conta) - Método para adicionar uma nova conta à lista de contas.
- ContaBancaria buscarConta(String numeroConta) - Método para buscar uma conta pelo número da conta. Retorna a conta encontrada ou null se não existir.
- void listarContas() - Método para listar todas as contas do banco com suas informações.

3. **Classe Principal (Main):**
- Métodos:
- public static void main(String[] args) - Método principal onde será instanciado o objeto Banco e algumas contas bancárias para realizar operações de depósito, saque e transferência.

**Passos a seguir:**

1. Crie a classe ContaBancaria com seus atributos e métodos.
1. Crie a classe Banco com seus atributos e métodos.
1. Na classe Principal, crie uma instância da classe Banco e adicione algumas contas bancárias.
1. Realize operações de depósito, saque e transferência entre as contas criadas.
1. Liste as contas do banco e exiba suas informações após as operações.
