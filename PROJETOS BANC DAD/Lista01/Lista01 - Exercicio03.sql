CREATE TABLE Projeto(
id_projeto INT PRIMARY KEY NOT NULL UNIQUE,
nome_projeto TEXT NOT NULL,
descrição TEXT NOT NULL);

INSERT INTO Projeto(id_projeto, nome_projeto, descrição) VALUES
(1, 'Desenvolvimento Sustentável', 'Visa integrar soluções ambientais sustentáveis no planejamento urbano.'),
(2, 'Tech Edu', 'Um projeto que busca incorporar tecnologias avançadas no ensino fundamental e médio.'),
(3, 'Saúde Digital', 'Focado em desenvolver aplicativos móveis para melhorar o acesso à informação de saúde.'),
(4, 'Renovação Urbana', 'Destinado à revitalização de áreas urbanas deterioradas, promovendo a inclusão social.'),
(5, 'Agricultura Inteligente', 'Utiliza IoT e inteligência artificial para aumentar a eficiência na agricultura.'),
(6, 'Segurança Online', 'Projeto que desenvolve novas ferramentas e protocolos para aumentar a segurança na internet.'),
(7, 'Energia Limpa', 'Pesquisa e desenvolvimento de fontes de energia renováveis, como solar e eólica.'),
(8, 'Reciclagem Avançada', 'Inovações em processos de reciclagem para reduzir o desperdício de materiais.'),
(9, 'Arte e Cultura Digital', 'Promove a criação e distribuição de arte e cultura através de meios digitais.'),
(10, 'Mobilidade Urbana', 'Desenvolve soluções para melhorar o transporte público e reduzir o tráfego nas cidades.');


CREATE TABLE Funcionario(
id_funcionario INT PRIMARY KEY NOT NULL UNIQUE,
nome_funcionario TEXT NOT NULL,
data_admissão VARCHAR (10) NOT NULL);

INSERT INTO Funcionario(id_funcionario, nome_funcionario, data_admissão) VALUES
(1, 'Ana Beatriz', '2023-01-15'),
(2, 'Carlos de Souza', '2023-02-20'),
(3, 'Eliane Costa', '2023-03-10'),
(4, 'Fernando Martins', '2023-04-01'),
(5, 'Giovanna Rocha', '2023-05-21'),
(6, 'Hector Silva', '2023-06-30'),
(7, 'Íris Lopes', '2023-07-15'),
(8, 'João Pedro', '2023-08-05'),
(9, 'Lucas Mendes', '2023-09-20'),
(10, 'Mariana Ferreira', '2023-10-10');


CREATE TABLE Reuniao(
id_reunião SERIAL PRIMARY KEY NOT NULL UNIQUE,
id_projeto INT NOT NULL,
id_funcionario INT NOT NULL,
pauta_reuniao TEXT NOT NULL,
horario_reuniao DATE NOT NULL);

INSERT INTO Reuniao(id_projeto, id_funcionario, pauta_reuniao, horario_reuniao) VALUES
(1, 1, 'Kick-off do projeto', '2024-03-30 09:00:00'),
(2, 2, 'Revisão de milestones', '2024-03-31 10:00:00'),
(3, 3, 'Brainstorm de inovações', '2024-04-01 11:00:00'),
(4, 4, 'Planejamento financeiro', '2024-04-02 14:00:00'),
(5, 5, 'Estratégias de engajamento', '2024-04-03 15:00:00'),
(6, 6, 'Análise de risco', '2024-04-04 16:00:00'),
(7, 7, 'Desenvolvimento de talentos', '2024-04-05 09:30:00'),
(8, 8, 'Atualizações tecnológicas', '2024-04-06 10:30:00'),
(9, 9, 'Feedback de equipe', '2024-04-07 11:30:00'),
(10, 10, 'Encerramento de fase', '2024-04-08 14:30:00');

