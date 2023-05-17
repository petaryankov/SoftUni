CREATE TABLE `directors`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`director_name` VARCHAR(100) NOT NULL,
`notes` VARCHAR(100)
);

INSERT INTO `directors`(`director_name`)
VALUES ("Dir1"),("Dir2"),("Dir3"),("Dir4"),("Dir5");

CREATE TABLE `genres`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`genre_name` VARCHAR(100) NOT NULL,
`notes` VARCHAR(100)
);

INSERT INTO `genres`(`genre_name`)
VALUES ("G1"),("G2"),("G3"),("G4"),("G5");


CREATE TABLE `categories`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`category_name` VARCHAR(100) NOT NULL,
`notes` VARCHAR(100)
);

INSERT INTO `categories`(`category_name`)
VALUES ("C1"),("C2"),("C3"),("C4"),("C5");

CREATE TABLE `movies` (
    `id` INT PRIMARY KEY AUTO_INCREMENT,
    `title` VARCHAR(100) NOT NULL,
    `director_id` INT,
    `copyright_year` YEAR,
    `length` INT,
    `genre_id` INT,
    `category_id` INT,
    `rating` INT,
    `notes` VARCHAR(100)
);

INSERT INTO `movies`(`title`)
VALUES ("T1"),("T2"),("T3"),("T4"),("T5");