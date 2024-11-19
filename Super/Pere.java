package TP.Preparation.Super;

public class Pere {
    private String nom;
    private String prenom;
    private int age;

    public Pere(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Age : " + age);
    }
}
