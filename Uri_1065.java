import java.util.Scanner;

public  class Uri_1065{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        int valor;
        int qtdpar = 0;

        for (int contador = 1; contador <=5; contador++){
             valor = teclado.nextInt();
             if (valor % 2 == 0){
                qtdpar++;
            }
        }
        System.out.println(qtdpar + " valores pares");
    }
}
