CREATE TABLE waiters (
id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
email VARCHAR(50) NOT NULL,
phone VARCHAR(50),
salary DECIMAL(10,2)
);

CREATE TABLE tables(
id INT PRIMARY KEY AUTO_INCREMENT,
floor INT NOT NULL,
reserved TINYINT(1),
capacity INT NOT NULL
);

CREATE TABLE orders(
id INT PRIMARY KEY AUTO_INCREMENT,
table_id INT,
waiter_id INT,
order_time TIME NOT NULL,
payed_status TINYINT(1),
CONSTRAINT fk_tables FOREIGN KEY(table_id) REFERENCES tables(id),
CONSTRAINT fk_waiters FOREIGN KEY(waiter_id) REFERENCES waiters(id)
);

CREATE TABLE clients(
id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
birthdate DATE NOT NULL,
card VARCHAR(50),
review TEXT
);

CREATE TABLE orders_clients(
order_id INT,
client_id INT,
CONSTRAINT fk_orders FOREIGN KEY (order_id) REFERENCES orders(id),
CONSTRAINT fk_clients FOREIGN KEY (client_id) REFERENCES clients(id)
);

CREATE TABLE products(
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30) UNIQUE NOT NULL,
type VARCHAR(30) NOT NULL,
price DECIMAL(10,2) NOT NULL
);

CREATE TABLE orders_products(
order_id INT,
product_id INT,
CONSTRAINT fk_orders_products_orders FOREIGN KEY(order_id) REFERENCES orders(id),
CONSTRAINT fk_order_products_products FOREIGN KEY(product_id) REFERENCES products(id)
);

