//Some dois números do tipo `double` e mostre o resultado com 2 casas decimais.
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formatarNumero = new DecimalFormat("#.##");
        System.out.print("Informe o primeiro numero com virgula: ");
        double primeiroNumero = entrada.nextDouble();
        System.out.print("Informe o segundo numero com virgula: ");
        double segundoNumero = entrada.nextDouble();
        String numeroFormatado = formatarNumero.format(primeiroNumero+segundoNumero);
        System.out.println("O valor após formatado é: " + numeroFormatado);
    }
}