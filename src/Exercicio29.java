//Interrompa um laço quando o número 7 for digitado (`break`).

public class Exercicio29 {
    public static void main(String[] args) {
        int contador = 1;
        while(true){
            if(contador < 8){
                System.out.println("Contagem: " + contador);
                contador++;
            }else{
                System.out.println("Contagem encerrada!");
                break;
            }
        }

    }
}