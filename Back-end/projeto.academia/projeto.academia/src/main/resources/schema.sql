CREATE TABLE alunos (
id   INT  AUTO_INCREMENT PRIMARY KEY,
nome    VARCHAR(150)    NOT NULL,
email   VARCHAR(150)    NOT NULL,
telefone   VARCHAR(20)     NOT NULL,
plano_escolhido  VARCHAR(50)     NOT NULL,
peso    DOUBLE NOT NULL,
altura  DECIMAL(5,2) NOT NULL
);

