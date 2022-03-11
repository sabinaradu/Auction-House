public class Bijuterie extends Produs {
    String material;
    boolean piatraPrețioasă;

    public Bijuterie(String material, boolean piatraPrețioasă, int id, String nume, double pretVanzare, double pretMinim, int an) {
        this.material = material;
        this.piatraPrețioasă = piatraPrețioasă;
        this.id= id;
        this.nume = nume;
        this.pretVanzare = pretVanzare;
        this.pretMinim = pretMinim;
        this.an = an;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isPiatraPrețioasă() {
        return piatraPrețioasă;
    }

    public Bijuterie setMaterial(String material) {
        this.material = material;
        return this;
    }

    public Bijuterie setPiatraPrețioasă(boolean piatraPrețioasă) {
        this.piatraPrețioasă = piatraPrețioasă;
        return this;
    }
}
