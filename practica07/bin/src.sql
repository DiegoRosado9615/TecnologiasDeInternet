#DROP DATABASE base_pacientes;
#creamos la base de datos
CREATE DATABASE IF NOT EXISTS base_pacientes;

#seleccionar base de datos
USE base_pacientes;

CREATE TABLE IF NOT EXISTS alergias(
	PRIMARY KEY(id_alergia),
	id_alergia INT NOT NULL auto_increment,
    nombre VARCHAR (15) NOT NULL,
    fecha_alta DATE,
    medicamento VARCHAR (15)
)ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS usuarios(
    PRIMARY KEY(id_usuario),
	id_usuario INT NOT NULL auto_increment,
    no_expediente INT,
    fecha_ultima_consulta DATE,
    tipo_sangre VARCHAR (3)
)ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS usuarios_alergias(
    alergias_id_alergia INT NOT NULL,
	usuarios_id_usuario INT NOT NULL,
    PRIMARY KEY(alergias_id_alergia, usuarios_id_usuario),
    CONSTRAINT fkusuario_alergias_usuario
    FOREIGN KEY(usuarios_id_usuario)
    REFERENCES usuarios(id_usuario),
    CONSTRAINT fkusuario_usuario_alergias
    FOREIGN KEY(alergias_id_alergia)
    REFERENCES alergias(id_alergia)
)ENGINE=INNODB;

INSERT INTO usuarios(no_expediente, fecha_ultima_consulta, tipo_sangre)
VALUES (1234, STR_TO_DATE('2013-02-11', '%Y-%m-%d'), 'A+');

INSERT INTO usuarios(no_expediente, fecha_ultima_consulta, tipo_sangre)
VALUES (2345, STR_TO_DATE('2018-03-12', '%Y-%m-%d'), 'AB+');

INSERT INTO usuarios(no_expediente, fecha_ultima_consulta, tipo_sangre)
VALUES (3456, STR_TO_DATE('2018-04-13', '%Y-%m-%d'), 'B-');

#SELECT * FROM usuarios;

INSERT INTO alergias(nombre,fecha_alta,medicamento)
VALUES ('Rinitis', STR_TO_DATE('2015-05-05', '%Y-%m-%d'), 'ospirin 100mg');

INSERT INTO alergias(nombre,fecha_alta,medicamento)
VALUES ('Rinitis2', STR_TO_DATE('2016-06-06', '%Y-%m-%d'), 'ospirin2 100mg');

INSERT INTO alergias(nombre,fecha_alta,medicamento)
VALUES ('Rinitis3', STR_TO_DATE('2017-08-08', '%Y-%m-%d'), 'ospirin3 100mg');

#SELECT * FROM alergias;

INSERT INTO usuarios_alergias(alergias_id_alergia, usuarios_id_usuario)
VALUES (1,2);CREATE DATABASE IF NOT EXISTS base_pacientes;
INSERT INTO usuarios_alergias(alergias_id_alergia, usuarios_id_usuario)
VALUES (3,2);
INSERT INTO usuarios_alergias(alergias_id_alergia, usuarios_id_usuario)
VALUES (3,1);
INSERT INTO usuarios_alergias(alergias_id_alergia, usuarios_id_usuario)
VALUES (2,3);

#SELECT * FROM usuarios_alergias;

#SELECT * FROM usuarios_alergias WHERE usuarios_id_usuario=2;

#SELECT * FROM
#(SELECT * FROM alergias INNER JOIN usuarios_alergias ON alergias.id_alergia = usuarios_alergias.alergias_id_alergia) AS T
#WHERE usuarios_id_usuario=2;