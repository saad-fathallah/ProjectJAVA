import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    ArrayList<Employe> listeEmploye=new ArrayList<Employe>();
    Scanner s = new Scanner(System.in);

    // 1)Ajouter employé
    public void ajouter(){
        Employe employe = new Employe();
        System.out.println("Donner le matricule:");
        int matr = s.nextInt();
        System.out.println("Donner le nom:");
        String nom = s.nextLine();
        System.out.println("Donner le prenom:");
        String prenom = s.nextLine();
        System.out.println("Donner l'age:");
        int age = s.nextShort();
        System.out.println("Donner le salaire:");
        int salaire = s.nextInt();

        employe.setMatricule(matr);
        employe.setNom(nom);
        employe.setPrenom(prenom);
        employe.setAge(age);
        employe.setSalaire(salaire);
        if(listeEmploye.contains(employe.getMatricule())){
            System.out.println("L'employé existe");
        }else {listeEmploye.add(employe);
            System.out.println("Ajouter avec succeé");
        }
    }

    //update
    public void modifier(){
        Employe employe = new Employe();
        System.out.println("Donner le matricule de l'employé:");
        int matricule = s.nextInt();
        for (Employe i:listeEmploye) {
            if (i.getMatricule()==matricule){
                System.out.println("Donner le neauvau nom:");
                String nom = s.nextLine();
                System.out.println("Donner le neauvau prenom:");
                String prenom = s.nextLine();
                System.out.println("Donner le neauvau age:");
                short age = s.nextShort();
                System.out.println("Donner le neauvau salaire:");
                int salaire = s.nextInt();
                i.setNom(nom);
                i.setPrenom(prenom);
                i.setAge(age);
                i.setSalaire(salaire);
                System.out.println("Modification avec succeé");
            }else {
                System.out.println("L'employe n'existe pas");
            }
        }
    }

    //remove
    public void suprimer() {
        Employe employe = new Employe();
        System.out.println("Donner le matricule de l'employé:");
        int matricule = s.nextInt();
        int compteur =0;
        for (Employe i : listeEmploye) {
            if (i.getMatricule() == matricule) {
                listeEmploye.remove(i);
                System.out.println("Suprission avec succeé");
                compteur++;
            }
        }
        if (compteur==0){
            System.out.println("L'employe n'existe pas");
        }
    }

    //display
    public void afficher(){
        System.out.println("Donner le matricule de l'employé:");
        int matricule = s.nextInt();
        System.out.println("\n-------------------------------\n");
        if(listeEmploye.isEmpty()){
            System.out.println("La liste est vide!!!");
        }else{
            for (Employe i : listeEmploye) {
                if (i.getMatricule() == matricule) {
                    System.out.println("Matricule:" + i.getMatricule() + "\nNom complet:" + i.getNom() + " " + i.getPrenom()
                            + "\nAge:" + i.getAge() + "\nSalaire:" + i.getSalaire());
                } else {
                    System.out.println( "L'emplyé n'xiste pas");
                }
            }
        }
    }

    //display all
    public void afficherListe(){
        if(listeEmploye.isEmpty()){
            System.out.println("La liste est vide");
        } else{
            for (Employe i : listeEmploye) {
                if (listeEmploye.size() != 0) {
                    System.out.println("Matricule:"+i.getMatricule()+"\nNom complet:"+i.getNom()+" "+i.getPrenom()
                            +"\nAge:"+i.getAge()+"\nSalaire:"+i.getSalaire()+"--------------");
                }
            }
        }
    }

    //Sal>10000
    public void salairePlus(){
        int compteur =0;
        for (Employe i:listeEmploye) {
            if (i.getSalaire()>10000) {
                compteur++;
            }
        }
        if (compteur>0){
            System.out.println("Le nombre d'employés est:"+compteur);
        }else {
            System.out.println("acun employé");
        }
    }

    //old
    public int plusAge(){
        Employe employe = new Employe();
        int maxage = employe.getAge();
        for (Employe i:listeEmploye) {
            if(i.getAge()>maxage){
                maxage=i.getAge();
            }
        }
        return maxage;
    }

    //new employe
    public int moinAge(){
        int minage = listeEmploye.get(0).getAge();
        for (Employe i:listeEmploye) {
            if(i.getAge()<minage){
                minage=i.getAge();
            }
        }
        return minage;
    }

    //leave
    public void quitter(){
        System.out.println("au revoire ");
        System.exit(0);
    }
    public void menu(){
        System.out.println("\n_________________________________________________________________");
        System.out.println("++++++++++++++ .Menu. +++++++++++++");
        System.out.println("1-Ajouter un employé:");
        System.out.println("2-Modifier un employé:");
        System.out.println("3-Suprimmer un employé:");
        System.out.println("4-Afficher un employé:");
        System.out.println("5-Afficher tous les employé:");
        System.out.println("6-Nombre d'employé avc un salaire>10000:");
        System.out.println("7-Afficher l'employer le plus agé:");
        System.out.println("8-Afficher l'employer le moin agé:");
        System.out.println("9-Quitter:");
        System.out.println("_________________________________________________________________");
    }
}
