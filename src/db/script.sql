CREATE SCHEMA public AUTHORIZATION postgres;

-- public.tb_post definition

CREATE TABLE public.tb_post (
	id int8 NOT NULL,
	autor varchar(255) NULL,
	"data" date NULL,
	texto text NULL,
	titulo varchar(255) NULL,
	CONSTRAINT tb_post_pkey PRIMARY KEY (id)
);