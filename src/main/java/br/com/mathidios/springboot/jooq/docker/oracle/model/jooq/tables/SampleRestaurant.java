/*
 * This file is generated by jOOQ.
 */
package br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables;


import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.Indexes;
import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.Keys;
import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.Sample;
import br.com.mathidios.springboot.jooq.docker.oracle.model.jooq.tables.records.SampleRestaurantRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class SampleRestaurant extends TableImpl<SampleRestaurantRecord> {

    private static final long serialVersionUID = -1385368731;

    /**
     * The reference instance of <code>SAMPLE.SAMPLE_RESTAURANT</code>
     */
    public static final SampleRestaurant SAMPLE_RESTAURANT = new SampleRestaurant();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SampleRestaurantRecord> getRecordType() {
        return SampleRestaurantRecord.class;
    }

    /**
     * The column <code>SAMPLE.SAMPLE_RESTAURANT.ID_RESTAURANT</code>.
     */
    public final TableField<SampleRestaurantRecord, Long> ID_RESTAURANT = createField("ID_RESTAURANT", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>SAMPLE.SAMPLE_RESTAURANT.NM_RESTAURANT</code>.
     */
    public final TableField<SampleRestaurantRecord, String> NM_RESTAURANT = createField("NM_RESTAURANT", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>SAMPLE.SAMPLE_RESTAURANT.ID_DISHE</code>.
     */
    public final TableField<SampleRestaurantRecord, Long> ID_DISHE = createField("ID_DISHE", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>SAMPLE.SAMPLE_RESTAURANT</code> table reference
     */
    public SampleRestaurant() {
        this(DSL.name("SAMPLE_RESTAURANT"), null);
    }

    /**
     * Create an aliased <code>SAMPLE.SAMPLE_RESTAURANT</code> table reference
     */
    public SampleRestaurant(String alias) {
        this(DSL.name(alias), SAMPLE_RESTAURANT);
    }

    /**
     * Create an aliased <code>SAMPLE.SAMPLE_RESTAURANT</code> table reference
     */
    public SampleRestaurant(Name alias) {
        this(alias, SAMPLE_RESTAURANT);
    }

    private SampleRestaurant(Name alias, Table<SampleRestaurantRecord> aliased) {
        this(alias, aliased, null);
    }

    private SampleRestaurant(Name alias, Table<SampleRestaurantRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SampleRestaurant(Table<O> child, ForeignKey<O, SampleRestaurantRecord> key) {
        super(child, key, SAMPLE_RESTAURANT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sample.SAMPLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ID_RESTAURANT_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SampleRestaurantRecord> getPrimaryKey() {
        return Keys.ID_RESTAURANT_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SampleRestaurantRecord>> getKeys() {
        return Arrays.<UniqueKey<SampleRestaurantRecord>>asList(Keys.ID_RESTAURANT_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SampleRestaurantRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SampleRestaurantRecord, ?>>asList(Keys.ID_DISHE_FK);
    }

    public SampleDishe sampleDishe() {
        return new SampleDishe(this, Keys.ID_DISHE_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleRestaurant as(String alias) {
        return new SampleRestaurant(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SampleRestaurant as(Name alias) {
        return new SampleRestaurant(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SampleRestaurant rename(String name) {
        return new SampleRestaurant(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SampleRestaurant rename(Name name) {
        return new SampleRestaurant(name, null);
    }
}
