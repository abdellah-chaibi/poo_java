public class Main {
    public static void main(String[] args) {
        // 1. Création de quelques étudiants
        // Constructeur : Etudiant(int numeroEtudiant, double[] notes, String nom, String prenom, int age)
        Etudiant e1 = new Etudiant(101, new double[]{14.5, 12.0, 16.0}, "Dupont", "Jean", 20);
        Etudiant e2 = new Etudiant(102, new double[]{10.0, 9.5, 11.0}, "Martin", "Sophie", 22);
        Etudiant e3 = new Etudiant(103, new double[]{17.0, 18.5, 16.0}, "Bernard", "Lucas", 19);

        // 2. Test du gestionnaire d'étudiants (GestionEtudiants)
        GestionEtudiants gestion = new GestionEtudiants();
        
        System.out.println("--- AJOUT DES ÉTUDIANTS ---");
        gestion.ajouter(e1);
        gestion.ajouter(e2);
        gestion.ajouter(e3);

        System.out.println("\n--- AFFICHAGE DE TOUS LES ÉTUDIANTS ---");
        gestion.afficherTous();

        System.out.println("--- MOYENNE GÉNÉRALE ---");
        gestion.afficherMoyenneGenerale();

        // 3. Test de suppression d'un étudiant
        System.out.println("\n--- SUPPRESSION D'UN ÉTUDIANT ---");
        gestion.supprimer(e2);

        System.out.println("\n--- AFFICHAGE APRÈS SUPPRESSION ---");
        gestion.afficherTous();
        gestion.afficherMoyenneGenerale();

        // 4. Test de la classe Professeur
        // Constructeur : Professeur(String nom, String prenom, int age, String matiere, double salaire)
        System.out.println("\n--- TEST DE LA CLASSE PROFESSEUR ---");
        Professeur p1 = new Professeur("Durand", "Michel", 45, "Informatique (Java)", 3200.50);
        p1.Afficher();
    }
}