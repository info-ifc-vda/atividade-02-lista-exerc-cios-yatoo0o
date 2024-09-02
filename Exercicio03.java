import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vet1 = new int[10];
        int[] vet2 = new int[5];
        int[] vetorResultado1 = new int[5];
        int[] vetorResultado2 = new int[5];
        int indexPar = 0, indexImpar = 0;

        System.out.println("Digite 10 números inteiros para o vetor 1:");
        for (int i = 0; i < vet1.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vet1[i] = sc.nextInt();
        }

        System.out.println("Digite 5 números inteiros para o vetor 2:");
        for (int i = 0; i < vet2.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vet2[i] = sc.nextInt();
        }

        for (int i = 0; i < vet1.length; i++) {
            if (vet1[i] % 2 == 0) { 
                int soma = 0;
                for (int j = 0; j < vet2.length; j++) {
                    soma += vet2[j]; 
                }
                vetorResultado1[indexPar] = vet1[i] + soma; 
                indexPar++;
            } else { 
                int qtdDivisores = 0;
                for (int j = 0; j < vet2.length; j++) {
                    if (vet1[i] % vet2[j] == 0) { 
                        qtdDivisores++;
                    }
                }
                vetorResultado2[indexImpar] = qtdDivisores;
                indexImpar++;
            }
        }

        System.out.println("Vetor resultante 1 (pares + soma de vetor 2):");
        for (int i = 0; i < indexPar; i++) {
            System.out.print(vetorResultado1[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor resultante 2 (quantidade de divisores ímpares):");
        for (int i = 0; i < indexImpar; i++) {
            System.out.print(vetorResultado2[i] + " ");
        }

        sc.close();
    }
}
