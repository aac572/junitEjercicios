package ual.hmis.sesion05;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class Ejercicio5Test {
    public static List<List<Double>> testCases() {
        List<List<Double>> cases = new ArrayList<>();
        List<Double> nula = null;
        List<Double> empty = new ArrayList<>();
        List<Double> l123 = new ArrayList<>();
        List<Double> l345 = new ArrayList<>();
        l123.add(1.0);l123.add(2.0);l123.add(3.0);
        l345.add(3.0);l345.add(4.0);l345.add(5.0);
        cases.add(nula);cases.add(empty);cases.add(l123);cases.add(l345);
        return cases;
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testUnion(List<Double> list) {
        new Ejercicio5(); // para cobertura del 100
        List<Double> emptyList = new ArrayList<>();
        List<Double> list789 = new  ArrayList<>();
        list789.add(7.0);list789.add(8.0);list789.add(9.0);

        List<Double> resultEmptyList = Ejercicio5.union(list, emptyList);
        List<Double> resultList789 = Ejercicio5.union(list, list789);
        // Resultado si list está vacía o es nula
        if (list==null||list.isEmpty()) {
            assertTrue("La unión debería ser una lista vacía", resultEmptyList.isEmpty());
            assertEquals(list789, resultList789);
        }
        else {
            assertEquals(resultEmptyList.size(), list.size());
            assertEquals(resultList789.size(), list.size()+3);
            List<Double>cero = new ArrayList<>();
            cero.add(0.0);
            assertEquals(resultList789.size()+1, Ejercicio5.union(resultList789, cero).size());
        }
    }
}
