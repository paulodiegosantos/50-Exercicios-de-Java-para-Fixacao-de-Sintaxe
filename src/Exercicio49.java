//Adicione um construtor à classe `Pessoa` para definir `nome` e `idade`.
import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = entrada.next();
        System.out.print("Informe sua idade: ");
        int idade = entrada.nextInt();
        Pessoa pessoaTeste = new Pessoa(nome, idade);
        System.out.print("Classe criada com sucesso!\nNome: " + pessoaTeste.getNome() + " | Idade: " + pessoaTeste.getIdade());
    }
}
