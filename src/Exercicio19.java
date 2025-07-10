//Receba um caractere e diga se é vogal ou consoante.
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe uma letra: ");
        char letra = Character.toLowerCase(entrada.next().charAt(0));
        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("O caractere é vogal.");
        }else{
            System.out.println("O caractere é consoante.");
        }
    }
}