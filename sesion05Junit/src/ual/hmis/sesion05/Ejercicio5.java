package ual.hmis.sesion05;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio5 {
    public static  <T extends Comparable<T>> List<T> union(List<T> list1, List<T> list2) {
        Set<T> resSet = new TreeSet<>();
        if (list1!=null) resSet.addAll(list1);
        if (list2!=null) resSet.addAll(list2);
        List<T> res = new ArrayList<>();
        res.addAll(resSet);
        return res;
    }
}
