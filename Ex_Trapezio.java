import java.util.Scanner;

public class Ex_Trapezio{
    public static void main(String arg[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        double basemaior, basemenor, altura, area;

        // Entrada 
        System.out.println("Digite o Valor da Base Maior:");
        basemaior = teclado.nextDouble();
        System.out.println("Digite o Valor da Base Menor:");
        basemenor = teclado.nextDouble();
        System.out.println("Digite o Valor da Altura:");
        altura = teclado.nextDouble();

        //processamento
        area = (basemaior + basemenor)* altura /2;

        // Saida
        System.out.println("O Valor da Area do Trapazio é:" + area);
    }
}