package company;

public class Parents extends Barn {
    private int tlfNr;

    public Parents(String firstName, String lastName, String birthday, int id, int tlfNr) {
        super(firstName, lastName, birthday, id);
        this.tlfNr = tlfNr;
            }

    @Override
    public String toString() {
        return "ParentsContactList{" +
                "tlfnr=" + tlfNr +
                '}';
    }

    public int getTlfnr() {
        return tlfNr;
    }

    public void setTlfnr(int tlfnr) {
        this.tlfNr = tlfnr;
    }
}

