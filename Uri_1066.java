import java.util.Scanner;

public class Uri_1066{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        int valor;
        int qtdPar = 0;
        int qtdImpar = 0;
        int qtdN = 0;
        int qtdP = 0;

        // entrada 
        for (int contador = 1; contador <=5; contador++){
            valor = teclado.nextInt();

            if (valor % 2 == 0){
                qtdPar++;
            }
            else {
                qtdImpar++;
            }
            if (valor > 0){
                qtdP++;    
            }
            else if (valor < 0){
                qtdN++;
            }   
        } 
        System.out.println(qtdPar + " valor(es) par(es)");
        System.out.println(qtdImpar + " valor(es) impar(es)");
        System.out.println(qtdP + " valor(es) positivo(s)");
        System.out.println(qtdN + " valor(es) negativo(s)");
    }
}