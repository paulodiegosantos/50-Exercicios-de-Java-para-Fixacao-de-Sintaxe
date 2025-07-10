//Inverta a ordem de um array.

public class Exercicio34 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 7, 10};
        int[] arrayInvertido = new int[array.length];
        System.out.print("Array invertido: ");
        for(int i = 0; i < array.length; i++){
            arrayInvertido[i] = array[array.length - 1 - i];
            System.out.print(arrayInvertido[i] + " ");
        }
    }
}