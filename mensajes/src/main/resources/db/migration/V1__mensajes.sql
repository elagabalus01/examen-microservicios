CREATE TABLE public.mensaje (
	id int4 NOT NULL GENERATED BY DEFAULT AS IDENTITY,
	contenido varchar(255) NULL,
	id_user_reciver int4 NULL,
	id_user_sender int4 NULL,
	"timestamp" varchar(255) NULL,
	CONSTRAINT mensaje_pkey PRIMARY KEY (id)
);