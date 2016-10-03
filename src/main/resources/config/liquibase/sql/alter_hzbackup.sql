--liquibase formatted sql

--changeset jayant.mukherji:3

alter table hzbackup
add client_name varchar(200);
