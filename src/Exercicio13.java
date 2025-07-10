//Use `else if` para classificar uma nota (0–10) como ruim, boa ou excelente.
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe sua nota: ");
        float nota = entrada.nextFloat();
        String situacaoNota;
        if(nota < 6){
            situacaoNota = "Ruim";
        }else if(nota >= 6 && nota <= 8){
            situacaoNota = "Boa";
        }else{
            situacaoNota = "Excelente";
        }
        System.out.println("Sua nota foi " + nota + " e foi categorizada como [ " + situacaoNota + " ]");
    }
}