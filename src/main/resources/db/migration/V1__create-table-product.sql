CREATE TABLE product (
    id_product INTEGER PRIMARY KEY NOT NULL UNIQUE,
    name_product TEXT NOT NULL,
    price_in_cents  FLOAT NOT NULL
);