import java.util.Random;

public class Dwa {
    public static void main(String[] args) {
        int[][] tab2D = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < tab2D.length; i++) {
            for (int j = 0; j < tab2D.length; j++) {
                tab2D[i][j] = random.nextInt(0, 101);
                System.out.print(tab2D[i][j] + " ");
            }
            System.out.println();
        }
        int i;
        int j;
        int max = tab2D[0][0];
        int min = tab2D[0][0];
        for (i = 0; i < tab2D.length; i++) {
            for (j = 0; j < tab2D.length; j++) {
                if (tab2D[i][j] > max) {
                    max = tab2D[i][j];
                }
                if (tab2D[i][j] < min) {
                    min = tab2D[i][j];
                }
            }
        }
        System.out.println("Najmniejsza liczba: " + min);
        System.out.println("Największa liczba: " + max);
    }
}

