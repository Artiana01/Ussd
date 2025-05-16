package org.example.allFunctions.orangeMoney;



import org.example.allFunctions.InvalidChoice;
import org.example.allFunctions.scanner.UssdStructure;

import java.util.Scanner;

public class OrangeMoneyStructure {
    private final Scanner scanner = new Scanner(System.in);
    private final InvalidChoice invalidChoice = new InvalidChoice();
    private final Forfaits forfaits = new Forfaits();
    private UssdStructure ussdStructure;

    public void setUssdStructure(UssdStructure ussdStructure) {
        this.ussdStructure = ussdStructure;
    }

    public void OrangeMoney() {
        while (true) {
            System.out.println("\n ORANGE MONEY \n" +
                    "1 Acheter Forfait \n" +
                    "2 Retrait d'argent \n" +
                    "3 Transférer de l'argent \n" +
                    "# Page suivante");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> forfaits.AcheterForfait();
                case "2" -> System.out.println("RetraitArgent()");
                case "3" -> System.out.println("TransfererArgent()");
                case "#" -> PageSuivante();
                default -> invalidChoice.InvalidChoice();
            }
        }
    }

    public void PageSuivante() {
        while (true) {
            System.out.println(
                    "\n ORANGE MONEY \n" +
                            "4 Mon compte \n" +
                            "5 Historique des transactions \n" +
                            "* Page precedente \n" +
                            "** Menu principal");
            String choice = scanner.nextLine();
            switch (choice) {
                case "4" -> System.out.println("MonCompte()");
                case "5" -> System.out.println("HistoriqueTransactions()");
                case "*" -> OrangeMoney();
                case "**" -> ussdStructure.Demarrer();
                default -> invalidChoice.InvalidChoice();
            }
        }
    }
}
