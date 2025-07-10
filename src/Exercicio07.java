//Mostre o valor de uma variável `char` e seu código ASCII.
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma leta: ");
        char letra = entrada.next().charAt(0);
        int codigoAscii = (int)letra;
        System.out.println("Letra digitada: " + letra + "\nCódigo ASCII da letra: " + codigoAscii);
    }
}