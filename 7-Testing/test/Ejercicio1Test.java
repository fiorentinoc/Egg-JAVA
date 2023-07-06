package test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import src.Ejercicio1;

public class Ejercicio1Test {
    @Test
    void testDoblar() {
        int res = Ejercicio1.doblar(2);
        Assertions.assertEquals(4, res);
    }
}
