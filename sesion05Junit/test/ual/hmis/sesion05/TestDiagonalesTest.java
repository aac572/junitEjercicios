package ual.hmis.sesion05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestDiagonalesTest {

    @ParameterizedTest
    @MethodSource("matricesEnteras")
    public void obtenerDiagonales_matrizCuadrada(int[][] matriz) {
        new TestDiagonales();
        assertThrows(RuntimeException.class, ()->   TestDiagonales.obtenerDiagonales(new int[][]{{1,2,3},{1,2,3}}), "La matriz introducida no es cuadrada");
        int[][] diagonales = TestDiagonales.obtenerDiagonales(matriz);
        int n = matriz.length;

        assertEquals(n, diagonales[0].length);
        assertEquals(n, diagonales[1].length);

        for (int i = 0; i < n; i++) {
            assertEquals(matriz[i][i], diagonales[0][i]);
            assertEquals(matriz[i][n - 1 - i], diagonales[1][i]);
        }
    }

    @ParameterizedTest
    @MethodSource("matricesDouble")
    public void sumarColumnas_matrizCuadrada(double[][] matriz) {
        int n = matriz.length;
        double[] sumaEsperada = new double[n];

        for (int j = 0; j < n; j++) {
            double suma = 0.0;
            for (int i = 0; i < n; i++) {
                suma += matriz[i][j];
            }
            sumaEsperada[j] = suma;
        }

        double[] sumaColumnas = TestDiagonales.sumarColumnas(matriz);

        assertArrayEquals(sumaEsperada, sumaColumnas);
    }

    // Método para generar matrices enteras para el test
    private static int[][][] matricesEnteras() {
        return new int[][][]{
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},  // Matriz cuadrada 3x3
                {{1, 2}, {3, 4}},                    // Matriz cuadrada 2x2
                {{1}}                               // Matriz cuadrada 1x1
        };
    }

     // Método para generar matrices reales para el test
     private static double[][][] matricesDouble() {
        return new double[][][]{
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},  // Matriz cuadrada 3x3
                {{1, 2}, {3, 4}},                    // Matriz cuadrada 2x2
                {{1}}                               // Matriz cuadrada 1x1
        };
    }
}
