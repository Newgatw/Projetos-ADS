import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Informe a primeira nota: ");
        Scanner n1 = new Scanner(System.in);
        double media1 = n1.nextDouble();

        System.out.print("Informe a segunda nota: ");
        Scanner n2 = new Scanner(System.in);
        double media2 = n2.nextDouble();

        double mediaComp = media1 + media2;
        double mediaFinal = mediaComp /2;

        System.out.print("A média entre as notas informadas é: "+mediaFinal+" - ");

        if (mediaFinal > 50){

            System.out.print("APROVADO");

        }

        else {
            System.out.print("REPROVADO!");
        }

    }
}