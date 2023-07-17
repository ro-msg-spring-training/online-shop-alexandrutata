INSERT INTO product_category(id, name, description) VALUES(1, 'Electronics', 'All kind small to large of electronics');
INSERT INTO product_category(id, name, description) VALUES(2, 'Toys', 'Different toys for children');

INSERT INTO supplier(id, name) VALUES(1, 'Emag');
INSERT INTO supplier(id, name) VALUES(2, 'Domo');
INSERT INTO supplier(id, name) VALUES(3, 'Altex');

INSERT INTO product(name, description, price, weight, category_id, supplier_id, image_url) VALUES ('Lego Ninjago', 'Lego set with Ninjago', 299.99, 1.45, 2, 3, 'www.lego.com/ninjago');
INSERT INTO product(name, description, price, weight, category_id, supplier_id, image_url) VALUES ('Barbie', 'Barbie doll', 149.99, 0.800, 2, 1, 'www.barbie.com');
INSERT INTO product(name, description, price, weight, category_id, supplier_id, image_url) VALUES ('Arctic M123', 'Arctic Refrigirator', 1299.99, 25.45, 1, 2, 'www.barbie.com');