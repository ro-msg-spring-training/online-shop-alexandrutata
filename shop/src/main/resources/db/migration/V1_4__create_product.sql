CREATE TABLE IF NOT EXISTS product(
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(20),
    description varchar(50),
    price decimal,
    weight double,
    imageURL varchar(50),
    product_category_id int,
    supplier_id int,
    CONSTRAINT FK_PRODUCT_PRODUCT_CATEGORY FOREIGN KEY(product_category_id) references product_category(id),
    CONSTRAINT FK_PRODUCT_SUPPLIER FOREIGN KEY(supplier_id) references supplier(id)
);