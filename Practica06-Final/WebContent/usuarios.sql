create table usuarios(
	id int(11) AUTO_INCREMENT NOT NULL AUTO_INCREMENT  PRIMARY KEY, 
	primer_nombre varchar(64) not null,
	email varchar(64) not null,
	telefono varchar(10) not null,
	sexo varchar(1) not null,
	serie varchar(64) not null, 
	musica varchar(64) not null
	


);