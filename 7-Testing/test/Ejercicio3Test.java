package test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Ejercicio3;

public class Ejercicio3Test {

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
        Ejercicio3.main(new String[1]);
        String salida = outputStreamCaptor.toString();
        //Vemos 3 Opciones para resolver el test; Opcion1:
        //assertEquals("El doble de 15 es: 30\r\nEl triple de 15 es: 45\r\n", salida);
        //Opcion2:
        //assertTrue(salida.contains("El doble de 15 es: 30\r\n"));
        //assertTrue(salida.contains("El triple de 15 es: 45\r\n"));
        //opcion3:
        String[] Salidas = salida.split("\r\n");
        assertEquals("El doble de 15 es: 30", Salidas[0]);
        assertEquals("El triple de 15 es: 45", Salidas[1]);
    }


    @Test
    void testDoblar() {
        int res = Ejercicio3.doblar(2);
        assertEquals(4, res);
    }



    @Test
    void testTriple() {
        int res = Ejercicio3.triple(2);
        assertEquals(6, res);
    }
}
