package com.sigmaukraine.klymenko.andriy.warmup;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingValleysSolutionTest {


    @ParameterizedTest(name = "path = {0}, expected valley count = {1}")
    @CsvSource({
            "UDDDUDUU, 1",
            "UUDDDUUDDDDUU, 2"
    })
    void count(String path, int expectedCount) {
        assertEquals(expectedCount, CountingValleysSolution.countingValleys(path.length(), path));
    }

}
