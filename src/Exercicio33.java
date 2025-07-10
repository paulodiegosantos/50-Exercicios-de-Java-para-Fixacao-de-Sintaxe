//Leia 5 nomes em um array de `String` e exiba todos.
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];
        for(int i = 1; i <= 5; i++){
            System.out.print("Informe o [ " + i + " ] nome: ");
            nomes[i] = entrada.next();
        }
        System.out.print("Nomes no array: ");
        for(int i = 0; i < 5; i++){
            if(i == 4){
                System.out.print(nomes[i]);
            }else{
                System.out.print(nomes[i] + ", ");
            }
        }

    }
}