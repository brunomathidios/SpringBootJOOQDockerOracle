/*
 * This file is generated by jOOQ.
 */
package br.com.mathidios.springboot.jooq.docker.oracle.model.jooq;


import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.SampleDishe;
import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.SampleOrder;
import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.SampleOrderProduct;
import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.SampleProduct;
import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.SampleRestaurant;
import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.SampleUser;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>SAMPLE</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ID_DISHE_PK = Indexes0.ID_DISHE_PK;
    public static final Index ID_ORDER_PK = Indexes0.ID_ORDER_PK;
    public static final Index ID_ORDER_PRODUCT_PK = Indexes0.ID_ORDER_PRODUCT_PK;
    public static final Index ID_PRODUCT_PK = Indexes0.ID_PRODUCT_PK;
    public static final Index ID_RESTAURANT_PK = Indexes0.ID_RESTAURANT_PK;
    public static final Index ID_USER_PK = Indexes0.ID_USER_PK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index ID_DISHE_PK = Internal.createIndex("ID_DISHE_PK", SampleDishe.SAMPLE_DISHE, new OrderField[] { SampleDishe.SAMPLE_DISHE.ID_DISHE }, true);
        public static Index ID_ORDER_PK = Internal.createIndex("ID_ORDER_PK", SampleOrder.SAMPLE_ORDER, new OrderField[] { SampleOrder.SAMPLE_ORDER.ID_ORDER }, true);
        public static Index ID_ORDER_PRODUCT_PK = Internal.createIndex("ID_ORDER_PRODUCT_PK", SampleOrderProduct.SAMPLE_ORDER_PRODUCT, new OrderField[] { SampleOrderProduct.SAMPLE_ORDER_PRODUCT.ID_ORDER_PRODUCT }, true);
        public static Index ID_PRODUCT_PK = Internal.createIndex("ID_PRODUCT_PK", SampleProduct.SAMPLE_PRODUCT, new OrderField[] { SampleProduct.SAMPLE_PRODUCT.ID_PRODUCT }, true);
        public static Index ID_RESTAURANT_PK = Internal.createIndex("ID_RESTAURANT_PK", SampleRestaurant.SAMPLE_RESTAURANT, new OrderField[] { SampleRestaurant.SAMPLE_RESTAURANT.ID_RESTAURANT }, true);
        public static Index ID_USER_PK = Internal.createIndex("ID_USER_PK", SampleUser.SAMPLE_USER, new OrderField[] { SampleUser.SAMPLE_USER.ID_USER }, true);
    }
}