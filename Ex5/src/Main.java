void main() {
    Scanner llegir = new Scanner(System.in);

    int[] N = new int[7];

    for (int i = 0; i < 7; i++)
        N[i] = llegir.nextInt();


    for (int i = 0; i < N.length - 1; i++) {
        for (int j = i + 1; j < N.length; j++) {
            if (N[i] > N[j]) {
                float cambio = N[i];
                N[i] = N[j];
                N[j] = (int) cambio;


            }
        }

    }
    System.out.print(" Minim " +N[0] + " Posició = "+N[;int i = 0;])
    System.out.print(" Maxim " +N[6] + " Posició = "+N[;int i;])
}