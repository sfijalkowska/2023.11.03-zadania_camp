import java.util.Random;

public class Trzy {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            if (i == 0) {
                tab[i] = random.nextInt(21);
            } else {
                tab[i] = random.nextInt(21 - tab[i - 1])+ tab[i - 1];
            }
            System.out.print(tab[i] + " ");
        }
    }
}
