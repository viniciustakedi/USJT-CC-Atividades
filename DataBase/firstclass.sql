CREATE DATABASE db_pessoas;
USE db_pessoas;


CREATE TABLE tb_pessoas (
	id_pessoas 	INT NOT NULL AUTO_INCREMENT,
    nome 		VARCHAR(255),
    fone		VARCHAR(155),
    email		VARCHAR(255),
    PRIMARY KEY (id_pessoas)
);

INSERT INTO tb_pessoas(nome, fone, email)
VALUES ('Davi', '20000000', 'davi@gmail.com');

SELECT * FROM tb_pessoas;

UPDATE tb_pessoas SET nome = 'Davi Takedi'
WHERE id_pessoas = 1;