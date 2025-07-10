//Faça um menu com `switch` que tenha 3 opções e execute ações distintas.
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Menu\n1 - Diga quanto é 5*5.\n2 - Em qual ano estamos no momento que esse código foi feito?\n3 - Não faça nada e encerre o código.\nDigite o número da opção desejada: ");
        int opcao = entrada.nextInt();
        switch(opcao){
            case 1:
                System.out.println("5*5 = " + 5*5);
                break;
            case 2:
                System.out.println("O ano é 2025.");
                break;
            case 3:
                System.out.println("Código encerrado!");
                break;
            default:
                System.out.println("Você não selecionou uma opção disponível, o código será encerrado. Reinicie o mesmo e tente novamente.");
                break;
        }
    }
}