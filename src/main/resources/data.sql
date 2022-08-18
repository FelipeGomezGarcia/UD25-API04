Drop table if exists Salas;
Drop table if exists Peliculas;

Create table Peliculas(
codigo int auto_increment not null,
nombre varchar(100),
calificacionEdad int,
PRIMARY KEY (codigo)
);

create table Salas (
codigo int auto_increment not null,
nombre varchar(100),
pelicula int,
primary key (codigo),
constraint fk_codigoPeliculas FOREIGN KEY (pelicula ) 
REFERENCES Peliculas (codigo)
ON DELETE CASCADE ON UPDATE CASCADE
);

insert into peliculas (nombre,calificacionEdad) values
('Avatar',16),
('American Pie',18),
('Peppa Pig',3);

insert into salas (nombre, pelicula) values
('Sala 1',1),
('Sala 2',2),
('Sala 3',1),
('Sala 4',3);
