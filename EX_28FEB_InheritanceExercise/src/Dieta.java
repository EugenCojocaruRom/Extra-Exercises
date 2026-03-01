public class Dieta {

    String tipHrana;
    int portiiPeZi;
    String restrictii;

    public Dieta(String tipHrana, int portiiPeZi, String restrictii) {
        this.tipHrana = tipHrana;
        this.portiiPeZi = portiiPeZi;
        this.restrictii = restrictii;
    }

    public String afiseazaDieta() {
        return "Tip hrana: " + this.tipHrana + "\n\tPortii zilnice: " + this.portiiPeZi
                + "\n\tRestrictii alimentare: " + this.restrictii;
    }
}
