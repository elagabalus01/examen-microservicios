CREATE TABLE public.publicacion (
	id int4 NOT NULL GENERATED BY DEFAULT AS IDENTITY,
	contenido varchar(255) NULL,
	"timestamp" varchar(255) NULL,
	user_id int4 NULL,
	CONSTRAINT publicacion_pkey PRIMARY KEY (id)
);

insert into publicacion(contenido, "timestamp", user_id)
VALUES('Gracias a dios es virnes',now(), 1),
('Trabajando duro o durando en el trabajo',now(),2),
('Doy clases los jueves',now(),2),
('Hola mundo',now(),1);