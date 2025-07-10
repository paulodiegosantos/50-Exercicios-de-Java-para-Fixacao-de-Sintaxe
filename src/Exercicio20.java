//Use um operador ternário para verificar se a pessoa pode votar.
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        int idade = entrada.nextInt();
        String podeVotar = (idade >= 16 && idade <= 70) ? "Você pode votar" : "Você Não pode votar";
        System.out.println(podeVotar);
    }
}