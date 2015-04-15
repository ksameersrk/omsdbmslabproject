-- I. user(phone_number(pkey),country,age,verfied,delete,status,name,last_seen,photo_url,date_creation,sex)

insert into user_ values
(
	987654, 'India', 20, TRUE, FALSE, 'Let us chat', 'Raj', '2015-04-01 10:40', 'M'
);

insert into user_ values
(
	2027145689, 'USA', 24, TRUE, FALSE, 'You only live once', 'Ron', '2015-04-12 12:45' ,'M'
);

insert into user_ values
(
	66152456, 'UAE', 28, TRUE, FALSE, 'Life is good', 'Megan', '2015-04-08 15:15', 'F'
);

insert into user_ values
(
	9921221, 'India', 25, TRUE, FALSE, 'Love life', 'Anand', '2015-03-10 16:25','M'
);

insert into user_ values
(
	2027856879, 'USA', 23, TRUE, FALSE, 'It is not about how hard you hit', 'Sam', '2015-02-02 11:30' ,'M'
);

insert into user_ values
(
	971541, 'UAE', 27, TRUE, FALSE, 'Falling to pieces', 'Sarah', '2014-04-20 16:25', 'F'
);

-- -- II. individual_message(im_id(pkey),photo_url,text,video_url)

insert into individual_message values
(
    65335, 'Hey! How are you?'
);

insert into individual_message values
(
    65336, 'I am doing good'
);

insert into individual_message values
(
    65337, 'CCD at 10?'
);

insert into individual_message values
(
    66877, 'When is the ceremony?'
);

insert into individual_message values
(
    66878, 'We won!' 
);

insert into individual_message values
(
    66879, 'I will be absent tomorrow'
);

insert into individual_message values
(
    68475, 'Are you ready?' 
);

insert into individual_message values
(
    68476, 'Be there in 10 minutes'
);

insert into individual_message values
(
    68477, 'Hurry up!' 
);


-- -- III. group(g_id(pkey),phot_url,name,date_creation)

insert into group_ values
(
    84665, 'Friends Forever', '2014-11-05'
);

insert into group_ values
(
    84666, 'Party tonight', '2012-12-20'
);

insert into group_ values
(
    84667, 'Student committee', '2015-01-27'
);

-- IV. group__message(gm_id(pkey),video_url,photo_url,text)

insert into group_message values
(
    74474, 'What is the assignment?'
);

insert into group_message values
(
    74475, 'Are there classes tomorrow?'
);

insert into group_message values
(
    74476, 'Let us meet at McDonalds'
);

insert into group_message values
(
    74477, 'What time?'
);

insert into group_message values
(
    74478, 'Tomorrow at noon.'
);

insert into group_message values
(
    74479, 'See you there.'
);

insert into group_message values
(
    74567, 'I am not available.'
);

insert into group_message values
(
    74568, 'I would not be coming to the ceremony tomorrow.'
);

insert into group_message values
(
    74569, 'Could you do me a favour?'
);

-- -- V. backup(date_created(pkey),phone_number(pkey)(fkey from user),storage_url,password)

insert into backup values
(
    '2015-01-01', 987654 , 's@fety_f1rst'
);

insert into backup values
(
    '2015-04-10', 2027145689 , 'b@ck_up_d0ne'
);

insert into backup values
(
    '2015-03-18', 66152456 , 'd@ta_sav3d'
);

-- VI. user_seen_individual_message(phone_number(fkey from user),im_id(pkey)(fkey from individual_message))

insert into user_seen_individual_message values
(
    987654, 65335
);

insert into user_seen_individual_message values
(
    2027145689, 65336
);

insert into user_seen_individual_message values
(
    66152456, 65337
);

-- -- VII. user_sends_individual_message(phone_number(fkey from user),im_id(pkey)(fkey from individual_message))

insert into user_sends_individual_message values
(
    987654, 66877
);

insert into user_sends_individual_message values
(
    2027145689, 66878
);

insert into user_sends_individual_message values
(
    66152456, 66879
);

