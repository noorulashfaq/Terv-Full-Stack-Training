create database mec_stores;
use mec_stores;

create table shop_pricelist(
	id int primary key auto_increment,
    product_code varchar(10),
    product_name varchar(50),
    brand_name varchar(50),
    market_price float,
    purchase_price float,
    discount_percent float,
    selling_price float,
    expiry_date date,
    no_of_stocks int
);

desc shop_pricelist;

ALTER TABLE shop_pricelist ADD UNIQUE (product_code);

select * from shop_pricelist;

truncate table shop_pricelist;

insert into shop_pricelist (product_code, product_name, brand_name, market_price, purchase_price, discount_percent, expiry_date, no_of_stocks) values ('P001', 'M416','AR',1000.00,709.50,12,'2050-12-31',10500);
insert into shop_pricelist (product_code, product_name, brand_name, market_price, purchase_price, discount_percent, expiry_date, no_of_stocks) values ('P002', 'AKM','AR',1200.00,850.00,8,'2050-12-31',9500);

update shop_pricelist set selling_price = market_price - (market_price * discount_percent / 100);

create table customer_details(
	customer_id INT PRIMARY KEY,
    customer_name varchar(50),
    mobile bigint,
    product_code varchar(10),
    no_of_items int,
    total_amount float
);

alter table customer_details add foreign key(product_code) references shop_pricelist(product_code);

insert into customer_details values (1001, 'Noorul', 8870468660, 'P001', 2, 0);

drop table customer_details;

select * from customer_details;

update customer_details set total_amount