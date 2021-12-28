INSERT INTO genre (genre) VALUES ('Detective');
INSERT INTO genre (genre) VALUES ('Magazine');
INSERT INTO genre (genre) VALUES ('Proze');
INSERT INTO genre (genre) VALUES ('fairy tale');

INSERT INTO author (author) VALUES ('Pushkin');
INSERT INTO author (author) VALUES ('Rybakov');
INSERT INTO author (author) VALUES ('Prishvin');
INSERT INTO author (author) VALUES ('Conan Doyle');

INSERT INTO book (name, author_id, genre_id) VALUES ('The Tale of Tsar Saltan', 1, 4);
INSERT INTO book (name, author_id, genre_id) VALUES ('Children of Arbat', 2, 3);
INSERT INTO book (name, author_id, genre_id) VALUES ('Stories', 3, 3);
INSERT INTO book (name, author_id, genre_id) VALUES ('Sherlock Holmes', 4, 1);

INSERT INTO comment (description, book_id) VALUES ('not interesting', 1);
INSERT INTO comment (description, book_id) VALUES ('interesting', 2);
INSERT INTO comment (description, book_id) VALUES ('super book!!!', 1);

INSERT INTO users (username, password, enabled) VALUES ('admin', '{noop}123', 1);
INSERT INTO users (username, password, enabled) VALUES ('user', '{noop}321', 1);

INSERT INTO authorities(username, authority) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO authorities(username, authority) VALUES ('user', 'ROLE_USER');

