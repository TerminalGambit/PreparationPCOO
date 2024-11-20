package TP.Preparation.Initialisation;

import java.util.ArrayList;
import java.util.List;

public class Main<T> {
    private T contenu;

    public Main() {
        this.contenu = null;
    }

    public Main(T contenu) {
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

        Main<String> boite = new Main<>();
        boite.setContenu("Hello, World!");
        System.out.println(boite.getContenu());
    }
}
