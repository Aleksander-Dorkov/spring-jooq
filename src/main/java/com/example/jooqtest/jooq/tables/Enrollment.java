/*
 * This file is generated by jOOQ.
 */
package com.example.jooqtest.jooq.tables;


import com.example.jooqtest.jooq.Keys;
import com.example.jooqtest.jooq.Public;
import com.example.jooqtest.jooq.tables.records.EnrollmentRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Enrollment extends TableImpl<EnrollmentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.enrollment</code>
     */
    public static final Enrollment ENROLLMENT = new Enrollment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EnrollmentRecord> getRecordType() {
        return EnrollmentRecord.class;
    }

    /**
     * The column <code>public.enrollment.enrollment_id</code>.
     */
    public final TableField<EnrollmentRecord, Integer> ENROLLMENT_ID = createField(DSL.name("enrollment_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.enrollment.student_id</code>.
     */
    public final TableField<EnrollmentRecord, Integer> STUDENT_ID = createField(DSL.name("student_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.enrollment.course_id</code>.
     */
    public final TableField<EnrollmentRecord, Integer> COURSE_ID = createField(DSL.name("course_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.enrollment.grade</code>.
     */
    public final TableField<EnrollmentRecord, BigDecimal> GRADE = createField(DSL.name("grade"), SQLDataType.NUMERIC(3, 2), this, "");

    private Enrollment(Name alias, Table<EnrollmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Enrollment(Name alias, Table<EnrollmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.enrollment</code> table reference
     */
    public Enrollment(String alias) {
        this(DSL.name(alias), ENROLLMENT);
    }

    /**
     * Create an aliased <code>public.enrollment</code> table reference
     */
    public Enrollment(Name alias) {
        this(alias, ENROLLMENT);
    }

    /**
     * Create a <code>public.enrollment</code> table reference
     */
    public Enrollment() {
        this(DSL.name("enrollment"), null);
    }

    public <O extends Record> Enrollment(Table<O> child, ForeignKey<O, EnrollmentRecord> key) {
        super(child, key, ENROLLMENT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<EnrollmentRecord, Integer> getIdentity() {
        return (Identity<EnrollmentRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<EnrollmentRecord> getPrimaryKey() {
        return Keys.ENROLLMENT_PKEY;
    }

    @Override
    public List<ForeignKey<EnrollmentRecord, ?>> getReferences() {
        return Arrays.asList(Keys.ENROLLMENT__ENROLLMENT_STUDENT_ID_FKEY, Keys.ENROLLMENT__FK_STUDENT, Keys.ENROLLMENT__ENROLLMENT_COURSE_ID_FKEY, Keys.ENROLLMENT__FK_COURSE);
    }

    private transient Student _enrollmentStudentIdFkey;
    private transient Student _fkStudent;
    private transient Course _enrollmentCourseIdFkey;
    private transient Course _fkCourse;

    /**
     * Get the implicit join path to the <code>public.student</code> table, via
     * the <code>enrollment_student_id_fkey</code> key.
     */
    public Student enrollmentStudentIdFkey() {
        if (_enrollmentStudentIdFkey == null)
            _enrollmentStudentIdFkey = new Student(this, Keys.ENROLLMENT__ENROLLMENT_STUDENT_ID_FKEY);

        return _enrollmentStudentIdFkey;
    }

    /**
     * Get the implicit join path to the <code>public.student</code> table, via
     * the <code>fk_student</code> key.
     */
    public Student fkStudent() {
        if (_fkStudent == null)
            _fkStudent = new Student(this, Keys.ENROLLMENT__FK_STUDENT);

        return _fkStudent;
    }

    /**
     * Get the implicit join path to the <code>public.course</code> table, via
     * the <code>enrollment_course_id_fkey</code> key.
     */
    public Course enrollmentCourseIdFkey() {
        if (_enrollmentCourseIdFkey == null)
            _enrollmentCourseIdFkey = new Course(this, Keys.ENROLLMENT__ENROLLMENT_COURSE_ID_FKEY);

        return _enrollmentCourseIdFkey;
    }

    /**
     * Get the implicit join path to the <code>public.course</code> table, via
     * the <code>fk_course</code> key.
     */
    public Course fkCourse() {
        if (_fkCourse == null)
            _fkCourse = new Course(this, Keys.ENROLLMENT__FK_COURSE);

        return _fkCourse;
    }

    @Override
    public Enrollment as(String alias) {
        return new Enrollment(DSL.name(alias), this);
    }

    @Override
    public Enrollment as(Name alias) {
        return new Enrollment(alias, this);
    }

    @Override
    public Enrollment as(Table<?> alias) {
        return new Enrollment(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Enrollment rename(String name) {
        return new Enrollment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Enrollment rename(Name name) {
        return new Enrollment(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Enrollment rename(Table<?> name) {
        return new Enrollment(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Integer, BigDecimal> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super Integer, ? super Integer, ? super BigDecimal, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super Integer, ? super Integer, ? super BigDecimal, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
