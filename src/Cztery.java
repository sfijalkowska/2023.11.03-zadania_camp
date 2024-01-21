import java.util.Scanner;

public class Cztery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wysokość choinki: ");
        int w = scanner.nextInt();
        for (int i=0; i<w; i++){
            for (int j=0; j<w-i-1; j++){
                System.out.print(" ");
            }
            for (int x = 0; x<2*i+1; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
