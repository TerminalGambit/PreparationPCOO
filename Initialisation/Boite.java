package TP.Preparation.Initialisation;

import java.util.ArrayList;
import java.util.List;

public class Boite<T> {
    private T contenu;

    public Boite() {
        this.contenu = null;
    }

    public Boite(T contenu) {
        this.contenu = contenu;
    }

    public T getContenu() {
        return contenu;
    }

    public void setContenu(T contenu) {
        this.contenu = contenu;
    }

    public static void main(String[] args) {
        List<Object> arr1 = new ArrayList<>();

        for(int i=0; i<10; i++) {
            arr1.add(i);
        }

        System.out.println(arr1);

        Boite<String> boite = new Boite<>();
        boite.setContenu("Hello, World!");
        System.out.println(boite.getContenu());
    }
}
