import java.util.Random;

public class Jeden {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(15) * 7;
            System.out.print(tab[i]);
        }
    }
}
