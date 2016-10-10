--liquibase formatted sql

--changeset jayant.mukherji:4
alter  table inbound_messages
add created_at datetime default NOW();

rename table inbound_messages TO outbound_messages;
