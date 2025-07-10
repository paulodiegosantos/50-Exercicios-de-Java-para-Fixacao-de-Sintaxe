//Calcule a média de 5 notas armazenadas em um array.

public class Exercicio32 {
    public static void main(String[] args) {
        double[] notas = {10, 8.5, 7, 5, 6};
        double somaNotas = 0;
        for(int i = 0; i < 5; i++){
            somaNotas += notas[i];
        }
        double mediaNotas = somaNotas / 5;
        System.out.print("Media das notas é " + mediaNotas);
    }
}