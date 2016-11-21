--liquibase formatted sql

--changeset msg:1

CREATE TABLE `outbound_messages` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `message_id` varchar(255) DEFAULT NULL,
  `group_id` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `payload` text,
  `event_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;
