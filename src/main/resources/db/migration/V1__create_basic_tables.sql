create table if not exists category
(
    id              int not null,
    name            varchar(20) not null,
    description     varchar(50) not null,
    primary key (id),
    constraint uq_category_name unique (name)
);

create table if not exists supplier
(
    id              int not null,
    name            varchar(20) not null,
    primary key (id),
    constraint uq_supplier_name unique (name)
);

create table if not exists location
(
    id              int not null,
    name            varchar(50) not null,
    country         varchar(50) not null,
    city            varchar(50) not null,
    street          varchar(50) not null,
    primary key (id),
    constraint uq_location_name unique (name)
);

create table if not exists product
(
    id              int auto_increment not null,
    name            varchar(20) not null,
    description     varchar(50) not null,
    price           dec(20,2) not null,
    weight          double precision not null,
    category_id     int not null,
    supplier_id     int not null,
    image_url       varchar(255),
    primary key (id),
    foreign key (category_id) references category(id),
    foreign key (supplier_id) references supplier(id)
);

create table if not exists customer
(
    id              int auto_increment not null,
    firstname       varchar(50) not null,
    lastname        varchar(50) not null,
    username        varchar(50) not null,
    password        varchar(100) not null,
    email           varchar(50) not null,
    primary key (id)
);

create table if not exists stock
(
    id              int auto_increment not null,
    product_id      int not null,
    location_id     int not null,
    quantity        int not null,
    primary key (id),
    constraint uq_stock unique (product_id, location_id),
    foreign key (product_id) references product(id) on delete cascade,
    foreign key (location_id) references location(id)
);

create table if not exists orders
(
    id              int auto_increment not null,
    shipped_from_id int not null,
    customer_id     int not null,
    created_at      timestamp(9) null,
    country         varchar(50) not null,
    city            varchar(50) not null,
    street          varchar(50) not null,
    primary key (id),
    foreign key (shipped_from_id) references location(id),
    foreign key (customer_id) references customer(id)
);

create table if not exists order_detail
(
    id              int auto_increment not null,
    order_id        int not null,
    product_id      int not null,
    quantity        int not null,
    primary key (id),
    constraint uq_order_detail unique (order_id, product_id),
    foreign key (order_id) references orders(id),
    foreign key (product_id) references product(id) on delete cascade
);

create table if not exists revenue
(
    id              int auto_increment not null,
    location_id     int not null,
    date            date null,
    sum             dec(20,2) not null,
    primary key (id),
    foreign key (location_id) references location(id)
);
