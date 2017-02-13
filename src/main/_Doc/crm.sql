# 菜单表
CREATE TABLE `menu` (
  `menuId` int(11) NOT NULL AUTO_INCREMENT,
  `menuName` varchar(50) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `operate` varchar(50) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`menuId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# 权限表
CREATE TABLE `user_limit` (
  `limitId` int(11) NOT NULL AUTO_INCREMENT,
  `menuList` varchar(500) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`limitId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# 角色表
CREATE TABLE `user_role` (
  `roleId` int(11) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(50) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `limitId` int(11) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`roleId`),
  CONSTRAINT user_role FOREIGN KEY ('limitId') REFERENCES user_limit ('limitId')
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# 用户组表
CREATE TABLE `user_group` (
  `groupId` int(11) NOT NULL AUTO_INCREMENT,
  `groupName` varchar(50) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`groupId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# 用户表
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT 'milu123456',
  `phoneNumber` varchar(12) NOT NULL,
  `pinyin` varchar(50) DEFAULT NULL,
  `status` int(11) NOT NULL,
  `roleId` int(11) DEFAULT NULL,
  `groupId` int(11) DEFAULT NULL,
  `isLogin` tinyint(4) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
