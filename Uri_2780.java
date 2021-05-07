import java.util.Scanner;

public class Uri_2780{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int D = teclado.nextInt();

        if (D <= 800){
            System.out.println(1);
        }
        else if (D >= 801 && D <= 1400){
            System.out.println(2);
        }
        else if (D >= 1401 && D <=2000){
            System.out.println(3);
        }
    }
}