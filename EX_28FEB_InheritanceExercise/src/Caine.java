public class Caine extends Animal {  // Câinele ESTE un Animal
    Zgarda zgarda;
    String name;

    public Caine(String name) {
        this.name = name;
    }

    public void latre() {
        System.out.println("HAM HAM!");
    }

    public void puneZgarda(Zgarda zgarda) {
        this.zgarda = zgarda;
    }

    public void afiseazaZgarda() {
        if (this.zgarda == null) {
            System.out.println("Cainele " + name + " nu are zgarda.");
        }
        else {
            System.out.println("Cainele " + name + " are zgarda " + this.zgarda.afiseaza());
        }
    }
}

