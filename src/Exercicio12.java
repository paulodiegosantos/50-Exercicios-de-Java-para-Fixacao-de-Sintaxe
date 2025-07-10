//Peça ao usuário sua idade e diga se ele é maior de idade.
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        String maiorIdadeOuMenor;
        if (idade > 17){
            maiorIdadeOuMenor = "Maior de idade";
        }else{
            maiorIdadeOuMenor = "Menor de idade";
        }
        System.out.println("Você é " + maiorIdadeOuMenor);
    }
}