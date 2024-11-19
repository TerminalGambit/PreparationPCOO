package TP.Preparation.Super;

public class Fils extends Pere {
    private String classe;

    public Fils(String nom, String prenom, int age, String classe) {
        super(nom, prenom, age); // Appel du constructeur de la classe mère
        this.classe = classe;
    }

    @Override
    public void afficher() {
        super.afficher(); // Appel de la méthode afficher de la classe mère
        System.out.println("Classe : " + classe);
    }
}
