import java.util.Scanner;

public class Ex_Triangulo{
    public static   void main(String arg[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double base, altura, area;

        // entrada de dados
        System.out.println("Digite o valor da base:");
        base = teclado.nextDouble();
        System.out.println("Digite o valor da altura:");
        altura = teclado.nextDouble();

        // Processsamento
        area = base * altura /2;

        // Saída
        System.out.println("O Valor da area é: " + area);


    }
}