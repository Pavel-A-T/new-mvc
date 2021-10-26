CREATE TABLE author
(
    id INTEGER AUTO_INCREMENT,
    author VARCHAR(255),
    CONSTRAINT pk_author PRIMARY KEY (id)
);
CREATE TABLE comment
(
    id INTEGER AUTO_INCREMENT,
    description VARCHAR(255),
    CONSTRAINT pk_comment PRIMARY KEY (id)
);
CREATE TABLE genre
(
    id INTEGER AUTO_INCREMENT,
    genre VARCHAR(255),
    CONSTRAINT pk_genre PRIMARY KEY (id)
);
CREATE TABLE book
(
    id INTEGER AUTO_INCREMENT,
    name VARCHAR(255),
    author integer,
    genre integer,
    comment integer,
    CONSTRAINT pk_book PRIMARY KEY (id),
    CONSTRAINT fk_author FOREIGN KEY (author) REFERENCES author (id),
    CONSTRAINT fk_genre FOREIGN KEY (genre) REFERENCES genre (id),
    CONSTRAINT fk_comment FOREIGN KEY (comment) REFERENCES comment (id)
);

