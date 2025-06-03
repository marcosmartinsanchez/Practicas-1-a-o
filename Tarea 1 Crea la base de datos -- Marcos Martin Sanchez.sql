DROP DATABASE akihabara_db;
CREATE DATABASE akihabara_db;
USE akihabara_db;

CREATE USER userAkihabara IDENTIFIED BY '1234';

GRANT ALL PRIVILEGES ON akihabara_db.producto TO userAkihabara;

	##En categoria es("figura" , "Manga", "póster", "Llavero", "Ropa")
CREATE TABLE producto(
id INT PRIMARY KEY auto_increment,
nombre VARCHAR(255) NOT NULL,
categoria VARCHAR(100),
precio DECIMAL(10,2),
stock int
);


USE akihabara_db;
INSERT INTO producto (nombre, categoria, precio, stock) VALUES
('Figura de Goku', 'Figura', 25.99, 10),
('Manga de One Piece Vol. 1', 'Manga', 7.99, 15),
('Póster de Attack on Titan', 'Póster', 12.50, 5),
('Llavero de Naruto', 'Llavero', 3.99, 20),
('Camiseta de My Hero Academia', 'Ropa', 19.99, 8),
('Figura de Sailor Moon', 'Figura', 30.00, 12),
('Manga de Demon Slayer Vol. 1', 'Manga', 8.99, 10),
('Póster de Fullmetal Alchemist', 'Póster', 10.00, 7),
('Llavero de Dragon Ball', 'Llavero', 4.50, 25),
('Sudadera de Tokyo Ghoul', 'Ropa', 29.99, 6);
