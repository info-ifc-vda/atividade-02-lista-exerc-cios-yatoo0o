import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] naoComuns = new int[20];
        int indiceNaoComuns = 0;

        System.out.println("Digite os 10 numeros do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = sc.nextInt();
        }

        System.out.println("Digite os 10 numeros do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            boolean comum = false;
            for (int j = 0; j < 10; j++) {
                if (vetor1[i] == vetor2[j]) {
                    comum = true;
                    break;
                }
            }
            if (!comum) {
                naoComuns[indiceNaoComuns++] = vetor1[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            boolean comum = false;
            for (int j = 0; j < 10; j++) {
                if (vetor2[i] == vetor1[j]) {
                    comum = true;
                    break;
                }
            }
            if (!comum) {
                naoComuns[indiceNaoComuns++] = vetor2[i];
            }
        }

        System.out.println("Numeros nao comuns entre os vetores:");
        for (int i = 0; i < indiceNaoComuns; i++) {
            System.out.print(naoComuns[i] + " ");
        }

        sc.close();
    }
}
