import java.util.Scanner;

public class Uri_1007{
     public static void main(String arg[]){
         Scanner teclado;
         teclado = new Scanner(System.in);
        int A, B, C, D, DIFERENCA;

         //Entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        //Processamento
        DIFERENCA = (A * B - C * D);

        //Saida
        System.out.println("DIFERENCA = " + DIFERENCA);
        
     }
}