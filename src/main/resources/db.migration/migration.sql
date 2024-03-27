create table joins.customers
(
    id           serial PRIMARY KEY,
    name         varchar(255),
    surname      varchar(255),
    age          int,
    phone_number varchar(20)
);
insert into joins.customers(name, surname, age, phone_number)
VALUES ('Иван', 'Иванов', 30, '123-456-7890'),
       ('Петр', 'Петров', 25, '456-789-0123'),
       ('Мария', 'Сидорова', 35, '789-012-3456'),
       ('Анна', 'Кузнецова', 28, '012-345-6789'),
       ('Алексей', 'Смирнов', 40, '345-678-9012'),
       ('Екатерина', 'Васильева', 33, '678-901-2345'),
       ('Дмитрий', 'Попов', 27, '901-234-5678');

create table joins.orders
(
    id           serial PRIMARY KEY,
    date         DATE           not null,
    costumer_id  integer references joins.customers (id),
    product_name VARCHAR(255)   NOT NULL,
    amount       DECIMAL(10, 2) NOT NULL
);

insert into joins.orders(date, costumer_id, product_name, amount)
values ('2024-03-01', 1, 'Product A', 100.50),
       ('2024-03-02', 2, 'Product B', 75.20),
       ('2024-03-03', 3, 'Product C', 120.75),
       ('2024-03-04', 1, 'Product D', 50.00),
       ('2024-03-05', 4, 'Product E', 200.00),
       ('2024-03-06', 5, 'Product F', 150.25),
       ('2024-03-07', 1, 'Product G', 90.80);

create table joins.persons
(
    name           VARCHAR(255) NOT NULL,
    surname        VARCHAR(255) NOT NULL,
    age            INT          NOT NULL,
    phone_number   VARCHAR(20),
    city_of_living VARCHAR(255),
    PRIMARY KEY (name, surname, age)
);

INSERT INTO joins.persons (name, surname, age, phone_number, city_of_living)
VALUES ('John', 'Doe', 30, '123-456-7890', 'New York'),
       ('Alice', 'Smith', 25, '987-654-3210', 'Los Angeles'),
       ('Michael', 'Johnson', 35, '555-123-4567', 'Chicago'),
       ('Emily', 'Brown', 28, '777-888-9999', 'San Francisco'),
       ('Daniel', 'Wilson', 40, '444-555-6666', 'Houston'),
       ('Sophia', 'Martinez', 33, '222-333-4444', 'Miami'),
       ('Oliver', 'Taylor', 27, '666-777-8888', 'Seattle');