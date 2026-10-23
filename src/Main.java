import java.util.Scanner;

void main() {
    int Num0 = 0;
    int Num1 = 0;
    int Num2 = 0;
    int Num3 = 0;
    int Num4 = 0;
    Scanner llegir = new Scanner(System.in);
    Num0 = llegir.nextInt();
    Num1 = llegir.nextInt();
    Num2 = llegir.nextInt();
    Num3 = llegir.nextInt();
    Num4 = llegir.nextInt();

    float[] scores = {Num0,Num1,Num2,Num3,Num4};
    int longitud = scores.length;
    System.out.println(" 0:"+scores[0]+" 1:"+scores[1]+" 2:"+scores[2]+" 3:"+scores[3]+"4:"+scores[4]);
    System.out.println(scores.length);
    System.out.println(" 0:"+scores[0]+" 4:"+scores[4]);


}