public class Zgarda {

    private String culoare;
    private String material;

    public Zgarda(String culoare, String material) {
        this.culoare = culoare;
        this.material = material;
    }

    public String afiseaza() {
        return this.culoare + ", " + this.material;
    }
}
