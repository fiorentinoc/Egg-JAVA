package test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.Ej711;

public class Ej711Test {

    private final PrintStream  standardOut = System.out;
    private final ByteArrayOutputStream  outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void testMain() {
        Ej711.main(new String[1]);
        String salida = outputStreamCaptor.toString();
        assertEquals("Hola Mundo!!!\r\n", salida);
    }
}
