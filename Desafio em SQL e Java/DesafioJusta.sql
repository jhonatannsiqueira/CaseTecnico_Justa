create database db_justa;

use db_justa;

create table tb_colab(
id bigint auto_increment unique,
nome varchar(50) not null,
idade int not null,
primary key(id)
);

insert into tb_colab(nome, idade) values("Matheus", 25);
insert into tb_colab(nome, idade) values("Henrique", 29);
insert into tb_colab(nome, idade) values("Glória", 21);

select * from tb_colab;

select nome from tb_colab where idade < 29;

