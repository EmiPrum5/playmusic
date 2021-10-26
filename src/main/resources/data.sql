INSERT INTO ARTIST (id, dateofcreation, name) VALUES  (1, '1999-05-03 23:45:02', 'acdc'),
													(2, '2929-05-03 23:45:02', 'safd');

INSERT INTO ALBUM (id, dateofcreation, duration, name, qs, id_artist) VALUES  (1, '2000-05-10 22:01:23',1000, 'ELALBUM', 10, 2),
																			(2, '2000-05-10 22:01:23',1200, 'ELSEGUNDO', 12, 1);

INSERT INTO SONG (id, dateofcreation, duration, name, id_album)  VALUES   (1, '1999-05-10 22:01:23', 120, 'Balada boa', 1),
																		(2, '1999-06-10 22:01:23', 120, 'Calaboca', 2);
