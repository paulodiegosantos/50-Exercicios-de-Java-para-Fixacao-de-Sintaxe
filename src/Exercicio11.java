//Verifique se um número é par ou ímpar usando `if`.
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        String parOuImpar;
        if(numero%2 == 0){
            parOuImpar = "Par";
        }else{
            parOuImpar = "Impar";
        }
        System.out.println("Seu numero é " + parOuImpar);
    }
}