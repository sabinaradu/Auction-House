import java.util.ArrayList;
import java.util.List;

public class CasaLicitatii {
    public List<Produs> produse;
    public List<Client> clienti;
    public List<Licitatie> licitatii;
    public List<Broker> brokeri;

    public CasaLicitatii() {
        this.produse = new ArrayList<>(10);
        this.clienti = new ArrayList<>(30);
        this.licitatii = new ArrayList<>(12);
    }
    public void adaugaClient(Client client, List<Client> clienti) {
        clienti.add(client);
    }

    public void alegeProdus(List<Client> clienti) {
        for(int i = 0; i<= clienti.size(); i++) {
            clienti.get(i).idProdusDorit = (int) (Math.random() * (clienti.size() + 1));
        }
    }
}
