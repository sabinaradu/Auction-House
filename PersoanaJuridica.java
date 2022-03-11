public class PersoanaJuridica extends Client {
    double capitalSocial;
    Companie companie;

    public enum Companie {
        SRL, SA
    }
    public PersoanaJuridica(int id, String nume, String adresa, int nrParticipari, int nrLicitatiiCastigate, Companie companie, double capitalSocial) {
        this.setId(id);
        this.setNume(nume);
        this.setAdresa(adresa);
        this.setNrParticipari(nrParticipari);
        this.setNrLicitatiiCastigate(nrLicitatiiCastigate);
        this.setCapitalSocial(capitalSocial);
        this.setCompanie(companie);
        this.setProdusDorit(idProdusDorit);
    }

    public PersoanaJuridica setCapitalSocial(double capitalSocial) {
        this.capitalSocial = capitalSocial;
        return this;
    }

    public PersoanaJuridica setCompanie(Companie companie) {
        this.companie = companie;
        return this;
    }

    public double getCapitalSocial() {
        return this.capitalSocial;
    }

    public Companie getCompanie() {
        return this.companie;
    }
}
