CREATE TABLE IF NOT EXISTS order_detail(
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    order_id int,
    product_id int,
    quantity int,
    CONSTRAINT FK_ORDER_ORDER_DETAIL FOREIGN KEY(order_id) references order(id),
    CONSTRAINT FK_PRODUCT_ORDER_DETAIL FOREIGN KEY(product_id) references product(id)
);