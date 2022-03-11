import javax.xml.parsers.SAXParser;

public class Client {
    int id;
    String nume;
    String adresa;
    int nrParticipari;
    int nrLicitatiiCastigate;
    int idProdusDorit;

    public Client(int id, String nume, String adresa, int nrParticipari, int nrLicitatiiCastigate, int idProdusDorit) {
        this.id = id;
        this.nume = nume;
        this.adresa = adresa;
        this.nrParticipari = nrParticipari;
        this.nrLicitatiiCastigate = nrLicitatiiCastigate;
        this.idProdusDorit = idProdusDorit;
    }
    public Client() {

    }

    public Client setId(int id) {
        this.id = id;
        return this;
    }

    public Client setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public Client setAdresa(String adresa) {
        this.adresa = adresa;
        return this;
    }

    public Client setNrParticipari(int nrParticipari) {
        this.nrParticipari = nrParticipari;
        return this;
    }

    public Client setNrLicitatiiCastigate(int nrLicitatiiCastigate) {
        this.nrLicitatiiCastigate = nrLicitatiiCastigate;
        return this;
    }

    public Client setProdusDorit(int idProdusDorit) {
        this.idProdusDorit = idProdusDorit;
        return this;
    }
}
