\c saimadhav
drop database oms;
create database oms;
\c oms
-- user(phone_number(pkey),country,age,verfied,delete,status,name,last_seen,photo_url,date_creation,sex)

create table user_
(
    phone_number int primary key,
    country varchar(20),
    age int,
    verified boolean,
    delete_ boolean,
    status varchar(50),
    name varchar(20),
    last_seen timestamp,
    photo_url varchar(50),
    date_creation date,
    sex char(1)
);

-- -- individual_message(im_id(pkey),photo_url,text,video_url)

create table individual_message
(
    im_id int primary key,
    photo_url varchar(50),
    text varchar(200),
    video_url varchar(50)
);

-- group(g_id(pkey),phot_url,name,date_creation)

create table group_
(
    g_id int primary key,
    photo_url varchar(50),
    name varchar(50),
    date_creation date
);

-- group_message(gm_id(pkey),video_url,photo_url,text)

create table group_message
(
    gm_id int primary key,
    video_url varchar(50),
    photo_url varchar(50),
    text varchar(50)
);

-- backup(date_created(pkey),phone_number(pkey)(fkey from user),storage_url,password)

create table backup
(
    date_created date,
    phone_number int,
    storage_url varchar(50),
    password_backup varchar(20),
    primary key(date_created,phone_number),
    foreign key(phone_number) references user_(phone_number) 
);

-- user_seen_individual_message(phone_number(fkey from user),im_id(pkey)(fkey from individual_message))

create table user_seen_individual_message
(
    phone_number int,
    im_id int primary key,
    foreign key(phone_number) references user_(phone_number),
    foreign key(im_id) references individual_message(im_id)
);

-- user_sends_individual_message(phone_number(fkey from user),im_id(pkey)(fkey from individual_message))

create table user_sends_individual_message
(
    phone_number int,
    im_id int primary key,
    foreign key(phone_number) references user_(phone_number),
    foreign key(im_id) references individual_message(im_id)
);

-- user_receives_individual_message(phone_number(fkey from user),im_id(pkey)(fkey from individual_message))

create table user_receives_individual_message
(
    phone_number int,
    im_id int primary key,
    foreign key(phone_number) references user_(phone_number),
    foreign key(im_id) references individual_message(im_id)
);

-- user_deletes_individual_message(phone_number(pkey)(fkey from user),im_id(pkey)(fkey from individual_message))

create table user_deletes_individual_message
(
    phone_number int,
    im_id int primary key,
    foreign key(phone_number) references user_(phone_number),
    foreign key(im_id) references individual_message(im_id)
);

-- user_is_admin_group(g_id(pkey)(fkey from group),phone_number(fkey from user))

create table user_is_admin_group
(
    g_id int primary key,
    phone_number int,
    foreign key(g_id) references group_(g_id),
    foreign key(phone_number) references user_(phone_number)
);

-- user_is_group_member(g_id(pkey)(fkey from group),phone_number(pkey)(fkey from user))

create table user_is_group_member
(
    g_id int primary key,
    phone_number int,
    foreign key(g_id) references group_(g_id),
    foreign key(phone_number) references user_(phone_number)
);

-- user_is_created_group(g_id(pkey)(fkey from group),phone_number(fkey from user))

create table user_is_created_group
(
    g_id int primary key,
    phone_number int,
    foreign key(g_id) references group_(g_id),
    foreign key(phone_number) references user_(phone_number)
);

-- user_seen_group_message(phone_number(pkey)(fkey from user),gm_id(pkey)(fkey from group_message),g_id(fkey from group))

create table user_seen_group_message
(
    phone_number int,
    gm_id int,
    g_id int,
    primary key(phone_number,gm_id),
    foreign key(phone_number) references user_(phone_number),
    foreign key(gm_id) references group_message(gm_id),
    foreign key(g_id) references group_(g_id)
);

-- user_send_group_message(phone_number(pkey)(fkey from user),gm_id(pkey)(fkey from group_message),g_id(fkey from group))

create table user_send_group_message
(
    phone_number int,
    gm_id int,
    g_id int,
    primary key(phone_number,gm_id),
    foreign key(phone_number) references user_(phone_number),
    foreign key(gm_id) references group_message(gm_id),
    foreign key(g_id) references group_(g_id)
);

-- user_receives_group_message(phone_number(pkey)(fkey from user),gm_id(pkey)(fkey from group_message),g_id(fkey from group))

create table user_receives_group_message
(
    phone_number int,
    gm_id int,
    g_id int,
    primary key(phone_number,gm_id),
    foreign key(phone_number) references user_(phone_number),
    foreign key(gm_id) references group_message(gm_id),
    foreign key(g_id) references group_(g_id)
);

-- user_delete_group_message(phone_number(pkey)(fkey from user),gm_id(pkey)(fkey from group_message),g_id(fkey from group))

create table user_delete_group_message
(
    phone_number int,
    gm_id int,
    g_id int,
    primary key(phone_number,gm_id),
    foreign key(phone_number) references user_(phone_number),
    foreign key(gm_id) references group_message(gm_id),
    foreign key(g_id) references group_(g_id)
);

-- user_has_contact_user(phone_number_pno1(pkey)(fkey references from user),phone_number_pno2(pkey)(fkey from user))

create table user_has_contact_user
(
    phone_number_pno1 int,
    phone_number_pno2 int,
    primary key(phone_number_pno1, phone_number_pno2),
    foreign key(phone_number_pno1) references user_(phone_number),
    foreign key(phone_number_pno2) references user_(phone_number)
);

-- user_has_blocked_user(phone_number_pno1(pkey)(fkey references from user),phone_number_pno2(pkey)(fkey from user))

create table user_has_blocked_user
(
    phone_number_pno1 int,
    phone_number_pno2 int,
    primary key(phone_number_pno1, phone_number_pno2),
    foreign key(phone_number_pno1) references user_(phone_number),
    foreign key(phone_number_pno2) references user_(phone_number)
);

-- user_creates_backup(date_creation(pkey)(fkey from backup),phone_number(pkey)(fkey from user))

create table user_creates_backup
(
    date_created date,
    phone_number int,
    primary key(date_created,phone_number),
    foreign key(date_created, phone_number) references backup(date_created, phone_number),
    foreign key(phone_number) references user_(phone_number)
);

-- user_retrives_backup(date_creation(pkey)(fkey from backup),phone_number(pkey)(fkey from user),date_retrived(pkey))

create table user_retrives_backup
(
    date_created date,
    phone_number int,
    date_retrieved date,
    primary key(date_created,phone_number,date_retrieved),
    foreign key(date_created, phone_number) references backup(date_created, phone_number),
    foreign key(phone_number) references user_(phone_number)
);
