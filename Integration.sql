CREATE TABLE "category_product" (
  "id" bigint PRIMARY KEY NOT NULL,
  "description" "character varying(255)",
  "name" "character varying(255)"
);

CREATE TABLE "customer" (
  "id" bigint PRIMARY KEY NOT NULL,
  "birthdate" timestamp(6),
  "contact" "character varying(255)",
  "name" "character varying(255)",
  "password" "character varying(255)",
  "gender_id" bigint
);

CREATE TABLE "point_of_sale" (
  "id" int PRIMARY KEY,
  "name" varchar
);

CREATE TABLE "stock_move" (
  "id" int PRIMARY KEY,
  "product_id" int,
  "date_move" timestamp,
  "unit" int,
  "move_type" varchar
);

CREATE TABLE "gender" (
  "id" bigint PRIMARY KEY NOT NULL,
  "name" "character varying(255)"
);

CREATE TABLE "order_line" (
  "id" bigint PRIMARY KEY NOT NULL,
  "image_url" "character varying(255)",
  "price" numeric(38,2),
  "quantity" integer NOT NULL,
  "order_id" bigint,
  "product_id" bigint UNIQUE
);

CREATE TABLE "orders" (
  "id" bigint PRIMARY KEY NOT NULL,
  "checked" boolean NOT NULL,
  "create_at" timestamp(6),
  "reference" "character varying(255)",
  "user_id" bigint,
  "customer_id" bigint,
  "point_of_sale_id" int
);

CREATE TABLE "product" (
  "id" bigint PRIMARY KEY NOT NULL,
  "base_price" numeric(38,2),
  "description" "character varying(255)" UNIQUE NOT NULL,
  "name" "character varying(255)" UNIQUE NOT NULL,
  "category_id" bigint
);

ALTER TABLE "stock_move" ADD FOREIGN KEY ("product_id") REFERENCES "product" ("id");

ALTER TABLE "orders" ADD FOREIGN KEY ("point_of_sale_id") REFERENCES "point_of_sale" ("id");

ALTER TABLE "customer" ADD CONSTRAINT "fk1lt23ie2trgs1r42hqyhliedv" FOREIGN KEY ("gender_id") REFERENCES "gender" ("id");

ALTER TABLE "orders" ADD CONSTRAINT "fk624gtjin3po807j3vix093tlf" FOREIGN KEY ("customer_id") REFERENCES "customer" ("id");

ALTER TABLE "order_line" ADD CONSTRAINT "fkk9f9t1tmkbq5w27u8rrjbxxg6" FOREIGN KEY ("order_id") REFERENCES "orders" ("id");

ALTER TABLE "product" ADD CONSTRAINT "fkost67owd3gqs8mmqg971nx189" FOREIGN KEY ("category_id") REFERENCES "category_product" ("id");

ALTER TABLE "order_line" ADD CONSTRAINT "fkpf904tci8garypkvm32cqupye" FOREIGN KEY ("product_id") REFERENCES "product" ("id");
