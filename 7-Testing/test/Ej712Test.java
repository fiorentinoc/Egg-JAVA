package test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ej712Test {

    //Captura de las salidas de consola y las Entradas del Scanner:

    private InputStream  standardIn = System.in;
    private final PrintStream  standardOut = System.out;
    private final ByteArrayOutputStream  outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
        System.setIn(standardIn);

    }
    //Fin capturas

    @Test
    void testMain() {

    }

    @Test
    void testPresentarse() {

    }
}
