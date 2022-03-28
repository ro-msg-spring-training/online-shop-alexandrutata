CREATE TABLE IF NOT EXISTS `order`(
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    from_location_id int,
    customer_id int,
    created_at timestamp,
    to_location_id int,
    CONSTRAINT FK_FROM_LOCATION_ORDER FOREIGN KEY(from_location_id) references location(id),
    CONSTRAINT FK_TO_LOCATION_ORDER FOREIGN KEY(to_location_id) references location(id),
    CONSTRAINT FK_CUSTOMER_ORDER FOREIGN KEY(customer_id) references customer(id)
);