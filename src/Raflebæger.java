import java.util.ArrayList;
import java.util.Random;

public class Raflebæger {


    private ArrayList<Integer> listeAfØjne;
    private int antalTerninger;
    private Random random;

    public Raflebæger(int antalTerninger) {
        this.antalTerninger = antalTerninger;
        random = new Random();
        listeAfØjne = new ArrayList<>();
    }

    public int ryst() {
        listeAfØjne.clear();
        int total = 0;
        for (int i = 0; i < antalTerninger; i++) {
            int øje = random.nextInt(1,7);
            total += øje;
            listeAfØjne.add(øje);
        }

        return total;
    }

    public ArrayList<Integer> se() {
        return listeAfØjne;
    }


}
