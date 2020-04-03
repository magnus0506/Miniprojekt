package company;

public class Parents extends Barn {
    int tlfnr;
    public Parents(String firstName, String lastName, String birthday, int id, int tlfnr) {
        super(firstName, lastName, birthday, id);
        this.tlfnr = tlfnr;

            }

    @Override
    public String toString() {
        return "ParentsContactList{" +
                "tlfnr=" + tlfnr +
                '}';
    }

    public int getTlfnr() {
        return tlfnr;
    }

    public void setTlfnr(int tlfnr) {
        this.tlfnr = tlfnr;
    }
}

