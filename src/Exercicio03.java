//Converta um valor `int` para `double` e vice-versa.
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor inteiro: ");
        int valorInteiro = entrada.nextInt();
        System.out.print("Digite o valor double: ");
        double valorDouble = entrada.nextDouble();
        double inteiroParaDouble = valorInteiro;
        int doubleParaInteiro = (int)valorDouble;
        System.out.println("Valor inteiro: " + valorInteiro + "\nValor Double: " + valorDouble + "\nValor inteiro após a conversão para double: " + inteiroParaDouble + "\nValor double após a conversão para inteiro: " + doubleParaInteiro);
    }
}
