create table userdet (id int(11) not null AUTO_INCREMENT, username VARCHAR(45) NOT NULL, password VARCHAR(45) NOT NULL, active TINYINT NOT NULL DEFAULT 1,roles VARCHAR(45), PRIMARY KEY(id));
insert into userdet values(1,'sudeep','pass',1,'ROLE_ADMIN');

