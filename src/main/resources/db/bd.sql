CREATE DATABASE empresa_oni_learning;
USE empresa_oni_learning;

CREATE TABLE fornecedor (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(255) NOT NULL,
  data_cadastro TIMESTAMP NOT NULL
);

CREATE TABLE produto (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(255) NOT NULL,
  data_cadastro TIMESTAMP NOT NULL
);

CREATE TABLE fornecedor_produto (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  valor DECIMAL(10,2) NOT NULL,
  data_cadastro TIMESTAMP NOT NULL,
  fornecedor_id BIGINT NOT NULL,
  produto_id BIGINT NOT NULL,
  CONSTRAINT fk_fornecedor FOREIGN KEY (fornecedor_id) REFERENCES fornecedor(id),
  CONSTRAINT fk_produto FOREIGN KEY (produto_id) REFERENCES produto(id)
);


INSERT INTO fornecedor (data_cadastro, nome)
VALUES
('2022-01-01 10:00:00', 'Fornecedor 1'),
('2022-01-02 11:00:00', 'Fornecedor 2'),
('2022-01-03 12:00:00', 'Fornecedor 3');

INSERT INTO produto (data_cadastro, nome)
VALUES
('2022-01-01 10:00:00', 'Produto 1'),
('2022-01-02 11:00:00', 'Produto 2'),
('2022-01-03 12:00:00', 'Produto 3');


INSERT INTO fornecedor_produto (data_cadastro, valor, fornecedor_id, produto_id)
VALUES
('2022-01-01 10:00:00', 10.50, 1, 1),
('2022-01-01 11:00:00', 15.00, 1, 2),
('2022-01-02 12:00:00', 25.75, 2, 1),
('2022-01-03 13:00:00', 30.00, 3, 3);