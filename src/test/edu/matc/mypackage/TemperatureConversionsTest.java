package edu.matc.mypackage;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TemperatureConversionsTest {
    @Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheiResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));

        assertEquals("The celcius to Fahrenheit conversion failed",
                celsiusToFahrenheiResult, BigDecimal.valueOf(32));
    }

}