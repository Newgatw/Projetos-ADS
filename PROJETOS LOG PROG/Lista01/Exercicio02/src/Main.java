import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, result;

        System.out.print("Por favor, digite um número: ");
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextInt();
        result = (int) Math.pow(n1,2);

        System.out.println("O quadrado do número "+n1+" é " +result);

    }
}