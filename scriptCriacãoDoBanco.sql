create database plataforma_educacao_financeira;

use plataforma_educacao_financeira;

create table usuario(
    email varchar(80) primary key,
    senha varchar(50) not null,
    nome varchar(50) not null,
    nivel_investimento varchar(10) not null
);

create table carteira(
    id_carteira int auto_increment primary key,
    email varchar(80),
    foreign key (email) references usuario(email) on delete cascade,
    saldo float
);

DELIMITER $$
CREATE PROCEDURE cadastrarUsuario(
	email VARCHAR(80),
    senha VARCHAR(50),
    nome VARCHAR(50),
    nivel_investimento VARCHAR(10)
)
BEGIN
    INSERT INTO usuario (email, senha, nome, nivel_investimento)
    VALUES (email, senha, nome, nivel_investimento);
    
    INSERT INTO carteira (email, saldo)
    VALUES (email, 0);
END$$
DELIMITER ; 

CALL cadastrarUsuario("adm@gmail.com", "123", "Administrador", "Alto")