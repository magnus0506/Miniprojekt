package company;
import java.io.*;
import java.util.Scanner;

public class tekstfil {
    private String birthday;
    private String firstName;
    private String lastName;
    private int id;

    public void writeFile() {
        try {
            FileWriter filewriter1 = new FileWriter("barneoversigt.rtf");
            BufferedWriter bufferedwriter = new BufferedWriter(filewriter1);

            for(int i = 0; i < barnCrud.barneListe.size(); i++) {
                if(i != 0) {
                    bufferedwriter.newLine();
                }
                Barn b = barnCrud.barneListe.get(i);
                bufferedwriter.write(b.getFirstName() + "\t" + b.getLastName() + "\t" + b.getBirthday() + "\t" + b.getId());
            }
            bufferedwriter.close();

            FileWriter fileWriter2 = new FileWriter("parentscontact.rtf");
            BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);
            for(int i = 0; i < barnCrud.parentsListe.size(); i++){
                if(i !=0) {
                    bufferedWriter2.newLine();
                }
                Parents p = barnCrud.parentsListe.get(i);
                bufferedWriter2.write(p.getFirstName() + "\t" + p.getLastName() + "\t" + p.getBirthday() + "\t" + p.getId() + "\t" + p.getTlfnr());
            }
            bufferedWriter2.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Det er sket en fejl, prøv igen. Tjek eventuelt om du har oprettet en tekstfil til forældre og børne data");
        }
    }

    public void readFile() throws IOException {
        String fileLocation = "barneoversigt.rtf";

        try {
            Scanner scanner = new Scanner(new File(fileLocation));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] split = line.split("\\s");
                firstName = split[0];
                lastName = split[1];
                birthday = split[2];
                id = Integer.parseInt(split[3]);

                Barn barneliste = new Barn(firstName, lastName, birthday, id);
                barnCrud.barneListe.add(barneliste);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Tjek at den relevante tekstfil ligger i programmet");
            e.printStackTrace();
        }
    }

    public void readFileParents() throws IOException {
        int tlfnr;
        String fileLocationParents = "parentscontact.rtf";

        try {
            Scanner scanner = new Scanner(new File(fileLocationParents));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] split = line.split("\\s");
                firstName = split[0];
                lastName = split[1];
                birthday = split[2];
                id = Integer.parseInt(split[3]);
                tlfnr = Integer.parseInt(split[4]);
                Parents parentsliste = new Parents(firstName, lastName, birthday, id, tlfnr);
                barnCrud.parentsListe.add(parentsliste);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Tjek at den relevante tekstfil ligger i programmet");
            e.printStackTrace();
        }
    }

    public void printListe(){
        System.out.printf("%-12s", "First Name");
        System.out.printf("%-12s", "Last Name");
        System.out.printf("%-12s", "Birthday");
        System.out.printf("%-12s", "ID");
        System.out.println();

        for(Barn b : barnCrud.barneListe){
            System.out.printf("%-12s", b.getFirstName());
            System.out.printf("%-12s", b.getLastName());
            System.out.printf("%-12s", b.getBirthday());
            System.out.printf("%-12s", b.getId());
            System.out.println();
        }
    }

    public void printParentsListe() {
        System.out.printf("%-12s", "First Name");
        System.out.printf("%-12s", "Last Name");
        System.out.printf("%-12s", "Birthday");
        System.out.printf("%-12s", "ID");
        System.out.printf("%-12s", "Telefon Nr ");
        System.out.println();

        for (Parents p : barnCrud.parentsListe) {
            System.out.printf("%-12s", p.getFirstName());
            System.out.printf("%-12s", p.getLastName());
            System.out.printf("%-12s", p.getBirthday());
            System.out.printf("%-12s", p.getId());
            System.out.printf("%-12s", p.getTlfnr());
            System.out.println();
        }
    }

    public void exitAndWrite(){
        writeFile();
        System.exit(0);
    }
}




















