import java.util.Scanner;

public class Uri_1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int inicio = teclado.nextInt();
        int fim = teclado.nextInt();
        int total;

        if (inicio >= 0 && fim <=24){
            total = fim - inicio;
            System.out.print("O JOGO DUROU "+total);
            System.out.println(" HORA(S)");
        }
    }
}
