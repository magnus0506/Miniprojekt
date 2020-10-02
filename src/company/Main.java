package company;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        tekstfil tekstFil = new tekstfil();
        Login login = new Login();
        tekstFil.readFile();
        tekstFil.readFileParents();
        login.systemLogin();
        tekstFil.writeFile();
    }
}
