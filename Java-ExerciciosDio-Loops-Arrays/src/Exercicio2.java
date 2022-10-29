import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
       
        /** Exercicio2 - While - Nota
        *      
        */ 
       
        Scanner scan = new Scanner (System.in);

            while (true) {

                int nota;

                    System.out.println("Por favor digite a sua nota: ");
                    nota = scan.nextInt();

                    /** Nesta seção do código, o programa realiza as comparações e determina
                     * se as condições se cumprem e o fluxo termina ou se deve seguir até
                     * obter a condição esperada
                     */    
                        if (nota >=0 && nota <=10){
                            System.out.println("Sua nota é = "+nota);
                                break;
                        } else {
                            System.out.println("Valor inválido!");
                        }
            }
            scan.close();
    }
   
}