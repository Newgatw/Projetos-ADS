import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Insira sua primeira nota: ");
        Scanner n1 = new Scanner(System.in);
        double m1 = n1.nextDouble();

        System.out.print("Agora, insira sua segunda nota: ");
        Scanner n2 = new Scanner(System.in);
        double m2 = n2.nextDouble();

        double mf = (m1+m2) /2;


        if (mf >= 8.5){

            System.out.println("Sua média é A.");

        }

        else if (mf <8.5 && mf >=7){

            System.out.println("Sua média é B.");
        }


        else if(mf <7 && mf >= 5){

            System.out.println("Sua média é C.");
        }

        else if(mf < 5) {

            System.out.println("Sua média é C.");
        }

        else{

            System.out.println("Valor inválido!");
        }
    }
}