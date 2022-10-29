import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
            menu main=new menu();
            int i=0;
            do {
                main.menu();
                System.out.print("Donner votre choix:");
                int choix=s.nextInt();
                System.out.println("------------------------------");

                switch (choix){
                    case 1:
                        main.ajouter();
                        break;
                    case 2:
                        main.modifier();
                        break;
                    case 3:
                        main.suprimer();
                        break;
                    case 4:
                        main.afficher();
                        break;
                    case 5:
                        main.afficherListe();
                        break;
                    case 6:
                        main.salairePlus();
                        break;
                    case 7:
                        System.out.println("Le plus Agé est:"+main.plusAge());
                        break;
                    case 8:
                        System.out.println("Le moin Agé est:"+main.moinAge());
                        break;
                    case 9:
                        main.quitter();
                        break;
                }
            }while (i==0);
        }
    }
