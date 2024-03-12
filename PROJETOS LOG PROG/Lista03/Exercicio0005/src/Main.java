import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Insira um número a fim de calcular o seu fatorial: ");
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();

        if (n>0) {
            long f = 1;
            for (int i=1; i<=n; i++)

                f*=i;

            System.out.println("O fatorial de "+n+" é: "+f);

        }else System.out.println("Por favor, insira um número positivo.");

    }
}