import java.util.Scanner;

public class Exercicio04 {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        int[] codigoConta = new int[10];
        double[] saldoConta = new double[10];

        System.out.println("##   CADASTRO DE CONTAS   ##");

        for(int i = 0; i < codigoConta.length; i++){
            System.out.println("Digite o codigo da conta: ");
            int codigo = sc.nextInt();

            boolean existe = false;

            for (int j = 0; j < i; j++) {
                if (codigoConta[j] == codigo){
                    existe = true;
                        break;
                }
            }
            if (existe){
                System.out.println("Codigo ja cadastrado, digite um novo");
                i--;
            }
            else {
                codigoConta[i] = codigo;
                System.out.println("Digite o saldo da conta: ");
                saldoConta[i] = sc.nextDouble();
            }
        }
        int op;

        do {
            System.out.println("-----------MENU----------");
            System.out.println("|                       |");
            System.out.println("| 1. EFETUAR DEPOSITO   |");
            System.out.println("| 2. EFETUAR SAQUE      |");
            System.out.println("| 3. ATIVO BANCARIO     |");
            System.out.println("| 4. FINALIZAR PROGRAMA |");
            System.out.println("|                       |");
            System.out.println("|   ESCOLHA UMA OPCAO   |");
            System.out.println("-------------------------");
            op = sc.nextInt();

            switch (op){
                case 1: 
                    System.out.println("Digite o codigo da conta para realizar deposito:");
                
                    int codDeposito = sc.nextInt();
                    int posDeposito = encontrarConta(codigoConta, codDeposito);

                    if (posDeposito != -1){
                    System.out.println("Digite o valor do deposito: ");
                    double valor = sc.nextDouble();
                    saldoConta[posDeposito] += valor;

                    System.out.println("Deposito realizado!");
                    }
                    else{
                        System.out.println("Conta nao encontrada");
                    }
                    break;
                
                case 2:
                    System.out.println("Digite o codigo da conta para saque: ");
                    
                    int codSaque = sc.nextInt();
                    int posSaque = encontrarConta(codigoConta, codSaque);

                    if (posSaque != -1){
                        System.out.println("Digite o valor do saque: ");
                        double valor = sc.nextDouble();

                        if (saldoConta[posSaque] >= valor){
                            saldoConta[posSaque] -= valor;

                            System.out.println("Saque realizado!");
                        }
                        else {
                            System.out.println("Saldo invalido!!!");
                        }
                    }
                    else {
                        System.out.println("Conta invalida");
                    }
                    break;

                case 3: 
                    double ativoBanco = 0;

                    for(double saldo : saldoConta){
                        ativoBanco += saldo;
                    }
                    System.out.println("Total do ATIVO BANCARIO e R$ " + ativoBanco);
                    break;
                
                case 4:
                    System.out.println("Finalizando...");
                    break;
                
                default:
                    System.out.println("OPCAO INVALIDA!!!!");
                    break;
            }
        }
        while (op != 4);

        sc.close();
    }
    private static int encontrarConta(int [] codigoConta, int codigo){
        for (int i = 0; i < codigoConta.length; i++){
            if (codigoConta[i] == codigo){
                return i;
            }
        }
        return -1;
    }
}


