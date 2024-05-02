/*
 * This file is generated by jOOQ.
 */
package com.example.jooqtest.jooq;


import com.example.jooqtest.jooq.tables.FlywayMigrations;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index FLYWAY_MIGRATIONS_S_IDX = Internal.createIndex(DSL.name("flyway_migrations_s_idx"), FlywayMigrations.FLYWAY_MIGRATIONS, new OrderField[] { FlywayMigrations.FLYWAY_MIGRATIONS.SUCCESS }, false);
}
