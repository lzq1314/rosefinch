--创建数据库
create database rosefinch default character set utf8 collate utf8_bin;
--创建用户
create user 'rosefinch'@'localhost' identified by 'rosefinch';
--查询用户
select user,host from mysql.user;
--给数据库授权
grant all privileges on rosefinch.* to rosefinch@localhost identified by 'rosefinch';
--刷新系统权限表
flush privileges; 

--创建用户表
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` varchar(42) NOT NULL AUTO_INCREMENT COMMENT 'hrID',
  `name` varchar(100) DEFAULT NULL COMMENT '姓名',
  `phone` char(11) DEFAULT NULL COMMENT '手机号码',
  `telephone` varchar(16) DEFAULT NULL COMMENT '住宅电话',
  `address` varchar(64) DEFAULT NULL COMMENT '联系地址',
  `enabled` tinyint(1) DEFAULT '1',
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `userface` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;