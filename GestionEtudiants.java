import java.util.ArrayList;
import java.util.Arrays;

// Interface
 interface Affichable {
    void Afficher();
}

// Classe abstraite Personne
abstract class Personne implements Affichable {
    protected String nom;
    protected String prenom;
    protected int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    @Override
    public void Afficher() {
        System.out.println("Nom : " + nom + "\n" +
                "Prénom : " + prenom + "\n" +
                "Âge : " + age);
    }
}

// Classe Etudiant
class Etudiant extends Personne {
    protected int numeroEtudiant;
    protected double[] notes;

    public Etudiant(int numeroEtudiant, double[] notes, String nom, String prenom, int age) {
        super(nom, prenom, age);
        this.numeroEtudiant = numeroEtudiant;
        this.notes = notes;
    }

    public double calculerMoyenne() {
        return Arrays.stream(notes).average().orElse(0.0);
    }

    @Override
    public void Afficher() {
        super.Afficher();
        System.out.println("Numéro étudiant : " + numeroEtudiant);
        System.out.println("Notes : " + Arrays.toString(notes));
        System.out.println("Moyenne : " + calculerMoyenne());
    }
}

// Classe Professeur
class Professeur extends Personne {
    protected String matiere;
    protected double salaire;

    public Professeur(String nom, String prenom, int age, String matiere, double salaire) {
        super(nom, prenom, age);
        this.matiere = matiere;
        this.salaire = salaire;
    }

    @Override
    public void Afficher() {
        super.Afficher();
        System.out.println("Matière : " + matiere);
        System.out.println("Salaire : " + salaire);
    }
}

// Classe GestionEtudiants
class GestionEtudiants {
    private ArrayList<Etudiant> etudiants = new ArrayList<>();

    public void ajouter(Etudiant e) {
        etudiants.add(e);
        System.out.println("Étudiant ajouté : " + e.nom);
    }

    public void supprimer(Etudiant e) {
        etudiants.remove(e);
        System.out.println("Étudiant supprimé : " + e.nom);
    }

    public void afficherMoyenneGenerale() {
        double moyenneGenerale = etudiants.stream()
                .mapToDouble(Etudiant::calculerMoyenne)
                .average().orElse(0.0);
        System.out.println("Moyenne générale des étudiants : " + moyenneGenerale);
    }

    public void afficherTous() {
        for (Etudiant e : etudiants) {
            e.Afficher();
            System.out.println("-------------------");
        }
    }
}




