import java.util.Arrays;

public class Camera {

    //Variables
    int numar;
    int etaj;
    String locatie;
    Animal[] animale;

    //Constructor
    public Camera(int numar, int etaj, String locatie, Animal[] animale) {
        this.numar = numar;
        this.etaj = etaj;
        this.locatie = locatie;
        this.animale = animale;
    }

    public void afiseazaAnimale() {
        for (Animal animal : animale) {
            System.out.println(animal);
        }
    }

    @Override
    public String toString() {
        return "In camera " + numar + " de la etajul " + etaj
                + ", " + locatie + ", se gasesc urmatoarele animale:";
    }

}
