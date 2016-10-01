--liquibase formatted sql

--changeset jayant.mukherji:1

ALTER table msg.clients
ADD bulk_count integer default 1;

ALTER table msg.clients
ADD status ENUM("ACTIVE","INACTIVE") default "ACTIVE";

ALTER table msg.clients
ADD consumer_type ENUM("SINGLE","BULK") default "SINGLE";
