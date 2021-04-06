USE pay;

CREATE table `t_pay`(
`id` bigint(20) NOT null AUTO_INCREMENT Comment 'id',
`serial` varchar (200) default '',
PRIMARY KEY (`id`)

) ENGINE=InnoDB default charset=utf8;