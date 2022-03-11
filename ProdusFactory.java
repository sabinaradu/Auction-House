public class ProdusFactory {

    public enum TipProdus {
        tablou, mobila, bijuterie
    }
    public Produs creeazaProdus(int id, String name, double pretVanzare, double pretMinim, int an, String tip, String material, String numePictor, boolean piatraPretioasa, TipProdus tipProdus) {
        switch(tipProdus) {
            case tablou:
                return new Tablou(numePictor, id, name, pretVanzare, pretMinim, an);
            case mobila:
                return new Mobila(id, name, pretVanzare, pretMinim, an, tip, material);
            case bijuterie:
                return new Bijuterie(material, piatraPretioasa, id, name, pretVanzare, pretMinim, an);
            default:
                return null;
        }
    }
}
