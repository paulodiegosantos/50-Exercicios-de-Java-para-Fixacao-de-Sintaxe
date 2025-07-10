//Compare duas `String` com `equals()` e `==`.
import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a primeira string: ");
        String primeiraString = entrada.next();
        System.out.print("Digite a segunda string: ");
        String segundaString = entrada.next();
        if (primeiraString.equals(segundaString)){
            System.out.println("O texto das duas strings são iguais");
        }else{
            System.out.println("O texto das duas strings não são iguais");
        }
        if(primeiraString == segundaString){
            System.out.println("A referência das duas strings são iguais");
        }else{
            System.out.println("A referência das duas strings não são iguais");
        }
    }
}