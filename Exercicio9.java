import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        double soma = 1000, somaMais = 0, somaMenos = 0;

        for(int i = 1; i <= 50; i++){
            double cima = 1000, baixo = i;
            if (i % 2 == 0) {
                somaMenos += (cima - 3) / (baixo + 1);
            } else{
                somaMais -= (cima - 3) / (baixo + 1);
            }
            soma = somaMais + somaMenos;
        }
        System.out.printf("A soma é: %.2f", soma);
    }
    
}
