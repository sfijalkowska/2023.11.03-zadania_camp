import java.util.Scanner;

public class Piate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę n:");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Ciąg Fibonacciego (" + n + " elementów): ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int suma = a + b;
            a = b;
            b = suma;
        }
    }
}