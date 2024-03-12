public class Main {
    public static void main(String[] args) {

        System.out.println("Tabela de Conversão de Celsius para Fahrenheit:");

        for (int celsius = -80; celsius<81; celsius+=10) {

            double fahrenheit = (9.0/5.0)*celsius+32;

            System.out.println(celsius+"ºC = "+fahrenheit+" ºF");
        }
    }
}
