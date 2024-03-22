create table doce(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    tipo varchar(100) not null,
    descricao varchar(200) not null,
    quantidade varchar(100) not null,
    fabricacao varchar(100) not null,
    validade varchar(100) not null,

    primary key (id)
);