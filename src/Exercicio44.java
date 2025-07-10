//Crie um método que receba um array e retorne o maior número
import java.util.Scanner;

public class Exercicio44 {
    public void verificarMaiorNumero(int[] array){
        int maiorNumero = 0;
        for(int i = 0; i < array.length; i++){
            if(maiorNumero <= array[i]){
                maiorNumero = array[i];
            }
        }
        System.out.println("O maior número no array é [ " + maiorNumero + " ]");
    };

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Exercicio44 metodo = new Exercicio44();
        int[] array = {1, 5, 6, 9, 3, 2};
        metodo.verificarMaiorNumero(array);
    }
}
