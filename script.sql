INSERT INTO joins.persons (name, surname, age, phone_number, city_of_living)
VALUES ('John', 'Doe', 30, '123-456-7890', 'New York'),
       ('Alice', 'Smith', 25, '987-654-3210', 'Los Angeles'),
       ('Michael', 'Johnson', 35, '555-123-4567', 'Chicago'),
       ('Emily', 'Brown', 28, '777-888-9999', 'San Francisco'),
       ('Daniel', 'Wilson', 40, '444-555-6666', 'Houston'),
       ('Sophia', 'Martinez', 33, '222-333-4444', 'Miami'),
       ('Oliver', 'Taylor', 27, '666-777-8888', 'Seattle');

insert into joins.customers(name, surname, age, phone_number)
VALUES ('Иван', 'Иванов', 30, '123-456-7890'),
       ('Петр', 'Петров', 25, '456-789-0123'),
       ('Мария', 'Сидорова', 35, '789-012-3456'),
       ('Анна', 'Кузнецова', 28, '012-345-6789'),
       ('Алексей', 'Смирнов', 40, '345-678-9012'),
       ('Екатерина', 'Васильева', 33, '678-901-2345'),
       ('Дмитрий', 'Попов', 27, '901-234-5678');

insert into joins.orders(date, customer_id, product_name, amount)
values ('2024-03-01', 1, 'Product A', 100.50),
       ('2024-03-02', 2, 'Product B', 75.20),
       ('2024-03-03', 3, 'Product C', 120.75),
       ('2024-03-04', 1, 'Product D', 50.00),
       ('2024-03-05', 4, 'Product E', 200.00),
       ('2024-03-06', 5, 'Product F', 150.25),
       ('2024-03-07', 1, 'Product G', 90.80);

select joins.orders.product_name
from joins.orders
         inner join joins.customers
                    ON joins.orders.customer_id = customers.id
WHERE lower(customers.name) = lower(:name);