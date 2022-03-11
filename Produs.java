public class Produs {
    int id;
    String nume;
    double pretVanzare;
    double pretMinim;
    int an;

    public Produs() {

    }
    public Produs(int id, String nume, double pretVanzare, double pretMinim, int an) {
        this.id = id;
        this.nume = nume;
        this.pretVanzare = pretVanzare;
        this.pretMinim = pretMinim;
        this.an = an;
    }

    public Produs setId(int id) {
        this.id = id;
        return this;
    }

    public Produs setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public Produs setPretVanzare(double pretVanzare) {
        this.pretVanzare = pretVanzare;
        return this;
    }

    public Produs setPretMinim(double pretMinim) {
        this.pretMinim = pretMinim;
        return this;
    }

    public Produs setAn(int an) {
        this.an = an;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public double getPretVanzare() {
        return pretVanzare;
    }

    public double getPretMinim() {
        return pretMinim;
    }

    public int getAn() {
        return an;
    }
}
