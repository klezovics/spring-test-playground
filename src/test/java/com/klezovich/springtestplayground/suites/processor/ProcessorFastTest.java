package com.klezovich.springtestplayground.suites.processor;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Slf4j
@Tag("fast")
public class ProcessorFastTest {

    @Test
    void testProcessorFast() {
        log.info("Running FAST processor test");
    }
}
