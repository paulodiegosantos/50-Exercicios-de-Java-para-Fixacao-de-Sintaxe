//Faça um método que inverta uma `String`.
import java.util.Scanner;

public class Exercicio45 {
    public void inverterString(String texto){
        String textoInvertido = "";
        for(int i = 0; i < texto.length(); i++){
            textoInvertido += texto.charAt((texto.length() - 1 - i));
        }
        System.out.println("O texto invertido é: " + textoInvertido);
    };

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Exercicio45 metodo = new Exercicio45();
        System.out.print("Informe um texto: ");
        String texto = entrada.next();
        metodo.inverterString(texto);
    }
}
