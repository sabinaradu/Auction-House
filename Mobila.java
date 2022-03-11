public class Mobila extends Produs {
    String tip;
    String material;

    public Mobila(int id, String nume, double pretVanzare, double pretMinim, int an, String tip, String material) {
        super(id, nume, pretVanzare, pretMinim, an);
        this.tip = tip;
        this.material = material;
        this.id= id;
        this.nume = nume;
        this.pretVanzare = pretVanzare;
        this.pretMinim = pretMinim;
        this.an = an;
    }

    public String getTip() {
        return tip;
    }

    public String getMaterial() {
        return material;
    }

    public Mobila setTip(String tip) {
        this.tip = tip;
        return this;
    }

    public Mobila setMaterial(String material) {
        this.material = material;
        return this;
    }
}
