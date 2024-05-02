package com.example.jooqtest;

import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JooqtestApplicationTests {

    public JooqtestApplicationTests() {
        Assertions.assertAll(() -> Assertions.assertTrue(true));
    }
}
