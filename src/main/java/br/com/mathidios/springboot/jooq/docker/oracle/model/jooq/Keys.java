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
import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.records.SampleDisheRecord;
import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.records.SampleOrderProductRecord;
import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.records.SampleOrderRecord;
import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.records.SampleProductRecord;
import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.records.SampleRestaurantRecord;
import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.records.SampleUserRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>SAMPLE</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<SampleDisheRecord> ID_DISHE_PK = UniqueKeys0.ID_DISHE_PK;
    public static final UniqueKey<SampleOrderRecord> ID_ORDER_PK = UniqueKeys0.ID_ORDER_PK;
    public static final UniqueKey<SampleOrderProductRecord> ID_ORDER_PRODUCT_PK = UniqueKeys0.ID_ORDER_PRODUCT_PK;
    public static final UniqueKey<SampleProductRecord> ID_PRODUCT_PK = UniqueKeys0.ID_PRODUCT_PK;
    public static final UniqueKey<SampleRestaurantRecord> ID_RESTAURANT_PK = UniqueKeys0.ID_RESTAURANT_PK;
    public static final UniqueKey<SampleUserRecord> ID_USER_PK = UniqueKeys0.ID_USER_PK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<SampleOrderRecord, SampleUserRecord> ID_USER_ORDER_FK = ForeignKeys0.ID_USER_ORDER_FK;
    public static final ForeignKey<SampleOrderRecord, SampleRestaurantRecord> ID_RESTAURANT_ORDER_FK = ForeignKeys0.ID_RESTAURANT_ORDER_FK;
    public static final ForeignKey<SampleOrderProductRecord, SampleOrderRecord> ID_ORDER_FK = ForeignKeys0.ID_ORDER_FK;
    public static final ForeignKey<SampleOrderProductRecord, SampleProductRecord> ID_PRODUCT_FK = ForeignKeys0.ID_PRODUCT_FK;
    public static final ForeignKey<SampleProductRecord, SampleRestaurantRecord> ID_RESTAURANT_PRODUCT_FK = ForeignKeys0.ID_RESTAURANT_PRODUCT_FK;
    public static final ForeignKey<SampleRestaurantRecord, SampleDisheRecord> ID_DISHE_FK = ForeignKeys0.ID_DISHE_FK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<SampleDisheRecord> ID_DISHE_PK = Internal.createUniqueKey(SampleDishe.SAMPLE_DISHE, "ID_DISHE_PK", SampleDishe.SAMPLE_DISHE.ID_DISHE);
        public static final UniqueKey<SampleOrderRecord> ID_ORDER_PK = Internal.createUniqueKey(SampleOrder.SAMPLE_ORDER, "ID_ORDER_PK", SampleOrder.SAMPLE_ORDER.ID_ORDER);
        public static final UniqueKey<SampleOrderProductRecord> ID_ORDER_PRODUCT_PK = Internal.createUniqueKey(SampleOrderProduct.SAMPLE_ORDER_PRODUCT, "ID_ORDER_PRODUCT_PK", SampleOrderProduct.SAMPLE_ORDER_PRODUCT.ID_ORDER_PRODUCT);
        public static final UniqueKey<SampleProductRecord> ID_PRODUCT_PK = Internal.createUniqueKey(SampleProduct.SAMPLE_PRODUCT, "ID_PRODUCT_PK", SampleProduct.SAMPLE_PRODUCT.ID_PRODUCT);
        public static final UniqueKey<SampleRestaurantRecord> ID_RESTAURANT_PK = Internal.createUniqueKey(SampleRestaurant.SAMPLE_RESTAURANT, "ID_RESTAURANT_PK", SampleRestaurant.SAMPLE_RESTAURANT.ID_RESTAURANT);
        public static final UniqueKey<SampleUserRecord> ID_USER_PK = Internal.createUniqueKey(SampleUser.SAMPLE_USER, "ID_USER_PK", SampleUser.SAMPLE_USER.ID_USER);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<SampleOrderRecord, SampleUserRecord> ID_USER_ORDER_FK = Internal.createForeignKey(br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.Keys.ID_USER_PK, SampleOrder.SAMPLE_ORDER, "ID_USER_ORDER_FK", SampleOrder.SAMPLE_ORDER.ID_USER);
        public static final ForeignKey<SampleOrderRecord, SampleRestaurantRecord> ID_RESTAURANT_ORDER_FK = Internal.createForeignKey(br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.Keys.ID_RESTAURANT_PK, SampleOrder.SAMPLE_ORDER, "ID_RESTAURANT_ORDER_FK", SampleOrder.SAMPLE_ORDER.ID_RESTAURANT);
        public static final ForeignKey<SampleOrderProductRecord, SampleOrderRecord> ID_ORDER_FK = Internal.createForeignKey(br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.Keys.ID_ORDER_PK, SampleOrderProduct.SAMPLE_ORDER_PRODUCT, "ID_ORDER_FK", SampleOrderProduct.SAMPLE_ORDER_PRODUCT.ID_ORDER);
        public static final ForeignKey<SampleOrderProductRecord, SampleProductRecord> ID_PRODUCT_FK = Internal.createForeignKey(br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.Keys.ID_PRODUCT_PK, SampleOrderProduct.SAMPLE_ORDER_PRODUCT, "ID_PRODUCT_FK", SampleOrderProduct.SAMPLE_ORDER_PRODUCT.ID_PRODUCT);
        public static final ForeignKey<SampleProductRecord, SampleRestaurantRecord> ID_RESTAURANT_PRODUCT_FK = Internal.createForeignKey(br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.Keys.ID_RESTAURANT_PK, SampleProduct.SAMPLE_PRODUCT, "ID_RESTAURANT_PRODUCT_FK", SampleProduct.SAMPLE_PRODUCT.ID_RESTAURANT);
        public static final ForeignKey<SampleRestaurantRecord, SampleDisheRecord> ID_DISHE_FK = Internal.createForeignKey(br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.Keys.ID_DISHE_PK, SampleRestaurant.SAMPLE_RESTAURANT, "ID_DISHE_FK", SampleRestaurant.SAMPLE_RESTAURANT.ID_DISHE);
    }
}
