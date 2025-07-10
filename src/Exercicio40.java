//Transforme uma `String` em letras maiúsculas.
import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite algum texto: ");
        String texto = entrada.next().toUpperCase();
        System.out.print("Texto em upper case: " + texto);
    }
}