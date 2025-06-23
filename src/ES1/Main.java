package ES1;

import ES1.entities.ArraySetting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArraySetting arraySetting = new ArraySetting();

        System.out.println("La lista base è così composta: ");
        arraySetting.stamp();

        while (true) {
            try {
                System.out.print("Inserisci il numero da inserire, 0 per uscire): ");
                int value = scanner.nextInt();

                if (value == 0) {
                    System.out.println("Programma terminato");
                    break;
                }

                System.out.print("Inserisci la posizione per il tuo numero (0-4): ");
                int customPosition = scanner.nextInt();

                if (customPosition < 0 || customPosition > 4) {
                    System.out.println("Posizione non valida; scegli un numero da 0 a 4");
                    logger.error("Posizione scelta non valida: " + customPosition);
                    continue;
                }

                arraySetting.reset(customPosition, value);

                System.out.println("Lista aggiornata:");
                arraySetting.stamp();

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore: " + e.getMessage());
                logger.error("Errore indice array: " + e.getMessage(), e);
            } catch (Exception e) {
                System.out.println("Errore nell'inserimento, riprova");
                logger.error("Tipo di input non valido per l'array", e);
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
