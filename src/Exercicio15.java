//Peça dois números e exiba o maior.
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        float primeiroNumero = entrada.nextFloat();
        System.out.print("Informe o segundo número: ");
        float segundoNumero = entrada.nextFloat();
        if(primeiroNumero>segundoNumero){
            System.out.println("O primeiro número digitado (" + primeiroNumero + ") é maior que o segundo digitado (" + segundoNumero + ").");
        }else if(primeiroNumero==segundoNumero){
            System.out.println("O primeiro número digitado e o segundo (" + segundoNumero + ") são iguais.");
        }else{
            System.out.println("O segundo número digitado (" + segundoNumero + ") é maior que o primeiro digitado(" + primeiroNumero + ").");
        }
    }
}