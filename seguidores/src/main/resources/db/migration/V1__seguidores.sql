create table seguidores(
	id_user_1 int,
	id_user_2 int,
	PRIMARY KEY(id_user_1,id_user_2)
);
insert into seguidores(id_user_1,id_user_2)
values(1,2),
(2,1),
(3,1),
(3,2),
(2,3);