import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Informe sua primeira nota: ");
        Scanner n1 = new Scanner(System.in);
        double media1 = n1.nextDouble();

        System.out.print("Informe sua segunda nota: ");
        Scanner n2 = new Scanner(System.in);
        double media2 = n2.nextDouble();

        double mediaFinal = (media1 + media2) /2;

        System.out.println("A média entre suas notas é: "+mediaFinal);

        if (mediaFinal > 50){
            System.out.print("APROVADO!");
        }

        else {
            System.out.print("Insira sua nota da prova de recuperação: ");
            Scanner mediaNova = new Scanner(System.in);
            double mediaRecuperação = mediaNova.nextDouble();

            double mediaDefinitiva = (mediaFinal+mediaRecuperação) /2;

            if (mediaDefinitiva > 50){
            System.out.println("APROVADO");
        }

            else {

                System.out.println("REPROVADO");

            }
        }

    }
}