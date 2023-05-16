ALTER TABLE products
ADD CONSTRAINT fk_people_categories
FOREIGN KEY(category_id) REFERENCES categories(id);