package allFunctions.orangeMoney;

import java.util.Scanner;

public class Forfaits {
    private final Scanner scanner = new Scanner(System.in);
    private final InvalidChoice invalidChoice = new InvalidChoice();

    public void AcheterForfait() {
        while (true) {
            System.out.println("\n ACHAT DE FORFAIT \n" +
                    "1 Forfait 1: 1000 Ar - 500 Mo \n" +
                    "2 Forfait 2: 2000 Ar - 1 Go \n" +
                    "3 Forfait 3: 3000 Ar - 2 Go \n" +
                    "* Retour");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> ConfirmerAchat("Forfait 1: 1000 Ar - 500 Mo");
                case "2" -> ConfirmerAchat("Forfait 2: 2000 Ar - 1 Go");
                case "3" -> ConfirmerAchat("Forfait 3: 3000 Ar - 2 Go");
                case "*" -> {
                    return;
                }
                default -> invalidChoice.InvalidChoicePrint();
            }
        }
    }

    private void ConfirmerAchat(String forfait) {
        while (true) {
            System.out.println("\n CONFIRMATION \n" +
                    "1 Confirmer l'achat de " + forfait + "\n" +
                    "2 Annuler");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> {
                    System.out.println("Achat confirmé pour " + forfait);
                    return;
                }
                case "2" -> {
                    System.out.println("Achat annulé.");
                    return;
                }
                default -> invalidChoice.InvalidChoicePrint();
            }
        }
    }
}
