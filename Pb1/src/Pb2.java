
import java.util.Scanner;

public class Pb2 { 


    public static void main(String[] args) { 

          int solde = 3000;

          int retrait; 

          Scanner clavier = new Scanner(System.in);  

          System.out.println("Bonjour,vous avez 3000 euros dans votre compte, combien voulez-vous retirer ?"); 
          
          retrait = clavier.nextInt(); 

          if(retrait > 3500){

           
          System.out.println("Plafond atteind, droit insuffissant !"); 
           

          }else{

            solde -= retrait;

            System.out.println("500 euros a été retiré de votre compte, il vous reste "+solde+" euros"); 
            System.out.println("Souhaitez vous retirer a nouveau ?");
            System.out.println("false"); 
            System.err.println( "Merci pour votre visite, bonne journée au revoir !");
          }

          clavier.close();

    }

}
