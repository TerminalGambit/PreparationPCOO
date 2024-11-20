package TP.Preparation.IterateurForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestRetireNombre {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> integerList2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Iterator<Integer> iter1 = integerList.iterator();
        while (iter1.hasNext()) {
            int i = iter1.next();
            if (i == 3) {
                iter1.remove();
            }
        }

        for (int i : integerList) {
            if (i == 3) {
                integerList2.remove(i);
            }
        }

        System.out.println(integerList);
        System.out.println(integerList2);
    }
}
