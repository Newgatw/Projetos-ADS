import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double din,troco;
        int ped;

        System.out.print("Insira o dinheiro:\nR$");
        din = scan.nextInt();

        if (din >=0.5){

            System.out.println("Menu.\n1- Café Expresso (R$0,50)\n2- Café Longo (R$1,00)\n3- Cappucino (R$2,50)\n4- Chocolate(2,00)");
            ped = scan.nextInt();

            if (ped >0 && ped <=4){

                switch (ped){

                    case 1:
                        troco = (din-0.5);

                        System.out.println("Bebida selecionada: Café Expresso\nTroco: R$"+troco);
                        break;

                    case 2:
                        troco = (din-1);

                        System.out.println("Bebida selecionada: Café Longo\nTroco: R$"+troco);
                        break;

                    case 3:
                        troco = (din-2.5);

                        System.out.println("Bebida selecionada: Cappucino\nTroco: R$"+troco);
                        break;

                    default:
                        troco = (din-2);

                        System.out.println("Bebida selecionada: Chocolate\nTroco: R$"+troco);
                        break;

                }

            }
            else
                System.out.print("Opção inválida!");
        }
        else
            System.out.print("Valor inválido!");
    }
}