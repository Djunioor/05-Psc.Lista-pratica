import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double soma = 0, n;

        System.out.print("Digite o número de vezes que a sequência irá rodar: ");
        n = input.nextInt();

        for(double i = 1; i <= n; i++){
            soma += 1/i;
        }
        System.out.print("A soma da sequência é: " + soma);

        input.close();
    }
}
