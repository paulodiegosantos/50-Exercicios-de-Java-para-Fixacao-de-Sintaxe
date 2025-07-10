//Crie um programa que diga se um número é positivo, negativo ou zero.
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        float numero = entrada.nextInt();
        if(numero > 0){
            System.out.println("Seu número é positivo.");
        }else if(numero == 0){
            System.out.println("Seu número é igual a 0.");
        }else{
            System.out.println("Seu número é negativo.");
        }
    }
}