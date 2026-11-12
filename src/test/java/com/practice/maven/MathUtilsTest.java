package com.practice.maven;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilsTest {
    @Test
    void addsTwoNumbers() {
        assertEquals(15, MathUtils.add(5, 10));
    }
    @Test
    void testFilePath(){
        Path path = Path.of("data","intput.txt");

        assertEquals("intput.txt",path.getFileName().toString());
    }
}
