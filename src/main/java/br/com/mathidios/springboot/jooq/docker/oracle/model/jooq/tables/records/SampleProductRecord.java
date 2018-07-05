/*
 * This file is generated by jOOQ.
 */
package br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.records;


import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.SampleProduct;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SampleProductRecord extends UpdatableRecordImpl<SampleProductRecord> implements Record4<Long, String, Long, BigDecimal> {

    private static final long serialVersionUID = -1701457271;

    /**
     * Setter for <code>SAMPLE.SAMPLE_PRODUCT.ID_PRODUCT</code>.
     */
    public void setIdProduct(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>SAMPLE.SAMPLE_PRODUCT.ID_PRODUCT</code>.
     */
    public Long getIdProduct() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>SAMPLE.SAMPLE_PRODUCT.NM_PRODUCT</code>.
     */
    public void setNmProduct(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>SAMPLE.SAMPLE_PRODUCT.NM_PRODUCT</code>.
     */
    public String getNmProduct() {
        return (String) get(1);
    }

    /**
     * Setter for <code>SAMPLE.SAMPLE_PRODUCT.ID_RESTAURANT</code>.
     */
    public void setIdRestaurant(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>SAMPLE.SAMPLE_PRODUCT.ID_RESTAURANT</code>.
     */
    public Long getIdRestaurant() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>SAMPLE.SAMPLE_PRODUCT.PRICE_PRODUCT</code>.
     */
    public void setPriceProduct(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>SAMPLE.SAMPLE_PRODUCT.PRICE_PRODUCT</code>.
     */
    public BigDecimal getPriceProduct() {
        return (BigDecimal) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, Long, BigDecimal> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, Long, BigDecimal> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return SampleProduct.SAMPLE_PRODUCT.ID_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SampleProduct.SAMPLE_PRODUCT.NM_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return SampleProduct.SAMPLE_PRODUCT.ID_RESTAURANT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return SampleProduct.SAMPLE_PRODUCT.PRICE_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getIdProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getNmProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getIdRestaurant();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getPriceProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getIdProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNmProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getIdRestaurant();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getPriceProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleProductRecord value1(Long value) {
        setIdProduct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleProductRecord value2(String value) {
        setNmProduct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleProductRecord value3(Long value) {
        setIdRestaurant(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleProductRecord value4(BigDecimal value) {
        setPriceProduct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleProductRecord values(Long value1, String value2, Long value3, BigDecimal value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SampleProductRecord
     */
    public SampleProductRecord() {
        super(SampleProduct.SAMPLE_PRODUCT);
    }

    /**
     * Create a detached, initialised SampleProductRecord
     */
    public SampleProductRecord(Long idProduct, String nmProduct, Long idRestaurant, BigDecimal priceProduct) {
        super(SampleProduct.SAMPLE_PRODUCT);

        set(0, idProduct);
        set(1, nmProduct);
        set(2, idRestaurant);
        set(3, priceProduct);
    }
}