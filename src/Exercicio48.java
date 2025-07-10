//Crie um método `falar()` dentro da classe `Pessoa` que imprima uma frase.
import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = entrada.next();
        System.out.print("Informe sua idade: ");
        int idade = entrada.nextInt();
        Pessoa pessoaTeste = new Pessoa(nome, idade);
        pessoaTeste.falar();
    }
}
