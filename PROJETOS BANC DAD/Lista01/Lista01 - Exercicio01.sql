CREATE TABLE Livro(
isbn INT PRIMARY KEY NOT NULL UNIQUE,
editora TEXT NOT NULL,
ano_pub VARCHAR (10) NOT NULL);

INSERT INTO Livro (isbn, editora, ano_pub) 
VALUES ('3', 'editora_3', '03/01/2001');

CREATE TABLE Autor(
id_autor INT PRIMARY KEY NOT NULL UNIQUE,
nome_autor TEXT NOT NULL,
cpf_autor VARCHAR (14) NOT NULL);

INSERT INTO Autor (id_autor, nome_autor, cpf_autor) VALUES 
(1, 'Aline', '111.111.111-11'),
(2, 'Beatriz', '222.222.222-22'),
(3, 'Carol', '333.333.333-33');

CREATE TABLE Registro_de_Publicação(
id_registro INT PRIMARY KEY NOT NULL UNIQUE,
isbn INT NOT NULL UNIQUE,
id_autor INT NOT NULL UNIQUE,
data_publicação VARCHAR (10) NOT NULL);

INSERT INTO Registro_de_Publicação (id_registro, isbn, id_autor, data_publicação) VALUES 
(1, 1, 1, '01/01/2001'),
(2, 2, 2, '02/01/2001'),
(3, 3, 3, '03/01/2001');

SELECT * FROM Autor