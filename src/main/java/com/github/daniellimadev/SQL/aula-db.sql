create table time
(
    id       integer primary key auto_increment,
    nome     varchar(50) unique not null,
    uf       varchar(2)         not null,
    vitorias integer            not null default 0,
    empates  integer            not null default 0,
    derrotas integer            not null default 0
);

create table jogador
(
    id         integer primary key auto_increment,
    nome       varchar(50) not null,
    id_time    integer     not null,
    nascimento datetime default null,
    foreign key (id_time) references time (id)
);

insert into time (nome, uf)
values ('Sao Paulo', 'SP');

insert into time (nome, uf)
values ('Corinthians', 'SP');

insert into time (nome, uf)
values ('Palmeiras', 'SP');

insert into time (nome, uf)
values ('Flamengo', 'RJ');

insert into time (nome, uf)
values ('Vasco', 'RJ');

insert into time (nome, uf)
values ('Fluminense', 'RJ');

insert into jogador (nome, id_time, nascimento)
values ('Mateus', 1, default),
       ('Marcos', 1, default),
       ('Lucas', 1, default),
       ('João', 1, default),
       ('José', 2, '2000-01-01'),
       ('Carlos', 2, '2002-01-01'),
       ('André', 4, '2005-01-01'),
       ('Pedro', 5, '2005-01-01');

select t.nome, j.nome
from time t
join jogador j on t.id = j.id_time;

select t.nome, count(j.id) as jogadores
from time t
left join jogador j on j.id_time = t.id
group by t.nome
order by jogadores desc, t.nome;

select t.uf, sum(t.vitorias * 3 + t.empates) as pontos
from time t
group by uf
order by pontos desc

