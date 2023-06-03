package ual.hmis.sesion05;

/**
 * Esta clase contiene un método para transformar un número entero de acuerdo a ciertas reglas.
 */
public class Ejercicio1 {

    /**
     * Transforma un número entero de acuerdo a ciertas reglas.
     *
     * @param x el número entero a transformar.
     * @return el resultado de la transformación.
     */
    public int transformar(int x) {
        int resultado = 0;
        if (x % 2 == 0) // Si el número es divisible por 2
            resultado = transformar(x / 2); // Llamada recursiva con la mitad del número
        else if (x % 3 == 0) // Si el número es divisible por 3
            resultado = transformar(x / 3); // Llamada recursiva con el tercio del número
        else if (x % 5 == 0) // Si el número es divisible por 5
            resultado = transformar(x / 5); // Llamada recursiva con la quinta parte del número
        else
            return x; // Si el número no es divisible por 2, 3 ni 5, devuelve el número original
        return resultado;
    }
}

