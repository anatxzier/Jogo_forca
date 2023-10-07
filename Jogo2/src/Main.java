
import java.util.Random;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        String[] palavras = {"parede", "amor", "janela", "cor"};
        Random sorteio = new Random();
        int palavraSorteada = sorteio.nextInt(palavras.length);
        String rFinal = palavras[palavraSorteada];



        int sair = 0;
        int cont = 0;

        Set<Character> letrascorretas = new HashSet<>();


        while (sair == 0){
            System.out.println(" ");
            System.out.println("Digite uma letra");
            a = scanner.nextLine();
            for (int i = 0; i < rFinal.length(); i++) {
                char letra = rFinal.charAt(i);
                if (letra == a.charAt(0) && !letrascorretas.contains(letra)) {
                    System.out.print(a);
                    cont ++;
                    letrascorretas.add(letra);
                }
                else if (letrascorretas.contains(letra)) {
                    System.out.print(letra);
                }

                else{
                    System.out.print("_");
                    System.out.print(" ");
                }
            }
            if (cont == rFinal.length()){
                System.out.println(" ");
                System.out.println("Acertou!");
                sair = 1;
            }



        }
    }
}