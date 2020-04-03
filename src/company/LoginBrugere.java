package company;
import java.util.ArrayList;

public class LoginBrugere {
    private String brugernavn;
    private String kodeord;
    private int brugerNiveau;
    ArrayList<LoginBrugere> loginListe = new ArrayList<>();

    public LoginBrugere(String brugernavn, String kodeord, int brugerNiveau) {
        this.brugernavn = brugernavn;
        this.kodeord = kodeord;
        this.brugerNiveau = brugerNiveau;
    }

    public LoginBrugere() { }

    public String getBrugernavn() {
        return brugernavn;
    }

    public String getKodeord() {
        return kodeord;
    }

    public int getBrugerNiveau() {
        return brugerNiveau;
    }
}
