-- Create the DB Table
CREATE TABLE `order_detail` (
  `id` int NOT NULL AUTO_INCREMENT,
  `order_name` varchar(200) NOT NULL,
  `order_type` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--Insert Few DATABASE
INSERT INTO `` (`id`,`order_name`,`order_type`) VALUES (1,'Test','Test 1');
INSERT INTO `` (`id`,`order_name`,`order_type`) VALUES (2,'Test 2','Test 2');
INSERT INTO `` (`id`,`order_name`,`order_type`) VALUES (3,'Test 3','Test 3');

