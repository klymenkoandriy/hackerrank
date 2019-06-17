package com.sigmaukraine.klymenko.andriy.sorting.comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckerTest {

    private Checker checker;

    @BeforeEach
    public void init() {
        checker = new Checker();
    }

    public static Collection<Object[]> data() {
        return asList(new Object[][]{

                {new Player("amy", 50), new Player("david ", 100), 1},
                {new Player("david", 50), new Player("amy ", 100), 1},
                {new Player("amy", 100), new Player("david ", 100), -1},
                {new Player("david", 100), new Player("amy ", 100), 1},
                {new Player("amy", 100), new Player("amy", 100), 0}
        });
    }

    @ParameterizedTest(name = "{index} : expected = {2}")
    @DisplayName("Should compare players")
    @MethodSource("data")
    public void comparePlayers(Player firs, Player second, int expected) {
        assertEquals(expected, Integer.signum(checker.compare(firs, second)));
    }
}
