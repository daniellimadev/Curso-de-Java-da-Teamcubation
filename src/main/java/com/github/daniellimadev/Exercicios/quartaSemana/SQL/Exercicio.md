# Exercício SQL.

- Objetivo: Testar conhecimentos em MySQL.

- Execução: Execute em um ambiente com MySQL configurado, independente da plataforma (Workbench, DBeaver, etc).

- Entregável: Entregue um arquivo .sql com todas as queries que você realizou (create table, inserts, selects).


- Parte 1 - Crie duas tabelas:

1. Pedido, com campos: id (chave primária) e nome do usuário que realizou o pedido
2. Produto, com campos: id (chave primária), id do pedido (chave estrangeira), nome do produto, preço unitário do produto, quantidade de produtos comprados



- Parte 2 - Popular as tabelas:

1. Crie dois pedidos com dados diferentes
2. Crie cinco produtos, um pedido com dois produtos, e outro pedido com três produtos



- Parte 3 - Selects:

1. Crie um select que exiba o preço total que cada usuário gastou, ordenando pelo usuário mais gastador. Ex.:

| Pedro | 500 |
|-------|-----|

| André | 300 |
|-------|-----|


2. Crie um select que exiba a quantidade de tipos de produtos diferentes por cada usuário, ordenando pelo usuário que mais tem produtos diferentes. Ex.:


| Pedro | 3 |
|-------|---|

| André | 2 |
|-------|---|

3. Crie um select que exiba os nomes dos produtos que cada usuário comprou, ordenando pelo nome do usuário e em seguida pelo nome do produto. Ex.:


| André | Camisa   |
|-------|----------|

| André | Tênis    |
|-------|----------|

| Pedro | Mouse    |
|-------|----------|

| Pedro | Pendrive |
|-------|----------|

| Pedro | Teclado  |
|-------|----------|

4. Crie um select que exiba a quantidade total de estoque de todos os produtos comprados por cada usuário, ordenando pelo usuário que mais comprou. Ex.:

| Pedro | 10 |
|-------|----|

| André | 5  |
|-------|----|

5. Crie um select que exiba apenas o valor do produto mais caro que cada usuário comprou, ordenando pelo valor do produto. Ex.:

| Pedro | 200 |
|-------|-----|

| André | 150 |
|-------|-----|
