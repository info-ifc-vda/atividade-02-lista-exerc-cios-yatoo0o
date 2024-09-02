import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        double num;

        while (true) {
            System.out.println("Digite um numero para ser guardado: (0 ou negativo para finalizar)");
            num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            numeros.add(num);
        }

        System.out.println("\nFinalizando entrada de dados...");
        
        System.out.println("NUMERO    CUBO        RAIZ QUADRADA");
        System.out.println("-----------------------------------");

        int linhas = 0;
        for (double numero : numeros) {
            if (linhas % 20 == 0 && linhas != 0) {
                System.out.println("NUMERO    CUBO        RAIZ QUADRADA");
                System.out.println("-----------------------------------");
            }

            double cubo = Math.pow(numero, 3);
            double raizQ = Math.sqrt(numero);

            System.out.println(numero + "       " + cubo + "       " + raizQ);

            linhas++;
        }

        System.out.println("\nPrograma encerrado.");
        sc.close();
    }
}
