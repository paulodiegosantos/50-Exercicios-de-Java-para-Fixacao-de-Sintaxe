//Verifique se um ano é bissexto.
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o ano: ");
        int ano = entrada.nextInt();
        boolean bissexto;
        //Verifica se um ano é bissexto.
        if(ano%4==0){
            if(ano%100==0){
                if(ano%400==0){
                    bissexto = true;
                }else{
                    bissexto = false;
                }
            }else{
                bissexto = true;
            }
        }else{
            bissexto = false;
        }

        if(bissexto){
            System.out.println("O ano " + ano + " é bissexto.");
        }else{
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
}