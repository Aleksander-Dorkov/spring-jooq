package com.example.jooqtest.config;

import lombok.extern.slf4j.Slf4j;
import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.Database;
import org.jooq.meta.jaxb.Generate;
import org.jooq.meta.jaxb.Generator;
import org.jooq.meta.jaxb.Jdbc;
import org.jooq.meta.jaxb.Target;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class DatabaseCodeGen {

//    @EventListener(ApplicationReadyEvent.class)
    public void populateDb() {
        org.jooq.meta.jaxb.Configuration configuration = new org.jooq.meta.jaxb.Configuration()
                .withJdbc(new Jdbc()
                        .withDriver("org.postgresql.Driver")
                        .withUrl("jdbc:postgresql://localhost:5432/university")
                        .withUser("root")
                        .withPassword("1234"))
                .withGenerator(new Generator()
                        .withGenerate(new Generate().withFluentSetters(true))
                        .withDatabase(new Database()
                                .withName("org.jooq.meta.postgres.PostgresDatabase")
                                .withIncludes(".*")
                                .withExcludes("")
                                .withInputSchema("public")
                                .withIncludePackages(true))
                        .withTarget(new Target()
                                .withClean(true)
                                .withPackageName("com.example.jooqtest.jooq")
                                .withDirectory("src/main/java"))
                );
        try {
            GenerationTool.generate(configuration);
        } catch (Exception e) {
            log.error("{}: {}", e.getClass().getSimpleName(), e.getMessage());
        }
    }
}
