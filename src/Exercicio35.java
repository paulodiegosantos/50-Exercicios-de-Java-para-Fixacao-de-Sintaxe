//Conte quantos elementos pares existem em um array.
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] array = {1, 2, 5, 7, 9, 13, 45, 60, 80};
        int quantidadeParesArray = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]%2 == 0){
                quantidadeParesArray++;
            }
        }
        System.out.print("A quantidade de números pares entre os salvos no array é " + quantidadeParesArray);
    }
}