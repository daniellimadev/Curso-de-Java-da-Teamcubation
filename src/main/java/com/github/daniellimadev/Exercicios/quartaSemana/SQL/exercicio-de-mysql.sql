CREATE TABLE Pedido (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_usuario VARCHAR(255) NOT NULL
);

CREATE TABLE Produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_pedido INT,
    nome_produto VARCHAR(255) NOT NULL,
    preco_unitario DECIMAL(10, 2) NOT NULL,
    quantidade INT NOT NULL,
    FOREIGN KEY (id_pedido) REFERENCES Pedido(id)
);


INSERT INTO Pedido (nome_usuario) VALUES ('Pedro'), ('André');

INSERT INTO Produto (id_pedido, nome_produto, preco_unitario, quantidade) VALUES
(1, 'Teclado', 100.00, 1),
(1, 'Mouse', 50.00, 1),
(2, 'Pendrive', 30.00, 2),
(2, 'Cadeira', 200.00, 1),
(2, 'Mesa', 150.00, 1);



SELECT P.nome_usuario, SUM(Prod.preco_unitario * Prod.quantidade) AS total_gasto
FROM Pedido P
JOIN Produto Prod ON P.id = Prod.id_pedido
GROUP BY P.nome_usuario
ORDER BY total_gasto DESC;


SELECT P.nome_usuario, COUNT(DISTINCT Prod.nome_produto) AS tipos_produtos
FROM Pedido P
JOIN Produto Prod ON P.id = Prod.id_pedido
GROUP BY P.nome_usuario
ORDER BY tipos_produtos DESC;


SELECT P.nome_usuario, Prod.nome_produto
FROM Pedido P
JOIN Produto Prod ON P.id = Prod.id_pedido
ORDER BY P.nome_usuario, Prod.nome_produto;


SELECT P.nome_usuario, SUM(Prod.quantidade) AS total_estoque
FROM Pedido P
JOIN Produto Prod ON P.id = Prod.id_pedido
GROUP BY P.nome_usuario
ORDER BY total_estoque DESC;


SELECT P.nome_usuario, MAX(Prod.preco_unitario) AS produto_mais_caro
FROM Pedido P
JOIN Produto Prod ON P.id = Prod.id_pedido
GROUP BY P.nome_usuario
ORDER BY produto_mais_caro DESC;
