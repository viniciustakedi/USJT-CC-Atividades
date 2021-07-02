CREATE DATABASE db_gui;
USE db_gui;

#DML
CREATE TABLE tb_usuario (
	id 		INT PRIMARY KEY AUTO_INCREMENT,
    nome 	VARCHAR(255),
    usuario VARCHAR(255),
    senha 	VARCHAR(255)
);

CREATE TABLE tb_curso (
	id 		INT PRIMARY KEY AUTO_INCREMENT,
    nome 	VARCHAR(255) NOT NULL,
    tipo	VARCHAR(255) NOT NULL
);

#DDL
INSERT INTO tb_usuario(nome, usuario, senha)
VALUES ('administrador', 'admin', 'admin'),
	   ('Vinicius Takedi', 'takedi97', '123');

INSERT INTO tb_curso(nome, tipo)
VALUES ('Desenvolvimento de sistemas', 'Tecnólogo'),
	   ('Ciência da computação', 'Bacharelado');

#DQL
SELECT * FROM tb_usuario;
SELECT * FROM tb_curso;

#Sincronizar hora do sql
SET GLOBAL TIME_ZONE = '-3:00';

