public class Animal {
    protected String nume;
    protected Dieta dieta;

    public void mananca() {
        System.out.println(nume + " mănâncă");
    }

    public void doarme() {
        System.out.println(nume + " doarme");
    }

    protected void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    protected void afiseazaDieta(Dieta dieta) {
        System.out.println(nume + " -> " +dieta.afiseazaDieta());
    }

}

