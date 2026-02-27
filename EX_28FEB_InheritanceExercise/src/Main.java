public class Main {
    public static void main(String[] args) {

        //Definire caini:
        Caine rex = new Caine("Rex");
        Caine pluto = new Caine("Pluto");
        Caine max = new Caine("Max");

        //Definire pisici
        Pisica pufi = new Pisica("Pufi");
        Pisica jerry = new Pisica("Jerry");

        //Definire zgarzi
        Zgarda zgarda1 = new Zgarda("neagra", "de piele");
        Zgarda zgarda2 = new Zgarda("roz", "cu luminite");

        //Actiuni caini
        System.out.println("<====== Actiuni caini =======>");
        rex.mananca(); // Moștenit de la Animal
        pluto.latra(); // Propriu
        max.doarme(); // Moștenit de la Animal

        //Actiuni pisici
        System.out.println("<====== Actiuni pisici =======>");
        pufi.doarme();
        jerry.meow();

        //Definire dieta caine
        Dieta dietaCaine1 = new Dieta("mancare uscata", 3, "mezeluri");
        Dieta dietaCaine2 = new Dieta("mancare umeda", 4, "stafide");
        Dieta dietaCaine3 = new Dieta("orez cu legume", 2, "suc de portocale");

        //Definire dieta pisica
        Dieta dietaPisica1 = new Dieta("mancare uscata", 4, "soareci");
        Dieta dietaPisica2 = new Dieta("mancare umeda", 3, "plante de camera");

        //Setare dieta per caine
        rex.setDieta(dietaCaine1);
        pluto.setDieta(dietaCaine2);
        max.setDieta(dietaCaine3);

        //Setare dieta per pisica
        pufi.setDieta(dietaPisica2);
        jerry.setDieta(dietaPisica1);

        //Actiuni zgarda
        System.out.println("<====== Zgarda =======>");
        rex.afiseazaZgarda();
        rex.puneZgarda(zgarda1);
        rex.afiseazaZgarda();
        pluto.afiseazaZgarda();
        pluto.puneZgarda(zgarda1);
        pluto.afiseazaZgarda();
        max.afiseazaZgarda();
        max.puneZgarda(zgarda2);
        max.afiseazaZgarda();
        max.puneZgarda(zgarda1);
        max.afiseazaZgarda();

        //Actiuni dieta
        System.out.println("<====== Dieta =======>");
        rex.afiseazaDieta(dietaCaine1);
        pluto.afiseazaDieta(dietaCaine2);
        max.afiseazaDieta(dietaCaine3);
        pufi.afiseazaDieta(dietaPisica1);
        jerry.afiseazaDieta(dietaPisica2);






    }
}