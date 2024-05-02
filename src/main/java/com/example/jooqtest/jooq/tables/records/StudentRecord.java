/*
 * This file is generated by jOOQ.
 */
package com.example.jooqtest.jooq.tables.records;


import com.example.jooqtest.jooq.tables.Student;

import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class StudentRecord extends UpdatableRecordImpl<StudentRecord> implements Record5<Integer, String, LocalDate, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.student.student_id</code>.
     */
    public StudentRecord setStudentId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.student.student_id</code>.
     */
    public Integer getStudentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.student.name</code>.
     */
    public StudentRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.student.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.student.date_of_birth</code>.
     */
    public StudentRecord setDateOfBirth(LocalDate value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.student.date_of_birth</code>.
     */
    public LocalDate getDateOfBirth() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>public.student.department_id</code>.
     */
    public StudentRecord setDepartmentId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.student.department_id</code>.
     */
    public Integer getDepartmentId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.student.teacher_id</code>.
     */
    public StudentRecord setTeacherId(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.student.teacher_id</code>.
     */
    public Integer getTeacherId() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, LocalDate, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, LocalDate, Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Student.STUDENT.STUDENT_ID;
    }

    @Override
    public Field<String> field2() {
        return Student.STUDENT.NAME;
    }

    @Override
    public Field<LocalDate> field3() {
        return Student.STUDENT.DATE_OF_BIRTH;
    }

    @Override
    public Field<Integer> field4() {
        return Student.STUDENT.DEPARTMENT_ID;
    }

    @Override
    public Field<Integer> field5() {
        return Student.STUDENT.TEACHER_ID;
    }

    @Override
    public Integer component1() {
        return getStudentId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public LocalDate component3() {
        return getDateOfBirth();
    }

    @Override
    public Integer component4() {
        return getDepartmentId();
    }

    @Override
    public Integer component5() {
        return getTeacherId();
    }

    @Override
    public Integer value1() {
        return getStudentId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public LocalDate value3() {
        return getDateOfBirth();
    }

    @Override
    public Integer value4() {
        return getDepartmentId();
    }

    @Override
    public Integer value5() {
        return getTeacherId();
    }

    @Override
    public StudentRecord value1(Integer value) {
        setStudentId(value);
        return this;
    }

    @Override
    public StudentRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public StudentRecord value3(LocalDate value) {
        setDateOfBirth(value);
        return this;
    }

    @Override
    public StudentRecord value4(Integer value) {
        setDepartmentId(value);
        return this;
    }

    @Override
    public StudentRecord value5(Integer value) {
        setTeacherId(value);
        return this;
    }

    @Override
    public StudentRecord values(Integer value1, String value2, LocalDate value3, Integer value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentRecord
     */
    public StudentRecord() {
        super(Student.STUDENT);
    }

    /**
     * Create a detached, initialised StudentRecord
     */
    public StudentRecord(Integer studentId, String name, LocalDate dateOfBirth, Integer departmentId, Integer teacherId) {
        super(Student.STUDENT);

        setStudentId(studentId);
        setName(name);
        setDateOfBirth(dateOfBirth);
        setDepartmentId(departmentId);
        setTeacherId(teacherId);
        resetChangedOnNotNull();
    }
}