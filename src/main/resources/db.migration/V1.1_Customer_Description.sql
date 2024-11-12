CREATE DATABASE IF NOT EXISTS db;

CREATE TABLE customers (
    name                                VARCHAR(200)                NOT NULL    ,
    email                               VARCHAR(200)                NOT NULL    ,
    pwd                                 VARCHAR(300)                NOT NULL    ,
    role                                VARCHAR(45)                 NOT NULL    ,
    PRIMARY KEY (name)
) ENGINE = InnoDB;
