package company;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private barnCrud barnecrud = new barnCrud();
    private tekstfil textfil = new tekstfil();
    private Scanner input = new Scanner(System.in);
    private int valg;

    public void administratorMenu() throws IOException {
        System.out.println("Som administrator har du adgang til alle funktioner i systemet");
        System.out.println("Børnefunktioner:");
        System.out.println("Tryk 1 for at oprette et nyt barn i børneregisteret");
        System.out.println("Tryk 2 for at slette et barn i børneregisteret");
        System.out.println("Tryk 3 for at opdatere et barn i børneregisteret");
        System.out.println("Tryk 4 for at printe børneregisteret");
        System.out.println("Forældrefunktioner: ");
        System.out.println("Tryk 5 for at oprette en ny forældre");
        System.out.println("Tryk 6 for at slette en forældre");
        System.out.println("Tryk 7 for at opdatere en forældre");
        System.out.println("Tryk 8 for at printe en liste af forældre");
        System.out.println("Tryk 9 for at slukke systemet");

        valg = input.nextInt();

        switch (valg) {

            case 1:
                    System.out.println("Du opretter ny et nyt barn i systemet");
                    barnecrud.opretBarn();
                    break;
            case 2:
                System.out.println("Du kan nu slette et barn i systemet, skriv ID'et på barnet der skal slettes");
                textfil.printliste();
                barnecrud.deleteBarn();
                break;
            case 3:
                System.out.println("Du kan nu opdatere et barn i systemet");
                textfil.printliste();
                barnecrud.opdaterBarn();
                break;
            case 4:
                System.out.println("Her er en liste af børn i registeret");
                textfil.printliste();
                break;
            case 5:
                System.out.println("Du kan nu oprette en ny forældre i systemet");
                barnecrud.opretParent();
                break;
            case 6:
                System.out.println("Du kan nu slette en ny forældre i systemet");
                System.out.println("Skriv ID på vedkommende");
                textfil.printParentsListe();
                barnecrud.deleteParent();
                break;
            case 7:
                System.out.println("Du kan nu opdatere en forældre i systemet");
                System.out.println("Her er en liste af forældre der kan opdateres, skriv venligst ID'et på vedkommende");
                textfil.printParentsListe();
                barnecrud.opdaterParent();
                break;
            case 8:
                System.out.println("Her er en liste af forældre i systemet: ");
                textfil.printParentsListe();
                break;
            case 9:
                textfil.exitAndWrite();
                break;
        }
    }

    public void pædagogMenu() {
        System.out.println("Som pædagog har du adgang til et begrænset antal funktioner i systemet");
        System.out.println("Tryk 1 for at oprette et nyt barn i børneregisteret");
        System.out.println("Tryk 2 for at opdatere et barn i børneregisteret");
        System.out.println("Tryk 3 for at printe børneregisteret");
        System.out.println("Tryk 4 for at slukke systemet");

        valg = input.nextInt();

        switch (valg) {

            case 1:
                System.out.println("Du opretter ny et nyt barn i systemet");
                barnecrud.opretBarn();
                break;
            case 2:
                System.out.println("Du kan nu opdatere et barn i systemet");
                textfil.printliste();
                barnecrud.opdaterBarn();
                break;
            case 3:
                System.out.println("Her er en liste af børn i registeret");
                textfil.printliste();
                break;
            case 4:
                textfil.exitAndWrite();
                break;
        }
    }
}
