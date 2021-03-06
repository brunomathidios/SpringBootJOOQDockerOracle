/*
 * This file is generated by jOOQ.
 */
package br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.records;


import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.SampleDishe;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class SampleDisheRecord extends UpdatableRecordImpl<SampleDisheRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 2026410230;

    /**
     * Setter for <code>SAMPLE.SAMPLE_DISHE.ID_DISHE</code>.
     */
    public void setIdDishe(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>SAMPLE.SAMPLE_DISHE.ID_DISHE</code>.
     */
    public Long getIdDishe() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>SAMPLE.SAMPLE_DISHE.NM_DISHE</code>.
     */
    public void setNmDishe(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>SAMPLE.SAMPLE_DISHE.NM_DISHE</code>.
     */
    public String getNmDishe() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return SampleDishe.SAMPLE_DISHE.ID_DISHE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SampleDishe.SAMPLE_DISHE.NM_DISHE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getIdDishe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getNmDishe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getIdDishe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNmDishe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleDisheRecord value1(Long value) {
        setIdDishe(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleDisheRecord value2(String value) {
        setNmDishe(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleDisheRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SampleDisheRecord
     */
    public SampleDisheRecord() {
        super(SampleDishe.SAMPLE_DISHE);
    }

    /**
     * Create a detached, initialised SampleDisheRecord
     */
    public SampleDisheRecord(Long idDishe, String nmDishe) {
        super(SampleDishe.SAMPLE_DISHE);

        set(0, idDishe);
        set(1, nmDishe);
    }
}
