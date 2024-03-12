import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int n1;

        System.out.print("Por favor, insira um número: ");
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextInt();

        System.out.print("O dobro do número "+n1+" é: "+(n1*2));


    }
}