//Some todos os números ímpares entre 1 e 50.

public class Exercicio28 {
    public static void main(String[] args) {
        int soma = 0;
        for(int i = 1; i <= 50; i += 2){
            soma += i;
        }
        System.out.println("Soma: " + soma);
    }
}