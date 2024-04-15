import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int somaIdades = 0;
        int contador = 0;
        int idade;

        System.out.println("Digite as idades (digite 0 para terminar):");

        do {
            idade = input.nextInt();

            if (idade != 0) {
                somaIdades += idade;
                contador++;
            }
        } while (idade != 0);

        
        if (contador > 0) {
            double media = (double) somaIdades / contador;
            System.out.println("A média das idade é: " + media);
        } else {
            System.out.println("Nenhuma idade foi digitada.");
        }

        input.close();
    }
}
