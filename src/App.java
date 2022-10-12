import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("J'aime la Pologne");
        int i = 2;
        while (i==2){
            Scanner sc= new Scanner(System.in); // Création d'un système pour récupérer l'input utilisateur
            System.out.print("Ecris un truc enculé : ");
            String str = sc.nextLine(); // Récupération de l'input
            System.out.println(str);
        }

        
    }
}