//Receba um nome via `Scanner` e imprima "Olá, \[nome]!".
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.next();
        System.out.println("Olá, " + nome);
    }
}