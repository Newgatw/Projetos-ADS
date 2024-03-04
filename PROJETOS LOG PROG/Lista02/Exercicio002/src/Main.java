import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        double varia01, varia02;

        System.out.print("Informe o primeiro número:");
        Scanner numero01 = new Scanner(System.in);
        varia01 = numero01.nextDouble();

        System.out.print("Informe o segundo número:");
        Scanner numero02 = new Scanner(System.in);
        varia02 = numero02.nextDouble();

        if (varia01 > varia02){

            System.out.print("O numero "+ varia01 + " é maior que "+ varia02);
        }

        else if (varia02 > varia01){
            System.out.print("O numero "+ varia02 + " é maior que "+ varia01);
        }

        else{
            System.out.print("VALOR INVÁLIDO!");
        }
    }
}