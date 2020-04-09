/*
Navicat MySQL Data Transfer

Source Server         : 我的MySQL
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-07-10 15:44:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(50) NOT NULL COMMENT '用户名',
  `age` int(11) NOT NULL COMMENT '年龄',
  `ctm` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '大王', '18', '2018-07-06 17:46:51');
INSERT INTO `user` VALUES ('2', '二狗', '19', '2018-07-06 17:46:57');
INSERT INTO `user` VALUES ('3', '张三', '20', '2018-07-06 17:46:59');
INSERT INTO `user` VALUES ('4', '李四', '21', '2018-07-06 17:47:04');
INSERT INTO `user` VALUES ('5', '王五', '22', '2018-07-06 17:47:06');
INSERT INTO `user` VALUES ('6', '陆六', '23', '2018-07-06 17:47:08');
