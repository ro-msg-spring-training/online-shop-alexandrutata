CREATE TABLE IF NOT EXISTS stock(
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    product_id int,
    location_id int,
    quantity int,
    CONSTRAINT FK_PRODUCT_STOCK FOREIGN KEY(product_id) references product(id),
    CONSTRAINT FK_LOCATION_STOCK FOREIGN KEY(location_id) references location(id)
);