//Instancie dois objetos da classe `Pessoa` e imprima seus dados.
import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o nome da primeira pessoa: ");
        String nome = entrada.next();
        System.out.print("Informe a idade da primeira pessoa: ");
        int idade = entrada.nextInt();
        Pessoa primeiraPessoa = new Pessoa(nome, idade);

        System.out.print("Informe o nome da segunda pessoa: ");
        nome = entrada.next();
        System.out.print("Informe a idade da segunda pessoa: ");
        idade = entrada.nextInt();
        Pessoa segundaPessoa = new Pessoa(nome, idade);

        System.out.print("Objetos Pessoa criados com sucesso!\n1- Nome: " + primeiraPessoa.getNome() + " | Idade: " + primeiraPessoa.getIdade() + "\n2- Nome: " + segundaPessoa.getNome() + " | Idade: " + segundaPessoa.getIdade());
    }
}
