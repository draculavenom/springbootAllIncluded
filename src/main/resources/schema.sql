create table users(
	id int not null AUTO_INCREMENT primary key,
    username varchar_ignorecase(50) not null,
    password varchar_ignorecase(50) not null,
    enabled boolean not null);

create table authorities (
	id int not null AUTO_INCREMENT primary key,
	user_id int not null, 
    username varchar_ignorecase(50) not null,
    authority varchar_ignorecase(50) not null,
    constraint fk_authorities_users foreign key(user_id) references users(id));

create unique index ix_auth_username on authorities (username,authority);