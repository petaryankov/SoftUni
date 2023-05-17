CREATE TABLE `categories` (
    `id` INT PRIMARY KEY AUTO_INCREMENT,
    `category` VARCHAR(100) NOT NULL,
    `daily_rate` DECIMAL,
    `weekly_rate` DECIMAL,
    `monthly_rate` DECIMAL,
    `weekend_rate` DECIMAL
);

insert into categories(category) values("test1"),("test2"),("test3");

CREATE TABLE `cars` (
    `id` INT PRIMARY KEY AUTO_INCREMENT,
    `plate_number` VARCHAR(100) NOT NULL,
    `make` VARCHAR(100),
    `model` VARCHAR(100),
    `car_year` YEAR,
    `category_id` INT,
    `doors` INT,
    `picture` BLOB,
    `car_condition` VARCHAR(100),
    `available` BOOLEAN
);

insert into cars(plate_number) values("p1"),("p2"),("p3");

CREATE TABLE `employees` (
    `id` INT PRIMARY KEY AUTO_INCREMENT,
    `first_name` VARCHAR(100) NOT NULL,
    `last_name` VARCHAR(100) NOT NULL,
    `title` VARCHAR(100),
    `notes` VARCHAR(100)
);

insert into employees(first_name, last_name) values("FN1", "LS1"),("FN2", "LS2"),("FN3", "LS3");

CREATE TABLE `customers` (
    `id` INT PRIMARY KEY AUTO_INCREMENT,
    `driver_licence_number` INT NOT NULL,
    `full_name` VARCHAR(100) NOT NULL,
    `address` VARCHAR(100),
    `city` VARCHAR(100),
    `zip_code` INT,
    `notes` VARCHAR(100)
);

insert into customers(driver_licence_number, full_name) values(1, "f1"),(2, "f2"),(3, "f3");


CREATE TABLE `rental_orders` (
    `id` INT PRIMARY KEY AUTO_INCREMENT,
    `employee_id` INT,
    `customer_id` INT NOT NULL,
    `car_id` INT,
    `car_condition` VARCHAR(100),
    `tank_level` INT,
    `kilometrage_start` DECIMAL,
    `kilometrage_end` DECIMAL,
    `total_kilometrage` DECIMAL,
    `start_date` DATE,
    `end_date` DATE,
    `total_days` INT,
    `rate_applied` DECIMAL,
    `tax_rate` DECIMAL,
    `order_status` VARCHAR(100),
    `notes` VARCHAR(100)
);

insert into rental_orders(customer_id) values(1),(2),(3); 
