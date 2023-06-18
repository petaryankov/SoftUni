CREATE TABLE people (
    person_id INT AUTO_INCREMENT NOT NULL UNIQUE,
    first_name VARCHAR(100) NOT NULL,
    salary DECIMAL(10 , 2 ) DEFAULT 0,
    passport_id INT UNIQUE NOT NULL
);

CREATE TABLE passports (
	passport_id INT AUTO_INCREMENT PRIMARY KEY,
    passport_number VARCHAR(8) UNIQUE NOT NULL
);

ALTER TABLE people
ADD CONSTRAINT pk_people_person_id PRIMARY KEY (person_id),
ADD CONSTRAINT fk_people_passports_passport_id 
FOREIGN KEY (passport_id)
REFERENCES passports (passport_id);

INSERT INTO passports(passport_id,passport_number)
VALUES (101,'N34FG21B'), (102,'K65LO4R7'), (103,'ZE657QP2');

INSERT INTO people (first_name, salary, passport_id)
VALUES('Roberto', 43300.00, 102),('Tom', 56100.00, 103),('Yana', 60200.00, 101);


