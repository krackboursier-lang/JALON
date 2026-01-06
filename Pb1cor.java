import java.util.Scanner;

public class Pb1cor {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir les valeurs de A, B et C
        System.out.println("Veuillez entrer la valeur de A (true/false) :");
        boolean A = scanner.nextBoolean();

        System.out.println("Veuillez entrer la valeur de B (true/false) :");
        boolean B = scanner.nextBoolean();

        System.out.println("Veuillez entrer la valeur de C (true/false) :");
        boolean C = scanner.nextBoolean();

        // Évaluer l'expression booléenne : A OU (B ET NON C)
        boolean resultat = A || (B && !C);

        // Afficher le résultat
        System.out.println("Le résultat de l'expression A || (B && !C) est : " + resultat);

        // Fermer le Scanner
        scanner.close();
    }
}
