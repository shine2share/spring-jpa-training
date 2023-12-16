create table post(
    id int8 not null,
    title varchar(500) not null,
    created_date timestamp null,
    created_by varchar(255) null,
    last_modified_date timestamp null,
    last_modified_by varchar(255) null,
    constraint post_pk primary key (id)
);