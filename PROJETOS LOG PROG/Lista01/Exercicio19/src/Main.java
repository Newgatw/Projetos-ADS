import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a,b,c,delta;

        System.out.println("Vamos solucionar uma equação de segundo grau: ");
        System.out.print("Insira, primeiramente, o valor de a: ");
        a = scan.nextDouble();
        System.out.print("Agora, insira o valor de b: ");
        b = scan.nextDouble();
        System.out.print("Por último, insira o valor de c: ");
        c = scan.nextDouble();

        delta = Math.pow(b,2) -4*(a*c);

        System.out.println(delta);





    }
}