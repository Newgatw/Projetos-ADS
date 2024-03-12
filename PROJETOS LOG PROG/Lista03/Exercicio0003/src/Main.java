//Criar um algoritmo que exiba todos os números positivos divisíveis por 4 e menores que 200.
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        System.out.println("Os números divisíveis por 4, de 0 a 200, são: ");

        for (int i=0; i<201;i++)
            if (i%4==0) {
                System.out.println(i);
            }

    }
}