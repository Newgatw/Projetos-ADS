import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    double n1, resultado;
    System.out.println("Insira um número: ");
    Scanner scan = new Scanner(System.in);
    n1 = scan.nextDouble();
    resultado = n1/5;

    System.out.print("A quinta parte do número "+n1+" é igual a: " +resultado);

    }
}