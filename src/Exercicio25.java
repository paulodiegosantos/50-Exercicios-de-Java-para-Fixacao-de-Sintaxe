//Use `do...while` para pedir uma senha até que esteja correta.
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senhaInformada;
        do{
            System.out.print("Informe sua senha: ");
            senhaInformada = entrada.next();
        }while (!senhaInformada.equals("12345"));
        System.out.println("Login efetuado com sucesso!");
    }
}