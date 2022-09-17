CREATE TABLE cliente(codigo serial PRIMARY KEY, nome varchar(50), 
telefone varchar(11), email varch(40) unique);

INSERT INTO cliente (nome, telefone, email) 
			VALUES 	('André', '2365987', 'a@gmail.com')
					('Willian', '5698745', 'w@gmail.com')
					('Alice', '98745687', 'al@gmail.com')
					('Milena', '26548932', 'm@gmail.com')