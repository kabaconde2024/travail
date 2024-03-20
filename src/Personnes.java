public class Personnes {
    private String nom;
    private String prenom;
    private int age;

    public Personnes(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }

    public static void main(String[] args) {
        Personnes p = new Personnes("conde", "kaba", 25);
        System.out.println(p);
    }
}
