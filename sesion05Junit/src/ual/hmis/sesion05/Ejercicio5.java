package ual.hmis.sesion05;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio5 {

    /**
     * Realiza la unión de dos listas, eliminando duplicados y manteniendo el orden.
     *
     * @param <T>    tipo de elementos en las listas
     * @param list1  primera lista
     * @param list2  segunda lista
     * @return una nueva lista que es la unión de las dos listas de entrada
     */
    public static <T extends Comparable<T>> List<T> union(List<T> list1, List<T> list2) {
        Set<T> resSet = new TreeSet<>();
        if (list1 != null) {
            resSet.addAll(list1);
        }
        if (list2 != null) {
            resSet.addAll(list2);
        }
        List<T> res = new ArrayList<>();
        res.addAll(resSet);
        return res;
    }
}
