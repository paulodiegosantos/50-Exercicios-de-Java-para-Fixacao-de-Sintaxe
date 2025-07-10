//Pule números múltiplos de 3 entre 1 e 30 (`continue`).

public class Exercicio30 {
    public static void main(String[] args) {
        for(int i = 1; i < 31; i++){
            if(i%3==0){
                continue;
            }else{
                System.out.println(i);
            }
        }

    }
}