CREATE USER SAMPLE IDENTIFIED BY SAMPLE;
ALTER SESSION SET CURRENT_SCHEMA = SAMPLE;
ALTER USER SAMPLE QUOTA UNLIMITED ON SYSTEM;
GRANT CREATE SESSION TO SAMPLE;


CREATE TABLE sample_user (
    id_user NUMBER(12,0) NOT NULL,
    nm_user VARCHAR(150) NOT NULL,
    login_user VARCHAR(20),
    pwd_user VARCHAR(255),
    CONSTRAINT id_user_pk PRIMARY KEY (id_user)
);

CREATE TABLE sample_dishe (
    id_dishe NUMBER(12,0) NOT NULL,
    nm_dishe VARCHAR(50) NOT NULL,
    CONSTRAINT id_dishe_pk PRIMARY KEY (id_dishe)
);

CREATE TABLE sample_restaurant (
    id_restaurant NUMBER(12,0) NOT NULL,
    nm_restaurant VARCHAR(50),
    id_dishe NUMBER(12,0) NOT NULL,
    CONSTRAINT id_restaurant_pk PRIMARY KEY (id_restaurant),
    CONSTRAINT id_dishe_fk FOREIGN KEY (id_dishe) REFERENCES sample_dishe(id_dishe)
);

CREATE TABLE sample_product (
    id_product NUMBER(12,0) NOT NULL,
    nm_product VARCHAR(50) NOT NULL,
    id_restaurant NUMBER(12,0) NOT NULL,
    price_product NUMBER(18,2),
    CONSTRAINT id_product_pk PRIMARY KEY (id_product),
    CONSTRAINT id_restaurant_product_fk FOREIGN KEY (id_restaurant) REFERENCES sample_restaurant(id_restaurant)
);

CREATE TABLE sample_order (
    id_order NUMBER(12,0) NOT NULL,
    id_user NUMBER(12,0) NOT NULL,
    id_restaurant NUMBER(12,0) NOT NULL,
    in_status_order VARCHAR(10) NOT NULL,
    dt_order DATE,
    fl_aval VARCHAR(1),
    rating NUMBER(1,0),
    CONSTRAINT id_order_pk PRIMARY KEY (id_order),
    CONSTRAINT id_restaurant_order_fk FOREIGN KEY (id_restaurant) REFERENCES sample_restaurant(id_restaurant),
    CONSTRAINT id_user_order_fk FOREIGN KEY (id_user) REFERENCES sample_user(id_user)
);

CREATE TABLE sample_order_product (
    id_order_product NUMBER(12,0) NOT NULL,
    id_order NUMBER(12,0) NOT NULL,
    id_product NUMBER(12,0) NOT NULL,
    CONSTRAINT id_order_product_pk PRIMARY KEY (id_order_product),
    CONSTRAINT id_order_fk FOREIGN KEY (id_order) REFERENCES sample_order(id_order),
    CONSTRAINT id_product_fk FOREIGN KEY (id_product) REFERENCES sample_product(id_product)
);

CREATE SEQUENCE sample_user_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;
CREATE SEQUENCE sample_dishe_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;
CREATE SEQUENCE sample_restaurant_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;
CREATE SEQUENCE sample_product_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;
CREATE SEQUENCE sample_order_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;
CREATE SEQUENCE sample_order_product_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;

INSERT INTO sample_dishe (id_dishe, nm_dishe) VALUES(sample_dishe_seq.NEXTVAL, 'Pizza');
INSERT INTO sample_dishe (id_dishe, nm_dishe) VALUES(sample_dishe_seq.NEXTVAL, 'Hamburguer');
INSERT INTO sample_dishe (id_dishe, nm_dishe) VALUES(sample_dishe_seq.NEXTVAL, 'Italian');
INSERT INTO sample_dishe (id_dishe, nm_dishe) VALUES(sample_dishe_seq.NEXTVAL, 'Brazilian');
