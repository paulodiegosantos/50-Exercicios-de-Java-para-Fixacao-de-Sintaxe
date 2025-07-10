//Crie uma classe `Calculadora` com métodos `somar`, `subtrair`, `multiplicar`, e `dividir`.
import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        //Operação de soma
        System.out.print("1 - Soma\nInforme o número A: ");
        float numeroA = entrada.nextFloat();
        System.out.print("Informe o número B: ");
        float numeroB = entrada.nextFloat();
        calculadora.somar(numeroA,numeroB);

        //Operação de subtração
        System.out.print("2 - Subtração\nInforme o número A: ");
        numeroA = entrada.nextFloat();
        System.out.print("Informe o número B: ");
        numeroB = entrada.nextFloat();
        calculadora.subtrair(numeroA,numeroB);

        //Operação de multiplicação
        System.out.print("3 - Multiplicação\nInforme o número A: ");
        numeroA = entrada.nextFloat();
        System.out.print("Informe o número B: ");
        numeroB = entrada.nextFloat();
        calculadora.multiplicar(numeroA,numeroB);

        //Operação de divisão
        System.out.print("4 - Divisão\nInforme o número A: ");
        numeroA = entrada.nextFloat();
        System.out.print("Informe o número B: ");
        numeroB = entrada.nextFloat();
        calculadora.dividir(numeroA,numeroB);

    }
}
