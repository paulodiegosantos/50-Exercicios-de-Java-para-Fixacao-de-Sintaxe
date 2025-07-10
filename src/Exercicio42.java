//Crie um método que verifique se um número é primo
import java.util.Scanner;

public class Exercicio42 {
    public void verificarSePrimo(int a){
        if(a==1){
            System.out.println("Os números primos devem ser maior que 1.");
        }else if(a==2){
            System.out.println("O número é primo!");
        }
        else{
            boolean ePrimo = false;
                for(int i = 2; i < a; i++){
                    if(a%i==0){
                        System.out.println("O número não é primo.");
                        break;
                    }else{
                        ePrimo = true;
                    }
                }
                if(ePrimo){
                    System.out.println("O número é primo!");
                }

        }
    };

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Exercicio42 verificador = new Exercicio42();
        System.out.print("Informe o número: ");
        int numero = entrada.nextInt();
        verificador.verificarSePrimo(numero);
    }
}
