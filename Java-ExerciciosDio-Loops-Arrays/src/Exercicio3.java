import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
       /** Exercicio Do-While - MaiorEMedia
        */ 
        
        Scanner scan = new Scanner (System.in);

        int numero = 0, maior = 0, media = 0, contador = 0;

        /*Neste exercicio, o programa recebe 5 números e realiza a somatoria deles.
         * Além disso, determina o número maior mediante um IF e determina depois,
         * a media dessa lista de números, imprimindo os valores finalmente.
         */
        
        do {

            System.out.println("Número = ");
            numero = scan.nextInt();

                media += numero;

                    if (numero > maior);
                        maior = numero; 

                    contador++;

        } while(contador < 5);
        System.out.println("Número maior = "+maior);
        System.out.println("Media = "+(media/5));
        
        scan.close();
        
        }
       
    }








