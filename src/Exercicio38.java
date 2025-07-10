//Some os valores da diagonal principal da matriz 3x3.
import java.util.Scanner;

public class Exercicio38 {
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
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++){
            System.out.print((i+1) + " - ");
            for (int y = 0; y < matriz.length; y++){
                System.out.print(matriz[i][y] + " ");
                if(i == y){
                    somaDiagonalPrincipal += matriz[i][y];
                }
            }
            System.out.println();
        }
        System.out.println("A soma da diagonal principal é " + somaDiagonalPrincipal);
    }
}