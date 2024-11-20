package TP.Preparation.StringsExploration;

public class WeLoveStrings {
    private String type;

    public WeLoveStrings(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "My type is " + type + WeLoveStrings.super.getClass();
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        WeLoveStrings string = new WeLoveStrings("you");
        System.out.println(string);
        string.setType("myself");
        System.out.println(string);
    }
}
