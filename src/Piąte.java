import java.util.Random;

public class Piąte {
    public static void main(String[] args) {
        int [] tab= new int [10];
        Random random = new Random();

        for (int i=0; i< tab.length; i++) {
            tab[i] = random.nextInt(21);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
int potwórzenie = 0;
        for (int i=0; i< tab.length; i++) {
            if (tab[i]==5){
                potwórzenie++;
            }
        }
        System.out.println("Liczba powtórzeń 5: " + potwórzenie);
    }
}
