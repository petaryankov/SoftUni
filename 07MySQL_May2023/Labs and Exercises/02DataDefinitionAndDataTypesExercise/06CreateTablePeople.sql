CREATE TABLE `people` (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(200) NOT NULL,
    `picture` BLOB,
    `height` DOUBLE(10 , 2 ),
    `weight` DOUBLE(10 , 2 ),
    `gender` CHAR(1) NOT NULL,
    `birthdate` DATE NOT NULL,
    `biography` TEXT
);
INSERT INTO `people`(`name`, `gender`, `birthdate`)
VALUES
("Gosho", 'm', DATE(NOW())),
("Atanas", 'm', DATE(NOW())),
("Krisi", 'f', DATE(NOW())),
("Pesho", 'm', DATE(NOW())),
("Tosho", 'm', DATE(NOW()));