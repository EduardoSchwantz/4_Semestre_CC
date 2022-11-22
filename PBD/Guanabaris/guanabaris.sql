create database guanabaris;
use guanabaris;

create table tbusuarios(
iduser int primary key not null auto_increment,
usuario varchar(50) not null,
login varchar(15) not null unique,
senha varchar(15) not null
); 
desc tbusuarios;
insert into tbusuarios(iduser, usuario, login, senha)
values
(default, 'Administrador', 'admin', 'admin'),
(default, 'Eduardo Schwantz', 'eduardoschwantz', '1234'),
(default, 'Cecilia Botelho', 'ceciliabotelho', '1234');
select * from tbusuarios;

alter table tbusuarios
add column perfil varchar(20) not null;
update tbusuarios set perfil = 'admin' where iduser = 1;
update tbusuarios set perfil = 'user' where iduser = 2;
update tbusuarios set perfil = 'user' where iduser = 3;

create table tbclientes(
idcli int primary key auto_increment,
nomecli varchar(50) not null,
cpfcli varchar(12) unique not null,
endcli varchar(100),
fonecli varchar(50)
);
desc tbclientes;
insert into tbclientes(nomecli, cpfcli, endcli, fonecli)
values
('Eduardo Schwantz', '04476649050', 'Rua almirante tamandaré, 498', '9999-9999');
select * from tbclientes;
select idcli as id, nomecli as nome, endcli as endereço, fonecli as fone, cpfcli as cpf from tbclientes;

create table tbprodutos(
idProd int not null auto_increment primary key,
codbarra int not null unique,
nomeprod varchar(50) not null unique,
precoprod decimal(10,2) not null,
quantprod int not null
);
insert into tbprodutos(codbarra, nomeprod, precoprod, quantprod)
values
(100, 'Lava louça limpol neutro', 3.49, 40),
(200, 'Salgadinho', 5.49, 30);
insert into tbprodutos(codbarra, nomeprod, precoprod, quantprod)
values
(300, 'BolacidProdha', 9.99, 24);
desc tbprodutos;
select * from tbprodutos;
select idProd as codProduto, codbarra as codBarras, nomeprod as nomeProduto, precoprod as preco, quantprod as estoque;

