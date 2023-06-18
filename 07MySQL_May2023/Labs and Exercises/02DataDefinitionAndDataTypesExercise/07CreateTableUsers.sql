CREATE TABLE `users` (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `username` VARCHAR(30) NOT NULL,
    `password` VARCHAR(26) NOT NULL,
    `profile_picture` BLOB,
    `last_login_time` TIME,
    `is_deleted` BOOLEAN
);

INSERT INTO `users`(`username`, `password`) 
VALUES 
("gosho", "1234"),
("tosho", "4321"),
("ceco", "0000"),
("misho", "1111"),
("sasho", "2222");