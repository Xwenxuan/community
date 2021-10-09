CREATE TABLE `discuss_post` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `user_id` varchar(45) DEFAULT NULL,
    `title` varchar(100) DEFAULT NULL,
    `content` text,
    `type` int(11) DEFAULT NULL COMMENT '0-普通；1-置顶',
    `status` int(11) DEFAULT NULL COMMENT '0-正常;1-精华;2-拉黑',
    `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    `comment_count` int(11) DEFAULT NULL,
    `score` double DEFAULT NULL,
    primary key(`id`),
    key `index_user_id` (`user_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8

