/*
 * This file is generated by jOOQ.
 */
package com.example.jooqtest.jooq.tables.records;


import com.example.jooqtest.jooq.tables.Course;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class CourseRecord extends UpdatableRecordImpl<CourseRecord> implements Record4<Integer, String, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.course.course_id</code>.
     */
    public CourseRecord setCourseId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.course.course_id</code>.
     */
    public Integer getCourseId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.course.name</code>.
     */
    public CourseRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.course.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.course.credits</code>.
     */
    public CourseRecord setCredits(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.course.credits</code>.
     */
    public Integer getCredits() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.course.department_id</code>.
     */
    public CourseRecord setDepartmentId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.course.department_id</code>.
     */
    public Integer getDepartmentId() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Course.COURSE.COURSE_ID;
    }

    @Override
    public Field<String> field2() {
        return Course.COURSE.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return Course.COURSE.CREDITS;
    }

    @Override
    public Field<Integer> field4() {
        return Course.COURSE.DEPARTMENT_ID;
    }

    @Override
    public Integer component1() {
        return getCourseId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer component3() {
        return getCredits();
    }

    @Override
    public Integer component4() {
        return getDepartmentId();
    }

    @Override
    public Integer value1() {
        return getCourseId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Integer value3() {
        return getCredits();
    }

    @Override
    public Integer value4() {
        return getDepartmentId();
    }

    @Override
    public CourseRecord value1(Integer value) {
        setCourseId(value);
        return this;
    }

    @Override
    public CourseRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public CourseRecord value3(Integer value) {
        setCredits(value);
        return this;
    }

    @Override
    public CourseRecord value4(Integer value) {
        setDepartmentId(value);
        return this;
    }

    @Override
    public CourseRecord values(Integer value1, String value2, Integer value3, Integer value4) {
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
     * Create a detached CourseRecord
     */
    public CourseRecord() {
        super(Course.COURSE);
    }

    /**
     * Create a detached, initialised CourseRecord
     */
    public CourseRecord(Integer courseId, String name, Integer credits, Integer departmentId) {
        super(Course.COURSE);

        setCourseId(courseId);
        setName(name);
        setCredits(credits);
        setDepartmentId(departmentId);
        resetChangedOnNotNull();
    }
}