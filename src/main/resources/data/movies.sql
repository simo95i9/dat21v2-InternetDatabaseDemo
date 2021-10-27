drop table IF EXISTS movies;

create table movies (
    id int auto_increment primary key,
    title varchar(100) ,
    year varchar(100),
    length varchar(100) ,
    subject varchar(50),
    popularity varchar(100) ,
    awards varchar(3)
);

