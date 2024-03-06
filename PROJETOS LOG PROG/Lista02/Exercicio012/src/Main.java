import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double n1,n2;
        int op;

        System.out.print("Digite um número: ");
        n1 = scan.nextDouble();

        System.out.print("Digite outro número: ");
        n2 = scan.nextDouble();

        System.out.println("Selecione uma operação.\n1- Soma.\n2- Subtração.\n3- Multiplicação.\n4- Divisão.");
        op = scan.nextInt();
        if (op >0 && op <5) {

            switch (op) {

                case 1:
                    System.out.println("O resultado da sua operação é: "+(n1+n2));
                    break;

                case 2:
                    System.out.println("O resultado da sua operação é: "+(n1-n2));
                    break;

                case 3:
                    System.out.println("O resultado da sua operação é: "+(n1*n2));
                    break;

                case 4:
                    if (n2 != 0) {
                        System.out.println("O resultado da sua operação é: " + (n1/n2));
                        break;
                    }
                    else
                        System.out.println("Não é possível dividir por 0.");

                default:
                    System.out.println("Operação inválida!");

            }
        }

        else
            System.out.println("Operação inválida!");
    }
}