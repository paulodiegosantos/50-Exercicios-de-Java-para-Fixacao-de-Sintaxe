//Mostre a tabuada de um número (1–10).
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escolha um número para ser mostrado a tabuada: ");
        int numeroEscolhido = entrada.nextInt();
        for(int i = 1; i < 11; i++){
            System.out.println(numeroEscolhido + " X " + i + " = " + (numeroEscolhido*i));
        }
    }
}