import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];
        int[] resultat = new int[5];

        for (int i = 0; i < 5; i++)
            a[i] = llegir.nextInt();

        for (int i = 0; i < 5; i++)
            b[i] = llegir.nextInt();

        for (int i = 0; i < 5; i++)
            resultat[i] = a[i] + b[i];

        for (int i = 0; i < 5; i++)
            System.out.print(a[i] + " ");
        System.out.print(" ");

        for (int i = 0; i < 5; i++)
            System.out.print(b[i] + " ");
        System.out.print(" ");

        for (int i = 0; i < 5; i++)
            System.out.print(resultat[i] + " ");
    }
}