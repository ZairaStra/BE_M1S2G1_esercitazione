package ES2;

import ES2.entities.CalcConsume;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {

                // int
                System.out.print("Inserisci i km percorsi, 0 per uscire: ");
                int kmRun = scanner.nextInt();
                if (kmRun == 0) {
                    System.out.println("Programma terminato.");
                    break;
                }

                System.out.print("Inserisci i litri consumati: ");
                int fuelConsume = scanner.nextInt();

                CalcConsume calcInt = new CalcConsume(kmRun, fuelConsume);
                int consume = kmRun / fuelConsume;

                System.out.println("Consumo: " + consume + " km/litro");

                // double
//                System.out.print("Inserisci i km percorsi, 0 per uscire: ");
//                double kmRun = scanner.nextDouble();
//                if (kmRun == 0) {
//                    System.out.println("Programma terminato.");
//                    break;
//                }
//
//                System.out.print("Inserisci i litri consumati: ");
//                double fuelConsume = scanner.nextDouble();
//
//                CalcConsume calc = new CalcConsume(kmRun, fuelConsume);
//                double consume = calc.kmPerLiter();
//
//                System.out.println("Consumo: " + consume + " km/litro");

            } catch (ArithmeticException e) {
                System.out.println("Errore: " + e.getMessage());
                logger.error("Divisione per zero: " + e.getMessage(), e);
            } catch (Exception e) {
                System.out.println("Errore di input, inserisci un valore numerico valido");
                logger.error("Tipo di input errato", e);
                scanner.nextLine();
            }
        }

        scanner.close();
        logger.info("Programma terminato.");
    }
}
