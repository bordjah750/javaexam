import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataManager dataManager = new DataManager();
        Gui gui = new Gui(dataManager);

        while (true) {
            System.out.println("1. Ajouter une personne");
            System.out.println("2. Supprimer une personne");
            System.out.println("3. Modifier les informations d'une personne");
            System.out.println("4. Afficher les informations d'un groupe");
            System.out.println("5. Quitter");

            int choice = input.nextInt();
            input.nextLine(); // clear the input buffer

            if (choice == 1) {
                System.out.println("Choisissez un groupe :");
                System.out.println("1. Etudiant");
                System.out.println("2. Professeur");
                System.out.println("3. Prospect");
                System.out.println("4. Secretary");

                int groupChoice = input.nextInt();
                input.nextLine(); // clear the input buffer

                if (groupChoice == 1) {
                    System.out.println("Ajouter un etudiant :");
                    System.out.print("Nom : ");
                    String nom = input.nextLine();
                    System.out.print("Age : ");
                    int age = input.nextInt();
                    input.nextLine(); // clear the input buffer
                    System.out.print("Genre : ");
                    String genre = input.nextLine();
                    System.out.print("Numero Etudiant : ");
                    String numEtudiant = input.nextLine();
                    System.out.print("Adresse : ");
                    String adresse = input.nextLine();
                    System.out.print("Departement : ");
                    String departement = input.nextLine();
                    System.out.print("Mail : ");
                    String mail = input.nextLine();
                    System.out.print("Telephone : ");
                    String telephone = input.nextLine();
                    System.out.print("Moyenne : ");
                    double moyenne = input.nextDouble();
                    input.nextLine(); // clear the input buffer
                    System.out.print("Langues parlees (separees par des virgules) : ");
                    String langues = input.nextLine();
                    System.out.print("Diplomes (separees par des virgules) : ");
                    String diplomes = input.nextLine();
                    System.out.print("Projets (separees par des virgules) : ");
                    String projets = input.nextLine();
                    System.out.print("Statut : ");
                    String statut = input.nextLine();
                    System.out.print("Competences (separees par des virgules) : ");
                    String competences = input.nextLine();
                    System.out.print("Domaine d'etude : ");
                    String domaineEtude = input.nextLine();
                    System.out.print("Hobbies (separees par des virgules) : ");
                    String hobbies = input.nextLine();
                    System.out.print("Publications (separees par des virgules) : ");
                    String publications = input.nextLine();

                    // créer un nouvel étudiant avec les informations entrées et l'ajouter à la liste
                    Etudiant etudiant = new Etudiant(nom, age, genre, numEtudiant, adresse, departement, mail,
                            telephone, moyenne, langues, diplomes, projets, statut, competences, domaineEtude,
                            hobbies, publications);
                    dataManager.addPerson(etudiant);
                } else if (groupChoice == 2) {
                    System.out.println("Ajouter un professeur :");
                    System.out.print("Nom : ");
                    String nom = input.nextLine();
                    System.out.print("Age : ");
                    int age = input.nextInt();
                    input.nextLine();
                }}}}}