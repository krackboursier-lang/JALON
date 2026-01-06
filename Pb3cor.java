import java.util.Scanner;

public class Pb3cor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur combien de fois il veut compter en puissance de 2
        System.out.println("Combien de fois voulez-vous compter en puissance de 2 ?");
        int n = scanner.nextInt();

        // Afficher les résultats des calculs
        System.out.println("Résultats des calculs :");
        for (int i = 0; i <= n; i++) {
            double puissance = Math.pow(2, i);
            System.out.println("2 puissance " + i + " = " + (int)puissance);
        }

        scanner.close();
    }
}

