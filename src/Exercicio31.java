//Crie um array de 5 inteiros e mostre todos os elementos.
import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        for(int i = 0; i < 5; i++){
            System.out.print(array[i] + " ");
        }
    }
}