import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        int[] dades = new int[6];

        for (int i = 0; i < dades.length; i++) {
            System.out.print("Introdueix un enter: ");
            dades[i] = llegir.nextInt();
        }
        System.out.print("Recorregut original: ");
        for (int i = 0; i < dades.length; i++) {
            System.out.print(dades[i] + " ");
        }

        System.out.print("Recorregut invers: ");
        for (int i = dades.length - 1; i >= 0; i--) {
            System.out.print(dades[i] + " ");
        }

        System.out.println();

        System.out.print("Recorregut original: ");
        for (int i = 0; i < dades.length; i++) {
            System.out.print(dades[i] + " ");
        }

        llegir.close();
    }
}
