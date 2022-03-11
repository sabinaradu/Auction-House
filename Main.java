import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double pretMinim = scanner.nextDouble();
        Produs produs = new Produs();
        ProdusFactory factoryProdus = new ProdusFactory();
        String tipProdus = scanner.next();

        while(scanner.hasNext()) {
            int id = scanner.nextInt();
            String name = scanner.next();
            int an = scanner.nextInt();

            switch (tipProdus) {
                case "Tablou":
                    String pictor = scanner.next();
                    String culori = scanner.next();
                    if (culori.equals("ulei")) {
                        produs = factoryProdus.creeazaProdus(id, name, 0.0, pretMinim, an, "tip", "material", pictor, true, ProdusFactory.TipProdus.tablou);
                    } else if (culori.equals("tempera")) {
                        produs = factoryProdus.creeazaProdus(id, name, 0.0, pretMinim, an, "tip", "material", pictor, true, ProdusFactory.TipProdus.tablou);
                    } else {
                        produs = factoryProdus.creeazaProdus(id, name, 0.0, pretMinim, an, "tip", "material", pictor, true, ProdusFactory.TipProdus.tablou);
                    }
                    break;
                case "Mobila":
                    String tip = scanner.next();
                    String material = scanner.next();
                    produs = factoryProdus.creeazaProdus(id, name, 0.0, pretMinim, an, tip, material, "pictor", true, ProdusFactory.TipProdus.mobila);
                    break;
                case "Bijuterie":
                    material = scanner.next();
                    boolean piatra = scanner.nextBoolean();
                    produs = factoryProdus.creeazaProdus(id, name, 0.0, pretMinim, an, "tip", material, "piatra", true, ProdusFactory.TipProdus.bijuterie);
                    break;
            }
        }
        Administrator administrator = new Administrator();
        CasaLicitatii casa = new CasaLicitatii();
        administrator.adaugaProdus(produs, casa.produse);

        for(Produs produs2: casa.produse) {
            System.out.println(produs2.nume);
        }
        Client client = new Client();
        String string;
        string = scanner.next();
        ClientFactory factoryClient = new ClientFactory();

        while (!string.equals("stop")) {
            int id = scanner.nextInt();
            String nume = scanner.next();
            String adresa = scanner.next();
            String tipClient = scanner.next();
            switch (tipClient) {
                case "Fizica":
                    String dataNastere = scanner.next();
                    client = factoryClient.creeazaClient(id, nume, adresa, 0, 0, 5, dataNastere, PersoanaJuridica.Companie.SRL, 0, ClientFactory.TipClient.PersoanaFizica);
                case "Juridica":
                    int capital = scanner.nextInt();
                    String companie = scanner.next();
                    if (companie.equals("SRL")) {
                        client = factoryClient.creeazaClient(id, nume, adresa, 0, 0, 6, "lala", PersoanaJuridica.Companie.SRL, 0, ClientFactory.TipClient.PersoanaJuridica);
                    } else {
                        client = factoryClient.creeazaClient(id, nume, adresa, 0, 0, 7, "lala", PersoanaJuridica.Companie.SA, 0, ClientFactory.TipClient.PersoanaJuridica);
                    }
                    string = scanner.next();
            }
        }
    }
}
