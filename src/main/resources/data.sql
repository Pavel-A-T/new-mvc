INSERT INTO genre (genre) VALUES ('Detective');
INSERT INTO genre (genre) VALUES ('Magazine');
INSERT INTO genre (genre) VALUES ('Proze');
INSERT INTO genre (genre) VALUES ('fairy tale');

INSERT INTO author (author) VALUES ('Pushkin');
INSERT INTO author (author) VALUES ('Rybakov');
INSERT INTO author (author) VALUES ('Prishvin');
INSERT INTO author (author) VALUES ('Conan Doyle');

INSERT INTO comment (description) VALUES ('not interesting');
INSERT INTO comment (description) VALUES ('interesting');

INSERT INTO book (name, author_id, genre_id) VALUES ('The Tale of Tsar Saltan', 1, 4);
INSERT INTO book (name, author_id, genre_id) VALUES ('Children of Arbat', 2, 3);
INSERT INTO book (name, author_id, genre_id) VALUES ('Stories', 3, 3);
INSERT INTO book (name, author_id, genre_id) VALUES ('Sherlock Holmes', 4, 1);

INSERT INTO book_comments (comment_id, book_id) VALUES (1, 1);
INSERT INTO book_comments (comment_id, book_id) VALUES (2, 1);
INSERT INTO book_comments (comment_id, book_id) VALUES (2, 2);
INSERT INTO book_comments (comment_id, book_id) VALUES (1, 3);
INSERT INTO book_comments (comment_id, book_id) VALUES (2, 3);
