use ngdb;
------
create table if not exists secrets(file_id int primary key auto_increment, filename varchar(70), filesecretkey longblob,
fileextension varchar(50), filepath varchar(300), fileencryption varchar(70));
------
create table if not exists histories(h_id int primary key auto_increment, file_id int, actiontime timestamp,
foreign key (file_id) references secrets(file_id));
------
create table if not exists params(
    paramName varchar(100) not null primary key,
    paramValue varchar(100)
);