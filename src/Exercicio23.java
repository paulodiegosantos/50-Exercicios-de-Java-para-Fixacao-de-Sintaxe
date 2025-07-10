//Calcule o fatorial de um número usando `for`.
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o número a ser fatorado: ");
        int valorFinal = 1;
        String numerosFatoriais = "Fatorial do número: ";
        for(int fatorial = entrada.nextInt(); fatorial > 0; fatorial--){
            numerosFatoriais += fatorial + " ";
            valorFinal *= fatorial;
        }
        System.out.println(numerosFatoriais + "\nValor final do fatorial: " + valorFinal);
    }
}