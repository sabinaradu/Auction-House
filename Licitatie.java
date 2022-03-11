public class Licitatie {
    public static class Builder {
        private int id;
        private int nrParticipanti;
        private int idProdus;
        private int nrPasiMaxim;
        private int idProdusDorit;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setNrParticipanti(int nrParticipanti) {
            this.nrParticipanti = nrParticipanti;
            return this;
        }

        public Builder setIdProdus(int idProdus) {
            this.idProdus = idProdus;
            return this;
        }

        public Builder setNrPasiMaxim(int nrPasiMaxim) {
            this.nrPasiMaxim = nrPasiMaxim;
            return this;
        }

        public Licitatie build() {
            Licitatie licitatie = new Licitatie();
            return licitatie;
        }
    }
}
