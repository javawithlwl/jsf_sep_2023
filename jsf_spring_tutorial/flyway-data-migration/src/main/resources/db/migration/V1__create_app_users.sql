create table app_users (
    id bigserial,
    email varchar(255) unique,
    username varchar(255) not null,
    password varchar(255) not null,
    primary key (id)
);
