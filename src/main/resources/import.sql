INSERT INTO person (id, first_name, last_name, gender, birthday, pesel) VALUES (1, 'Adam', 'Siemaszko', 'M', '12.05.1995',    '95051202347');
INSERT INTO person (id, first_name, last_name, gender, birthday, pesel) VALUES (2, 'Anna', 'Siemaszko', 'F', '02.08.1993',    '93080274754');
INSERT INTO person (id, first_name, last_name, gender, birthday, pesel) VALUES (3, 'Agnieszka', 'Sobko', 'F', '12.08.1983',   '83081292553');
INSERT INTO person (id, first_name, last_name, gender, birthday, pesel) VALUES (4, 'Dominik', 'Sobko', 'M', '22.10.1980',     '80102235642');
INSERT INTO person (id, first_name, last_name, gender, birthday, pesel) VALUES (5, 'Sebastian', 'Sokolov', 'M', '25.11.1989', '89112577541');

INSERT INTO phone (phone, person_id) VALUES (+48456789123, 1);
INSERT INTO phone (phone, person_id) VALUES (+48123456789, 1);
INSERT INTO phone (phone, person_id) VALUES (+48568901235, 2);
INSERT INTO phone (phone, person_id) VALUES (+48548721369, 3);
INSERT INTO phone (phone, person_id) VALUES (+48487956324, 4);
INSERT INTO phone (phone, person_id) VALUES (+48888999635, 5);

INSERT INTO email (e_mail, person_id) VALUES ('a.siemaszko@onet.pl', 1);
INSERT INTO email (e_mail, person_id) VALUES ('anna.siema@onet.pl', 2);
INSERT INTO email (e_mail, person_id) VALUES ('agnieszka.sobko@gmail.com', 3);
INSERT INTO email (e_mail, person_id) VALUES ('d.sobko@yahoo.com', 4);
INSERT INTO email (e_mail, person_id) VALUES ('sebasokol@gmail.com', 5);
INSERT INTO email (e_mail, person_id) VALUES ('asobko@onet.pl', 3);