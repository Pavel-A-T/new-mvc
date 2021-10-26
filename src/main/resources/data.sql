INSERT INTO genre (id, genre) VALUES (1, 'Detective');
INSERT INTO genre (id, genre) VALUES (2, 'Magazine');
INSERT INTO genre (id, genre) VALUES (3, 'Proze');
INSERT INTO genre (id, genre) VALUES (4, 'fairy tale');

INSERT INTO author (id, author) VALUES (1, 'Pushkin');
INSERT INTO author (id, author) VALUES (2, 'Rybakov');
INSERT INTO author (id, author) VALUES (3, 'Prishvin');
INSERT INTO author (id, author) VALUES (4, 'Conan Doyle');

INSERT INTO comment (id, description) VALUES (1, 'not interesting');
INSERT INTO comment (id, description) VALUES (2, 'interesting');

INSERT INTO book (id, name, author, genre, comment) VALUES (1, 'The Tale of Tsar Saltan', 1, 4, 2);
INSERT INTO book (id, name, author, genre, comment) VALUES (2, 'Children of Arbat', 2, 3, 2);
INSERT INTO book (id, name, author, genre, comment) VALUES (3, 'Stories', 3, 3, 1);
INSERT INTO book (id, name, author, genre, comment) VALUES (4, 'Sherlock Holmes', 4, 1, 2);
