package com.klezovich.springtestplayground.suites.timer;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Slf4j
@Tag("slow")
public class TimerSlowTest {

    @Test
    void testTimerSlow() {
        log.info("Running SLOW timer test");
    }
}
