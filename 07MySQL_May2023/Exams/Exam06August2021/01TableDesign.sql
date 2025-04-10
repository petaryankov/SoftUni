CREATE TABLE addresses (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE categories (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(10) NOT NULL
);

CREATE TABLE offices (
    id INT PRIMARY KEY AUTO_INCREMENT,
    workspace_capacity INT NOT NULL,
    website VARCHAR(50) ,
    address_id INT NOT NULL,
    CONSTRAINT fk_offices_addresses FOREIGN KEY (address_id)
        REFERENCES addresses (id)
);

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    age INT NOT NULL,
    salary DECIMAL(10 , 2 ) NOT NULL,
    job_title VARCHAR(20) NOT NULL,
    happiness_level CHAR(1) NOT NULL
);

CREATE TABLE teams (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(40) NOT NULL,
    office_id INT NOT NULL,
    leader_id INT NOT NULL UNIQUE,
    CONSTRAINT fk_teams_offices FOREIGN KEY (office_id)
        REFERENCES offices (id),
    CONSTRAINT fk_teams_employees FOREIGN KEY (leader_id)
        REFERENCES employees (id)
);

CREATE TABLE games (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL UNIQUE,
    description TEXT,
    rating FLOAT DEFAULT 5.5 NOT NULL,
    budget DECIMAL(10 , 2 ) NOT NULL,
    release_date DATE,
    team_id INT NOT NULL,
    CONSTRAINT fk_games_teams FOREIGN KEY (team_id)
        REFERENCES teams (id)
);

CREATE TABLE games_categories (
    game_id INT NOT NULL,
    category_id INT NOT NULL,
    PRIMARY KEY (game_id , category_id),
    CONSTRAINT fk_games_categories_games FOREIGN KEY (game_id)
        REFERENCES games (id),
    CONSTRAINT fk_games_categories_categories FOREIGN KEY (category_id)
        REFERENCES categories (id)
);


