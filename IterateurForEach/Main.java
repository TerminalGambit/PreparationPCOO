package TP.Preparation.IterateurForEach;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tableau d'entiers primitifs
        int[] tab = {1, 2, 3, 4, 5};

        // Boucle for-each pour parcourir le tableau
        System.out.println("Parcours avec for-each :");
        for (int i : tab) {
            System.out.printf("%d ", i);
        }
        System.out.println(); // Pour sauter une ligne

        // Tableau de chaînes de caractères
        String[] tab2 = {"a", "b", "c", "d", "e"};

        // Utilisation d'un Iterator avec un tableau de chaînes converti en liste
        System.out.println("Parcours avec Iterator (tableau de chaînes) :");
        Iterator<String> it = Arrays.asList(tab2).iterator();
        while (it.hasNext()) {
            System.out.printf("%s ", it.next());
        }
        System.out.println();

        // Tableau d'entiers primitifs (avec conversion pour utiliser un Iterator)
        int[] tab3 = {1, 2, 3, 4, 5};

        // Conversion du tableau d'entiers primitifs en une liste d'objets Integer
        System.out.println("Parcours avec Iterator (tableau d'entiers) :");
        List<Integer> integerList = Arrays.stream(tab3).boxed().toList();
        Iterator<Integer> it2 = integerList.iterator();
        while (it2.hasNext()) {
            System.out.printf("%d ", it2.next());
        }
        System.out.println();
    }
}