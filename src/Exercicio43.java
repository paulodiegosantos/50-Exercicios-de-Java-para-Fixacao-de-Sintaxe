//Faça um método que receba um nome e imprima uma saudação
import java.util.Scanner;

public class Exercicio43 {
    public void saudar(String nome){
        System.out.println("Olá, " + nome);
    };

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Exercicio43 metodo = new Exercicio43();
        System.out.print("Informe o seu nome: ");
        String nome = entrada.next();
        metodo.saudar(nome);
    }
}
