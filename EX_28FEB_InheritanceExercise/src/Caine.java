public class Caine extends Animal {  // Câinele ESTE un Animal
    Zgarda zgarda;
    String nume;

    public Caine(String name) {
        super.nume = name;
    }

    public void latra() {
        System.out.println("HAM HAM!");
    }

    public void puneZgarda(Zgarda zgarda) {
        this.zgarda = zgarda;
    }

    public void afiseazaZgarda() {
        if (this.zgarda == null) {
            System.out.println("Cainele " + super.nume + " nu are zgarda.");
        }
        else {
            System.out.println("Cainele " + super.nume + " are zgarda " + this.zgarda.afiseaza());
        }
    }

}

