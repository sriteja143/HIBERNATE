create table person(
 id integer not null,
 name varchar(255) not null,
 location varchar(255),
 brith_date timestamp,
 primary key(id)
);

insert into person 
        (id ,name , location ,brith_date)
values (10001,'guru','hyd',sysdate());

insert into person (id ,name , location ,brith_date)
values (10002,'teja','hyd',sysdate());