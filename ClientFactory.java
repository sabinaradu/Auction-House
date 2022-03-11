public class ClientFactory {
    public enum TipClient {
        PersoanaFizica, PersoanaJuridica
    }
    public Client creeazaClient(int id, String name, String adresa, int nrParticipari, int nrLicitatiiCastigate, int idProdusDorit, String dataNastere, PersoanaJuridica.Companie companie, double capitalSocial, TipClient tipClient) {
        switch(tipClient) {
            case PersoanaFizica:
                return new PersoanaFizica(id, name, adresa, nrParticipari, nrLicitatiiCastigate, idProdusDorit, dataNastere);
            case PersoanaJuridica:
                return new PersoanaJuridica(id, name, adresa, nrParticipari, nrLicitatiiCastigate, companie, capitalSocial);
            default:
                return null;
        }
    }
}
