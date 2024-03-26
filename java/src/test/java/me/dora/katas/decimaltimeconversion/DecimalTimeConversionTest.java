package me.dora.katas.decimaltimeconversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DecimalTimeConversionTest {

    DecimalTimeConversion decimalTimeConversion = new DecimalTimeConversion();

    @Test
    void toIndustrial() {
    }

    @ParameterizedTest
    @CsvSource({
            "1, 60",
            "1.75, 105",
            "0.63, 38"
    })
    void testToIndustrial(double expected, int time) {
        double result = decimalTimeConversion.toIndustrial(time);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void toNormal() {
    }
}