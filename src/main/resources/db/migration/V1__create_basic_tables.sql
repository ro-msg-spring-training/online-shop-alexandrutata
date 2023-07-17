CREATE TABLE IF NOT EXISTS product
(
    id              serial NOT NULL,
    name            VARCHAR(20) NOT NULL,
    description     VARCHAR(50) NOT NULL,
    price           decimal NOT NULL,
    weight          double precision NOT NULL,
    category_id     int4 NOT NULL,
    supplier_id     int4 NOT NULL,
    image_url       VARCHAR(255),
    PRIMARY KEY (id)
);
-- CREATE INDEX IF NOT EXISTS policies_policy_holder_index ON policies (policy_holder);