import java.util.Scanner;

public class GasolinaOuAlcool {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("GASOLINA OU ÁLCOOL?");
        System.out.println("**************************");
        System.out.print("Preço da gasolina: ");

        double gasolineValue = reader.nextDouble();
        System.out.print("Preço do álcool: ");
        double alcoholValue = reader.nextDouble();

        double gasolineComparison = gasolineValue * 0.7;

        System.out.println("Valor proporcional da gasolina em relação ao álcool é: " + gasolineComparison);
        System.out.println();

        if (gasolineComparison > alcoholValue) {
            System.out.println("No momento é mais vantajoso abastecer com GASOLINA!");
        }
        else {
            System.out.println("No momento é mais vantajoso abastecer com ÁLCOOL!");
        }


    }
}
