public class Employe {
    private int matricule;
    private String nom;
    private String prenom;
    private int age;
    private int salaire;

    //constricteur
    public Employe() {}

    //accesseurs

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        if (age<120);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}
