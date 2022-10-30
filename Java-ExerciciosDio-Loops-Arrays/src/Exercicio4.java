import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        
        /* Exercicio4 - DoWhile -ParEImpar
         */

         Scanner scan = new Scanner (System.in);

         int numero = 0, qtdpar = 0, qtdimpar = 0, qtdNumeros = 0, contador = 0;

            do {

                System.out.println("Por favor digite um número: ");
                numero = scan.nextInt();

                    if (numero % 2 == 0) { 
                     qtdpar++;
                        
                    } else {
                    qtdimpar++;
                    }
                    
                    contador++;
    
        } while(contador < qtdNumeros);

        System.out.println("Número par = "+qtdpar);
        System.out.println("Número impar = "+qtdimpar);

        scan.close();

}

}
