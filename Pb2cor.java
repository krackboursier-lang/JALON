import java.util.Scanner;

public class Pb2cor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double solde = 3000.0; // Solde initial
        boolean continuer = true;

        System.out.println("Bonjour, vous avez " + solde + "€ dans votre compte.");

        while (continuer && solde > -500) {
            System.out.println("Combien voulez-vous retirer ? (en multiples de 10€)");
            int retrait = scanner.nextInt();

            // Vérifier si le montant est un multiple de 10
            if (retrait % 10 != 0) {
                System.out.println("Erreur : vous ne pouvez retirer qu'en multiples de 10€.");
                continue;
            }

            // Vérifier si le retrait dépasse le découvert autorisé
            if (solde - retrait < -500) {
                System.out.println("Erreur : vous ne pouvez pas dépasser un découvert de -500€.");
                continue;
            }

            // Effectuer le retrait
            solde -= retrait;
            System.out.println(retrait + "€ a été retiré de votre compte, il vous reste " + solde + "€");

            // Demander si l'utilisateur souhaite continuer
            System.out.println("Souhaitez-vous retirer à nouveau ? (true/false)");
            continuer = scanner.nextBoolean();
        }

        System.out.println("Merci pour votre visite, bonne journée. Au revoir !");
        scanner.close();
    }
}

