public class Tablou extends Produs {
    String numePictor;
    public enum culori {
        ulei, tempera, acrilic
    }

    public Tablou(String numePictor, int id, String nume, double pretVanzare, double pretMinim, int an) {
        this.numePictor = numePictor;
        this.id= id;
        this.nume = nume;
        this.pretVanzare = pretVanzare;
        this.pretMinim = pretMinim;
        this.an = an;
    }

    public Tablou setNumePictor(String numePictor) {
        this.numePictor = numePictor;
        return this;
    }

    public String getNumePictor() {
        return numePictor;
    }
}
