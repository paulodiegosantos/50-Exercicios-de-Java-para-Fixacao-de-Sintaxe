//Faça a soma dos 100 primeiros números naturais.

public class Exercicio24 {
    public static void main(String[] args) {
        int somaNumeros = 0;
        for(int n = 1; n <= 100; n++){
            somaNumeros += n;
        }
        System.out.println("A soma dos números naturais de 1 a 100 é " + somaNumeros);

    }
}