//Verifique se um nome digitado está presente no array.
import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[2];
        for (int i = 0; i < nomes.length; i++){
            System.out.print("Digite o nome [" + (i+1) + "]: ");
            nomes[i] = entrada.next().toLowerCase();
        }
        System.out.print("Digite o nome que deseja procurar: ");
        String nomeParaProcurar = entrada.next().toLowerCase();
        for (int i = 0; i < nomes.length; i++){
            if (nomeParaProcurar.equals(nomes[i])){
                System.out.println("Nome consta no array!");
                break;
            }else if(i == nomes.length - 1){
                System.out.println("Nome não encontrado no array!");
            }
        }
    }
}