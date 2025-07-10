//Peça dois números e verifique se são múltiplos.
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        int primeiroNumero = entrada.nextInt();
        System.out.print("Informe o segundo número: ");
        int segundoNumero = entrada.nextInt();
        if(primeiroNumero<segundoNumero){
            if(segundoNumero%primeiroNumero == 0){
                System.out.println("Os número são múltiplos");
            }else{
                System.out.println("Os número não são múltiplos");
            }
        }else{
            if(primeiroNumero%segundoNumero == 0){
                System.out.println("Os número são múltiplos");
            }else{
                System.out.println("Os número não são múltiplos");
            }
        }
    }
}