public class PersoanaFizica extends Client {
    String dataNastere;

    public PersoanaFizica(int id, String nume, String adresa, int nrParticipari, int nrLicitatiiCastigate, int idProdusDorit, String dataNastere) {
        super(id, nume, adresa, nrParticipari, nrLicitatiiCastigate, idProdusDorit);
        this.dataNastere = dataNastere;
    }
}
