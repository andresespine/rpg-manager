-- Crea base de datos
CREATE DATABASE IF NOT EXISTS rpg_manager
CHARACTER SET utf8mb4;
USE rpg_manager;
-- Crea la tabla clase 
CREATE TABLE clase (
    id_clase INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL UNIQUE,
    descripcion VARCHAR(255)
);
--  Crea después la tabla perso
CREATE TABLE personaje (
    id_personaje INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL UNIQUE,
    id_clase INT NOT NULL,
    nivel INT CHECK (nivel BETWEEN 1 AND 100),
    ataque INT,
    oro DECIMAL(10,2) DEFAULT 0.00,
    FOREIGN KEY (id_clase) REFERENCES clase(id_clase)
);
--  Insertaclases
INSERT INTO clase (nombre, descripcion)
VALUES
('Guerrero', 'Especialista en combate cuerpo a cuerpo'),
('Mago', 'Especialista en magia');
--  Insertapersonajes
INSERT INTO personaje (nombre, id_clase, nivel, ataque, oro)
VALUES
('Aragorn', 1, 50, 25, 100.00),
('Mago', 2, 50, 25, 100.00);
SHOW TABLES;
SELECT * FROM clase;
SELECT * FROM personaje;
