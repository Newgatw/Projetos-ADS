CREATE TABLE Curso(
id_curso INT PRIMARY KEY NOT NULL UNIQUE,
nome_curso TEXT NOT NULL);

INSERT INTO Curso (id_curso, nome_curso) VALUES 
(1, 'Aviador'),
(2, 'Barman'),
(3, 'Confeiteiro');

SELECT * FROM Aluno

CREATE TABLE Aluno(
id_aluno INT PRIMARY KEY NOT NULL UNIQUE,
nome_aluno TEXT NOT NULL,
data_nascimento VARCHAR (10) NOT NULL);

INSERT INTO Aluno(id_aluno, nome_aluno, data_nascimento) VALUES 
(1, 'Armando', '25/06/2006'),
(2, 'Bianca', '26/06/2006'),
(3, 'Camila', '27/06/2006');

CREATE TABLE Turma(
id_turma INT PRIMARY KEY NOT NULL UNIQUE,
id_curso INT NOT NULL UNIQUE,
professor_responsavel TEXT NOT NULL);

INSERT INTO Turma(id_turma, id_curso, professor_responsavel) VALUES 
(01, 1, 'Armelindo'),
(02, 2, 'Bernardo'),
(03, 3, 'Carlos');

CREATE TABLE Alunos_Turmas(
id_aluno INT NOT NULL,
id_turma INT NOT NULL);

INSERT INTO Alunos_Turmas(id_aluno, id_turma) VALUES 
(1, 01),
(2, 02),
(3, 03);