import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

    /** Nome e idade exercicio
     * While
     */

        Scanner scan = new Scanner (System.in);

            while (true){
         
            String nomeAluno;
            int idade;

                System.out.println("Por favor digite o seu nome: ");
                nomeAluno = scan.next();

                System.out.println("Por favor digite a sua idade: ");
                idade = scan.nextInt();

                    if (nomeAluno.equals("0")){
                        break;

            } else {
                System.out.println("Nome = "+nomeAluno);
                System.out.println("Idade = "+idade);
            }
         

    }
    scan.close();
}

}