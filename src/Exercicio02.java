//Faça um programa que receba dois números `int` e exiba a soma.
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.print("Digite o valor do primeiro número: ");
       int primeiroNumero = entrada.nextInt();
        System.out.print("Digite o valor do segundo número: ");
       int segundoNumero = entrada.nextInt();
       int soma = primeiroNumero + segundoNumero;
       System.out.println("O valor da soma dos dois números é " + soma);
    }
}
