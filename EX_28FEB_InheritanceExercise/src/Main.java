public class Main {
    public static void main(String[] args) {

        // Folosire:
        Caine rex = new Caine("Rex");
        rex.mananca();  // Moștenit de la Animal
        rex.latre();    // Propriu
        rex.afiseazaZgarda();

        Zgarda zgarda1 = new Zgarda("neagra", "de piele");
        rex.puneZgarda(zgarda1);
        rex.afiseazaZgarda();

        Caine pluto = new Caine("Pluto");
        Caine max = new Caine("Max");
        Zgarda zgarda2 = new Zgarda("roz", "cu luminite");
        pluto.afiseazaZgarda();
        pluto.puneZgarda(zgarda1);
        pluto.afiseazaZgarda();

        max.afiseazaZgarda();
        max.puneZgarda(zgarda2);
        max.afiseazaZgarda();

        max.puneZgarda(zgarda1);
        max.afiseazaZgarda();




    }
}