import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a,b;

        System.out.println("Vamos realizar uma equação de primeiro grau:");
        System.out.print("Primeiramente, insira o valor de a: ");
        a = scan.nextDouble();

        System.out.print("Agora, insira o valor de b: ");
        b = scan.nextDouble();

        b = b*-1;

        System.out.println("O resultado dessa equação é: "+b/a);

    }
}