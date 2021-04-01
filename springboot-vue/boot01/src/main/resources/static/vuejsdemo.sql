
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

INSERT INTO `user` VALUES ('1', '33', '张三', '123', 'zzz@163.cn', '男 ');
INSERT INTO `user` VALUES ('2', '31', '王五', '123', 'www@163.cn', '女');
INSERT INTO `user` VALUES ('3', '17', '赵六', '213', 'zliu@163.cn', '女');
INSERT INTO `user` VALUES ('4', '40', '李四', '213', 'lisi@163.cn', '男');
