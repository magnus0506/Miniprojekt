package company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class barnCrud {
static List<Barn> barneListe = new ArrayList<>();
static List<Parents> parentsListe = new ArrayList<>();
Scanner input = new Scanner(System.in);
private int idChoice;
private int switchChoice;
private boolean success = false;
private int id;
private String birthday;
private String firstName;
private String lastName;
private int tlfNr;

    public void opretBarn(){
        System.out.println("Hvad er barnets fornavn?");
        firstName = input.nextLine();
        System.out.println("Hvad er barnets efternavn?");
        lastName = input.nextLine();
        System.out.println("Hvad er barnets fødselsdag?");
        System.out.println("Følgende formatering ønskes: dd/mm/yyyy");
        birthday = input.nextLine();
        System.out.println("Hvad er barnets ID?");
        id = input.nextInt();

        Barn barn = new Barn(firstName, lastName, birthday, id);
        barneListe.add(barn);
    }

    public void deleteBarn() {
        idChoice = input.nextInt();
        for (int i = 0; i < barneListe.size(); i++) {
            if (idChoice == barneListe.get(i).getId()) {
                success = true;
                System.out.println(barneListe.get(i).getFirstName() + " " + barneListe.get(i).getLastName() + " bliver nu slettet");
                barneListe.remove(barneListe.get(i));
            }
        }
        if (!success) {
            System.out.println("Bruger ID ikke fundet, vend tilbage til menuen og prøv igen");
        }
    }

    public void opdaterBarn(){
        System.out.println("Her er en listen af børn der kan opdateres, skriv ID'et på det relevante barn");
        idChoice = input.nextInt();

        for(Barn b : barneListe){
            if(idChoice == b.getId()){
                success = true;
                System.out.println(b.getFirstName());
                System.out.println(b.getLastName());
                System.out.println(b.getBirthday());
                System.out.println(b.getId());

                System.out.println("Hvilken information skal ændres?");
                System.out.println("Tryk 1 for at ændre fornavn");
                System.out.println("Tryk 2 for at ændre efternavn");
                System.out.println("Tryk 3 for at ændre fødselsdag");
                System.out.println("Tryk 4 for at ændre ID");
                switchChoice = input.nextInt();

                switch (switchChoice) {
                    case 1:
                        System.out.println("Opdater first name");
                        b.setFirstName(input.next());
                        break;
                    case 2:
                        System.out.println("Opdater last name");
                        b.setLastName(input.next());
                        break;
                    case 3:
                        System.out.println("Opdater fødselsdag");
                        System.out.println("Følgende formattering ønskes: dd/mm/yyyy");
                        b.setBirthday(input.next());
                        break;
                    case 4:
                        System.out.println("Opdater ID");
                        b.setId(input.nextInt());
                        break;
                }
            }
        }
        if (!success) {
            System.out.println("Bruger ID ikke fundet, vend tilbage til menuen og prøv igen");
        }
    }

    public void opretParent(){
        System.out.println("Hvad er forældrens fornavn?");
        firstName = input.nextLine();
        System.out.println("Hvad er forældrens efternavn?");
        lastName = input.nextLine();
        System.out.println("Hvad er forældrens fødselsdag?");
        System.out.println("Følgende formatering ønskes: dd/mm/yyyy");
        birthday = input.nextLine();
        System.out.println("Indtast ID svarende til barnets");
        id = input.nextInt();
        System.out.println("Hvad er forældrens telefon nummer?");
        tlfNr =input.nextInt();

        Parents parent = new Parents(firstName, lastName, birthday, id, tlfNr);
        parentsListe.add(parent);
    }

    public void deleteParent(){
        idChoice = input.nextInt();
        for(int i = 0; i< parentsListe.size(); i++){
            if(idChoice == parentsListe.get(i).getId()){
                success = true;
                System.out.println(parentsListe.get(i).getFirstName() + " " + parentsListe.get(i).getLastName() + " bliver nu slettet");
                parentsListe.remove(parentsListe.get(i));
            }
        }
        if (!success) {
            System.out.println("Bruger ID ikke fundet, vend tilbage til menuen og prøv igen");
        }
    }

    public void opdaterParent() {
        idChoice = input.nextInt();

        for (Parents p : parentsListe) {
            if (idChoice == p.getId()) {
                success = true;
                System.out.println(p.getFirstName());
                System.out.println(p.getLastName());
                System.out.println(p.getBirthday());
                System.out.println(p.getId());
                System.out.println(p.getTlfnr());

                System.out.println("Hvilken information skal ændres?");
                System.out.println("Tryk 1 for fornavn");
                System.out.println("Tryk 2 for efternavn");
                System.out.println("Tryk 3 for fødselsdag");
                System.out.println("Tryk 4 for barnets ID");
                System.out.println("Tryk 5 for telefon nummer");
                switchChoice = input.nextInt();

                switch (switchChoice) {
                    case 1:
                        System.out.println("Opdater first name");
                        p.setFirstName(input.next());
                        break;
                    case 2:
                        System.out.println("Opdater last name");
                        p.setLastName(input.next());
                        break;
                    case 3:
                        System.out.println("Opdater fødselsdag");
                        System.out.println("Følgende formattering ønskes: dd/mm/yyyy");
                        p.setBirthday(input.next());
                        break;
                    case 4:
                        System.out.println("Opdater ID");
                        p.setId(input.nextInt());
                        break;
                    case 5:
                        System.out.println("Opdater telefon nummer");
                        p.setTlfnr(input.nextInt());
                }
            }
        }
        if (!success) {
            System.out.println("Bruger ID ikke fundet, vend tilbage til menuen og prøv igen");
        }
    }
}
