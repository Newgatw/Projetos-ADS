import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor;
        int op;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o valor da compra:");
        valor = in.nextInt();
        System.out.println("\n\nMenu:\n1. Debito\n2. Pix\n3. Credito");
        System.out.println("\n\nEscolha a forma de pagamento:");
        op = in.nextInt();

        switch (op){
            case 1:
                System.out.println("O valor total de sua compra é de " + (valor-valor*0.05));
                break;
            case 2:
                System.out.println("O valor total de sua compra é de " + (valor-valor*0.1));
                break;
            case 3:
                int p;
                System.out.println("Em quantas vezes gostaria de parcelar sua compra?");
                p = in.nextInt();
                if(p<=4)
                    System.out.println("O valor total de sua compra é de " + (valor+valor*0.02));
                else
                    System.out.println("O valor total de sua compra é de " + (valor+valor*0.05));
                break;
            default:
                System.out.println("Opção inválida. Por favor, selecione uma opção disponível.");
        }
    }
}