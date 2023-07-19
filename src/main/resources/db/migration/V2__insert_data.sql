insert into `category`(id, name, description) values(1, 'electronics', 'all kind small to large of electronics');
insert into `category`(id, name, description) values(2, 'toys', 'different toys for children');

insert into `supplier`(id, name) values(1, 'emag');
insert into `supplier`(id, name) values(2, 'domo');
insert into `supplier`(id, name) values(3, 'altex');

insert into `location`(id, name, country, city, street) values(1, 'deposit 1', 'romania', 'cluj', 'center');
insert into `location`(id, name, country, city, street) values(2, 'deposit 2', 'romania', 'cluj', 'east');
insert into `location`(id, name, country, city, street) values(3, 'deposit 3', 'romania', 'cluj', 'west');

insert into `product`(name, description, price, weight, category_id, supplier_id, image_url) values('lego ninjago', 'lego set with ninjago', 299.99, 1.45, 2, 3, 'www.lego.com/ninjago');
insert into `product`(name, description, price, weight, category_id, supplier_id, image_url) values('barbie', 'barbie doll', 149.99, 0.800, 2, 1, 'www.barbie.com');
insert into `product`(name, description, price, weight, category_id, supplier_id, image_url) values('arctic m123', 'arctic refrigirator', 1299.99, 25.45, 1, 2, 'www.barbie.com');

insert into `customer`(firstname, lastname, username, password, email) values('alex', 'tata', 'alex.tata', '123', 'alex_tata@yahoo.com');
insert into `customer`(firstname, lastname, username, password, email) values('vero', 'pop', 'vero.pop', '321', 'vero_pop@yahoo.com');

insert into `stock`(product_id, location_id, quantity) values(1, 1, 100);
insert into `stock`(product_id, location_id, quantity) values(1, 2, 50);
insert into `stock`(product_id, location_id, quantity) values(2, 3, 10);

insert into `order`(shipped_from_id, customer_id, created_at, country, city, street) values(1, 1, '2023-01-30 12:34:56', 'romania', 'cluj', 'eroilor');
insert into `order`(shipped_from_id, customer_id, created_at, country, city, street) values(1, 2, '2023-06-02 12:34:56', 'romania', 'cluj', 'eroilor');
insert into `order`(shipped_from_id, customer_id, created_at, country, city, street) values(3, 2, '2023-01-17 12:34:56', 'romania', 'iasi', 'eroilor');

insert into `order_detail`(order_id, product_id, quantity) values(1, 1, 2);
insert into `order_detail`(order_id, product_id, quantity) values(2, 3, 2);
insert into `order_detail`(order_id, product_id, quantity) values(3, 2, 2);

insert into `revenue`(location_id, date, sum) values(1, '2023-12-31', 20000);
insert into `revenue`(location_id, date, sum) values(2, '2023-12-31', 1500);
insert into `revenue`(location_id, date, sum) values(3, '2023-12-31', 1000);