-- VIII. user_receives_individual_message(phone_number(fkey from user),im_id(pkey)(fkey from individual_message))

insert into user_receives_individual_message values
(
    987654, 65335
);

insert into user_receives_individual_message values
(
    2027145689, 65336
);

insert into user_receives_individual_message values
(
    66152456, 65337
);

-- IX. user_deletes_individual_message(phone_number(pkey)(fkey from user),im_id(pkey)(fkey from individual_message))

insert into user_deletes_individual_message values
(
    987654, 68475
);

insert into user_deletes_individual_message values
(
    2027145689, 68476
);

insert into user_deletes_individual_message values
(
    66152456, 68477
);

-- -- X. user_is_admin_group(g_id(pkey)(fkey from group),phone_number(fkey from user))

insert into user_is_admin_group values
(
    84665, 987654
);

insert into user_is_admin_group values
(
    84666, 2027145689
);

insert into user_is_admin_group values
(
    84667, 66152456
);

-- XI. user_is_group_member(g_id(pkey)(fkey from group),phone_number(pkey)(fkey from user))

insert into user_is_group_member values
(
    84665, 9921221
);

insert into user_is_group_member values
(
    84666, 987654
);

insert into user_is_group_member values
(
    84667, 9921221
);

-- XII. user_is_created_group(g_id(pkey)(fkey from group),phone_number(fkey from user))

insert into user_is_created_group values
(
    84665, 987654
);

insert into user_is_created_group values
(
    84666, 2027145689
);

insert into user_is_created_group values
(
    84667, 66152456
);

-- -- XIII. user_seen_group_message(phone_number(pkey)(fkey from user),gm_id(pkey)(fkey from group_message),g_id(fkey from group))

insert into user_seen_group_message values
(
    9921221, 74474, 84665
);

insert into user_seen_group_message values
(
   987654, 74475, 84666
);

insert into user_seen_group_message values
(
   9921221, 74476, 84667
);

-- XIV. user_send_group_message(phone_number(pkey)(fkey from user),gm_id(pkey)(fkey from group_message),g_id(fkey from group))

insert into user_send_group_message values
(
    987654, 74477, 84665
);

insert into user_send_group_message values
(
    2027145689, 74478, 84666
);

insert into user_send_group_message values
(
    66152456, 74479, 84667
);

-- XV. user_receives_group_message(phone_number(pkey)(fkey from user),gm_id(pkey)(fkey from group_message),g_id(fkey from group))

insert into user_receives_group_message values
(
    9921221, 74474, 84665
);

insert into user_receives_group_message values
(
    9921221, 74475, 84666
);

insert into user_receives_group_message values
(
    9921221, 74476, 84667
);

-- -- XVI. user_delete_group_message(phone_number(pkey)(fkey from user),gm_id(pkey)(fkey from group_message),g_id(fkey from group))

insert into user_delete_group_message values
(
    9921221, 74567, 84665
);

insert into user_delete_group_message values
(
   987654, 74568, 84665
);

insert into user_delete_group_message values
(
    66152456, 74569, 84665
);

-- XVII. user_has_contact_user(phone_number_pno1(pkey)(fkey references from user),phone_number_pno2(pkey)(fkey from user))

insert into user_has_contact_user values
(
    987654, 9921221
);

insert into user_has_contact_user values
(
    9921221, 987654
);


-- VIII. user_has_blocked_user(phone_number_pno1(pkey)(fkey references from user),phone_number_pno2(pkey)(fkey from user))

insert into user_has_blocked_user values
(
    987654, 9921221
);

insert into user_has_blocked_user values
(
    2027145689, 9921221
);

insert into user_has_blocked_user values
(
    66152456, 9921221
);

-- XIX. user_creates_backup(date_creation(pkey)(fkey from backup),phone_number(pkey)(fkey from user))

insert into user_creates_backup values
(
    '2015-01-01', 987654
);

insert into user_creates_backup values
(
    '2015-04-10', 2027145689
);

insert into user_creates_backup values
(
    '2015-03-18', 66152456
);

