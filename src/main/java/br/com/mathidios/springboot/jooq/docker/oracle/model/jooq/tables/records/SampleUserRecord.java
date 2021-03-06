/*
 * This file is generated by jOOQ.
 */
package br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.records;


import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.SampleUser;

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
public class SampleUserRecord extends UpdatableRecordImpl<SampleUserRecord> implements Record4<Long, String, String, String> {

    private static final long serialVersionUID = -138931192;

    /**
     * Setter for <code>SAMPLE.SAMPLE_USER.ID_USER</code>.
     */
    public void setIdUser(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>SAMPLE.SAMPLE_USER.ID_USER</code>.
     */
    public Long getIdUser() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>SAMPLE.SAMPLE_USER.NM_USER</code>.
     */
    public void setNmUser(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>SAMPLE.SAMPLE_USER.NM_USER</code>.
     */
    public String getNmUser() {
        return (String) get(1);
    }

    /**
     * Setter for <code>SAMPLE.SAMPLE_USER.LOGIN_USER</code>.
     */
    public void setLoginUser(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>SAMPLE.SAMPLE_USER.LOGIN_USER</code>.
     */
    public String getLoginUser() {
        return (String) get(2);
    }

    /**
     * Setter for <code>SAMPLE.SAMPLE_USER.PWD_USER</code>.
     */
    public void setPwdUser(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SAMPLE.SAMPLE_USER.PWD_USER</code>.
     */
    public String getPwdUser() {
        return (String) get(3);
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
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return SampleUser.SAMPLE_USER.ID_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SampleUser.SAMPLE_USER.NM_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SampleUser.SAMPLE_USER.LOGIN_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SampleUser.SAMPLE_USER.PWD_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getIdUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getNmUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLoginUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPwdUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getIdUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNmUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLoginUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPwdUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleUserRecord value1(Long value) {
        setIdUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleUserRecord value2(String value) {
        setNmUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleUserRecord value3(String value) {
        setLoginUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleUserRecord value4(String value) {
        setPwdUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleUserRecord values(Long value1, String value2, String value3, String value4) {
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
     * Create a detached SampleUserRecord
     */
    public SampleUserRecord() {
        super(SampleUser.SAMPLE_USER);
    }

    /**
     * Create a detached, initialised SampleUserRecord
     */
    public SampleUserRecord(Long idUser, String nmUser, String loginUser, String pwdUser) {
        super(SampleUser.SAMPLE_USER);

        set(0, idUser);
        set(1, nmUser);
        set(2, loginUser);
        set(3, pwdUser);
    }
}
