//Crie um método que receba dois inteiros e retorne a soma
import java.util.Scanner;

public class Exercicio41 {
    public void somar(float a, float b){
      System.out.println("A soma dos números é: " + (a+b));
    };

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Exercicio41 calcular = new Exercicio41();
        System.out.print("Informe o primeiro número: ");
        float primeiroNumero = entrada.nextFloat();
        System.out.print("Informe o primeiro número: ");
        float segundoNumero = entrada.nextFloat();
        calcular.somar(primeiroNumero,segundoNumero);
    }
}
