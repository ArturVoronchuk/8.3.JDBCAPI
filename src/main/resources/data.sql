create table netology.CUSTOMERS (
	id bigserial,
	name text,
	surname text,
	age int,
	phone_number bigserial,
	PRIMARY KEY (id)
);

create table netology.ORDERS (
    id SERIAL PRIMARY KEY,
    date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    customer_id INTEGER REFERENCES netology.CUSTOMERS(id),
    product_name VARCHAR(255) NOT NULL,
    amount DECIMAL(10, 2) NOT NULL
);