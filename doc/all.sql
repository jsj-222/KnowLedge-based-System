-- auto-generated definition
drop table if exists test;
create table test
(
    id   bigint      not null
        primary key,
    name varchar(50) null,
    password varchar(50)
)comment '测试';