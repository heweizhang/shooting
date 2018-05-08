CREATE TABLE IF NOT EXISTS `shooting_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户自增id',
  `account` varchar(50) DEFAULT NULL COMMENT '用户账号',
  `nickname` varchar(255) DEFAULT NULL COMMENT '用户昵称',
  `pwd` varchar(255) DEFAULT NULL  COMMENT '用户密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;