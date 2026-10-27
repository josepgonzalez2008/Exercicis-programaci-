import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dades = new int[5];
        int suma = 0;

        for (int i = 0; i < dades.length; i++) {
            System.out.print("Introdueix un enter: ");
            dades[i] = sc.nextInt();
        }

        for (int i = 0; i < dades.length; i++) {
            suma += dades[i];
            double mitjana = suma * 1.0 / dades.length;

            System.out.println("Suma: " + suma);
            System.out.println("Mitjana: " + mitjana);

        }
    }
}