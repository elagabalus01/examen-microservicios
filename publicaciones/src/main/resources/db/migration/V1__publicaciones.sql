CREATE TABLE public.publicacion (
	id int4 NOT NULL GENERATED BY DEFAULT AS IDENTITY,
	contenido varchar(255) NULL,
	"timestamp" varchar(255) NULL,
	user_id int4 NULL,
	CONSTRAINT publicacion_pkey PRIMARY KEY (id)
);

insert into publicacion(contenido, "timestamp", user_id)
VALUES('Gracias a dios es viernes',to_char(now(),'yyyy-MM-dd HH:mm:ss'), 1),
('Trabajando duro o durando en el trabajo',to_char(now(),'yyyy-MM-dd HH:mm:ss'),2),
('Doy clases los jueves',to_char(now(),'yyyy-MM-dd HH:mm:ss'),2),
('Hola mundo',to_char(now(),'yyyy-MM-dd HH:mm:ss'),1);