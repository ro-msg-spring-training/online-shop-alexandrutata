CREATE TABLE IF NOT EXISTS revenue(
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    date timestamp,
    sum decimal,
    location_id int,
    CONSTRAINT FK_LOCATION_REVENUE FOREIGN KEY(location_id) references location(id)
);