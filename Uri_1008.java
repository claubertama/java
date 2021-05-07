import java.util.Scanner;

public class Uri_1008{
    public static void main(String arg[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int NUMBERFUNC, NUMBERHORA; 
        double  VALORHORA, SALARY;

        //Entrada
        NUMBERFUNC = teclado.nextInt();
        NUMBERHORA = teclado.nextInt();
        VALORHORA  = teclado.nextDouble();

        //processamento
        SALARY = NUMBERHORA * VALORHORA;

        //Saida
        System.out.println("NUMBER = "+NUMBERFUNC);
        System.out.printf("SALARY = U$ %.2f\n",SALARY);
    }
}
