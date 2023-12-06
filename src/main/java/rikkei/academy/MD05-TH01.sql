drop database if exists md05_db;
create database md05_db;
use md05_db;
create table customers
(
    id   bit(64) primary key,
    name varchar(255),
    email varchar(255),
    address varchar(255)
);
