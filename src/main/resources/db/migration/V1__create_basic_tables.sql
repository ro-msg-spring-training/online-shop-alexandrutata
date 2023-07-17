CREATE TABLE IF NOT EXISTS product_category
(
    id              int NOT NULL,
    name            varchar(20) NOT NULL,
    description     varchar(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS supplier
(
    id              int NOT NULL,
    name            varchar(20) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS product
(
    id              int auto_increment NOT NULL,
    name            varchar(20) NOT NULL,
    description     varchar(50) NOT NULL,
    price           dec(20,2) NOT NULL,
    weight          double precision NOT NULL,
    category_id     int NOT NULL,
    supplier_id     int NOT NULL,
    image_url       varchar(255),
    PRIMARY KEY (id),
    FOREIGN KEY (category_id) REFERENCES product_category(id),
    FOREIGN KEY (supplier_id) REFERENCES supplier(id)
);
-- CREATE INDEX IF NOT EXISTS policies_policy_holder_index ON policies (policy_holder);