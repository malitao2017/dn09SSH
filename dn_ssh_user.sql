
--DROP TABLE IF EXISTS `dn_ssh_user`;
CREATE TABLE `dn_ssh_user` (
  `id` bigint(20) NOT NULL auto_increment,
  `email` varchar(50) default NULL,
  `password` varchar(50) default NULL,
  `details` text default NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `dn_ssh_user` VALUES (1, 'admin', 'admin', 'adminDetails');
