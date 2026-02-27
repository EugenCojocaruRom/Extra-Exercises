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
        return this.tipHrana + ", " + this.portiiPeZi + ", " + this.restrictii;
    }
}
