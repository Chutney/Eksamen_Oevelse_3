import java.util.ArrayList;
import java.util.Random;

public class Rafleb�ger {


    private ArrayList<Integer> listeAf�jne;
    private int antalTerninger;
    private Random random;

    public Rafleb�ger(int antalTerninger) {
        this.antalTerninger = antalTerninger;
        random = new Random();
        listeAf�jne = new ArrayList<>();
    }

    public int ryst() {
        listeAf�jne.clear();
        int total = 0;
        for (int i = 0; i < antalTerninger; i++) {
            int �je = random.nextInt(1,7);
            total += �je;
            listeAf�jne.add(�je);
        }

        return total;
    }

    public ArrayList<Integer> se() {
        return listeAf�jne;
    }


}
