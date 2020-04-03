package company;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    private Scanner input = new Scanner(System.in);
    private LoginBrugere loginBrugere = new LoginBrugere();
    private Menu menu = new Menu();
    private jaNej janej = new jaNej();
    private Boolean again;

    public void systemLogin() throws IOException {
        LoginBrugere administrator = new LoginBrugere("admin", "1234", 1);
        LoginBrugere pædagog = new LoginBrugere("pædagog", "4321", 2);

        loginBrugere.loginListe.add(administrator);
        loginBrugere.loginListe.add(pædagog);

        System.out.println("Velkommen til Roskilde Børnehaves system");
        System.out.println("Der er to brugere oprettet på systemet, admin og pædagog");
        System.out.println("Default kodeord er 1234 og 4321 henholdsvis til admin og pædagog brugernavne");
        System.out.println("Indtast venligst dit brugernavn");
        String brugernavn = input.nextLine();
        System.out.println("Indtast nu venligst dit kodeord");
        String kodeord = input.nextLine();

        for (LoginBrugere u : loginBrugere.loginListe) {
            if (brugernavn.equalsIgnoreCase(u.getBrugernavn()) && kodeord.equalsIgnoreCase(u.getKodeord())) {
                do {
                    switch (u.getBrugerNiveau()) {
                        case 1:
                            menu.administratorMenu();
                            break;
                        case 2:
                            menu.pædagogMenu();
                            break;
                    }
                    System.out.println("Vil du videre til menuen? Ja/Nej");
                    again = janej.jaNej();
                } while (again);
            }
        }
    }
}


