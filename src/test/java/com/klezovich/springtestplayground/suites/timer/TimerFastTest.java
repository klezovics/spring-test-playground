package com.klezovich.springtestplayground.suites.timer;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Slf4j
@Tag("fast")
public class TimerFastTest {

    @Test
    void testTimerFast() {
        log.info("Running FAST timer test");
    }
}
