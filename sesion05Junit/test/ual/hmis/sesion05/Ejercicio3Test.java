package ual.hmis.sesion05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class Ejercicio3Test {

    private final Ejercicio3 ejercicio3 = new Ejercicio3();

    @ParameterizedTest
    @CsvFileSource(resources="loginData.txt")
    
    public void enmascararPassword_validarCadena(String password, String expected) {
        String enmascarado = ejercicio3.enmascararPassword(password);
        assertEquals(expected, enmascarado);
    }
}
