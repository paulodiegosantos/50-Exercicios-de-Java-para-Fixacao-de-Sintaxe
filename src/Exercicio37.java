//Crie um array bidimensional (matriz 3x3) e preencha com números.
import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int contador = 1;
        for (int i = 0; i < matriz.length; i++){
            for (int y = 0; y < matriz.length; y++){
                matriz[i][y] = contador;
                contador++;
            }
        }
        for (int i = 0; i < matriz.length; i++){
            System.out.print((i+1) + " - ");
            for (int y = 0; y < matriz.length; y++){
                System.out.print(matriz[i][y] + " ");
            }
            System.out.println();
        }
    }
}