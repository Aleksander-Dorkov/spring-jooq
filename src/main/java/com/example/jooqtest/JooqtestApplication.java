package com.example.jooqtest;

import com.example.jooqtest.jooq.tables.Student;
import com.example.jooqtest.jooq.tables.records.DepartmentRecord;
import com.example.jooqtest.jooq.tables.records.StudentRecord;
import org.jooq.Batch;
import org.jooq.DSLContext;
import org.jooq.InsertSetMoreStep;
import org.jooq.InsertValuesStepN;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Result;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

import static com.example.jooqtest.jooq.Tables.DEPARTMENT;
import static com.example.jooqtest.jooq.Tables.STUDENT;

@SpringBootApplication
public class JooqtestApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(JooqtestApplication.class, args);
        var dsl = context.getBean(DSLContext.class);
        Result<StudentRecord> fetch = dsl.selectFrom(Student.STUDENT).fetch();
        System.out.println(fetch);
        fetch.forEach(student -> {
            System.out.println(student);
            System.out.println(student.component2());
            System.out.println(student.getName());
            System.out.println(student.getDepartmentId());
        });


        System.out.println("\n\n\n\n\ntuka sme");
        List<StudentRecord> join1 = dsl.select()
                .from(STUDENT)
                .join(DEPARTMENT)
                .on(STUDENT.DEPARTMENT_ID.eq(DEPARTMENT.DEPARTMENT_ID))
                .where(STUDENT.NAME.eq("Bob Smith"))
                .and(DEPARTMENT.NAME.eq("Mathematics"))
                .fetch(row -> {
                    System.out.println(row.get(DEPARTMENT.NAME));
                    row.into(StudentRecord.class);
                    row.into(DepartmentRecord.class);
                    return new StudentRecord()
                            .setStudentId(row.get(STUDENT.STUDENT_ID))
                            .setName(row.get(STUDENT.NAME))
                            .setDepartmentId(row.get(DEPARTMENT.DEPARTMENT_ID))
                            .setDateOfBirth(row.get(STUDENT.DATE_OF_BIRTH));
                });
        System.out.println(join1.getFirst().toString());
        Result<StudentRecord> test1 = dsl.selectFrom(STUDENT).fetch();
        Result<StudentRecord> test2 = dsl.select(STUDENT).from(STUDENT).fetchInto(STUDENT);
        Result<Record1<StudentRecord>> test3 = dsl.select(STUDENT).from(STUDENT).fetch();


        Result<Record> results = dsl.select()
                .from(STUDENT)
                .join(DEPARTMENT)
                .on(STUDENT.DEPARTMENT_ID.eq(DEPARTMENT.DEPARTMENT_ID))
                .where(STUDENT.NAME.eq("Bob Smith"))
                .and(DEPARTMENT.NAME.eq("Mathematics"))
                .fetch();

        StudentRecord studentRecord = results.get(0).into(StudentRecord.class);
        DepartmentRecord departmentRecord = results.get(0).into(DepartmentRecord.class);
        System.out.println(studentRecord);
        System.out.println(departmentRecord);


        var toInsert = new StudentRecord().setDateOfBirth(LocalDate.now()).setName("pesho").setDepartmentId(2).setTeacherId(1);
        InsertSetMoreStep<StudentRecord> set = dsl.insertInto(STUDENT).set(toInsert);
        System.out.println(set);
        int[] execute = dsl.batchInsert(List.of(toInsert)).execute();
        System.out.println(execute);
    }
}
