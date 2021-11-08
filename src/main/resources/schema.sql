CREATE TABLE author
(
    id INTEGER NOT NULL AUTO_INCREMENT,
    author VARCHAR(255),
    CONSTRAINT pk_author PRIMARY KEY (id)
);
CREATE TABLE genre
(
    id INTEGER NOT NULL AUTO_INCREMENT,
    genre VARCHAR(255),
    CONSTRAINT pk_genre PRIMARY KEY (id)
);
CREATE TABLE book
(
    id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    author_id integer,
    genre_id integer,
    CONSTRAINT pk_book PRIMARY KEY (id),
    CONSTRAINT fk_author FOREIGN KEY (author_id) REFERENCES author (id),
    CONSTRAINT fk_genre FOREIGN KEY (genre_id) REFERENCES genre (id)
);
CREATE TABLE comment
(
    id INTEGER NOT NULL AUTO_INCREMENT,
    description VARCHAR(255),
    book_id INTEGER NOT NULL,
    CONSTRAINT fk_book FOREIGN KEY (book_id) REFERENCES book (id),
    CONSTRAINT pk_comment PRIMARY KEY (id)
);
CREATE TABLE usr
(
    id INTEGER NOT NULL AUTO_INCREMENT,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    CONSTRAINT pk_usr PRIMARY KEY (id)
);
CREATE TABLE user_role
(
    user_id INTEGER NOT NULL,
    roles VARCHAR(255)
);


