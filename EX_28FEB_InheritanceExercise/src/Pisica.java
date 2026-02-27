public class Pisica extends Animal {
    Zgarda zgarda;
    String nume;

    public Pisica(String nume) {
        super.nume = nume;
    }

    public void meow() {
        System.out.println("Meow-meow!");
    }

    public void puneZgarda(Zgarda zgarda) {
        this.zgarda = zgarda;
    }

    public void afiseazaZgarda() {
        if (this.zgarda == null) {
            System.out.println("Pisica " + nume + " nu are zgarda.");
        }
        else {
            System.out.println("Pisica " + nume + " are zgarda " + this.zgarda.afiseaza());
        }
    }

    public void mananca() {

    }
}
