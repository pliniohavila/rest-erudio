CREATE TABLE IF NOT EXISTS `person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(80) COLLATE utf8mb4_general_ci NOT NULL,
  `last_name` varchar(80) COLLATE utf8mb4_general_ci NOT NULL,
  `address` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `gender` varchar(6) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`)
);
