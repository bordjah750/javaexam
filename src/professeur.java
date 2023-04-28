public class Professeur extends Person {
    private String matiereEnseignee;
    private int anneesExperience;
    private ArrayList<Etudiant> listeEtudiants;

    public Professeur(String nom, int age, String genre, String adresse, String email, String telephone, String matiereEnseignee, int anneesExperience) {
        super(name, age, gender, address, email, phoneNumber);
        this.matiereEnseignee = matiereEnseignee;
        this.anneesExperience = anneesExperience;
        this.listeEtudiants = new ArrayList<Etudiant>();
    }

    public Professeur(String nom, int age, String genre, String adresse, String email, String telephone) {
        super(nom, age, genre, adresse, email, telephone);
        this.matiereEnseignee = "Inconnue";
        this.anneesExperience = 0;
        this.listeEtudiants = new ArrayList<Etudiant>();
    }

    public String getMatiereEnseignee() {
        return matiereEnseignee;
    }

    public void setMatiereEnseignee(String matiereEnseignee) {
        this.matiereEnseignee = matiereEnseignee;
    }

    public int getAnneesExperience() {
        return anneesExperience;
    }

    public void setAnneesExperience(int anneesExperience) {
        this.anneesExperience = anneesExperience;
    }

    public ArrayList<Etudiant> getListeEtudiants() {
        return listeEtudiants;
    }

    public void setListeEtudiants(ArrayList<Etudiant> listeEtudiants) {
        this.listeEtudiants = listeEtudiants;
    }

    public void ajouterEtudiant(Etudiant e) {
        listeEtudiants.add(e);
    }

    public void supprimerEtudiant(Etudiant e) {
        listeEtudiants.remove(e);
    }

    public void modifierEtudiant(Etudiant e, String nouveauNom, int nouvelAge, String nouveauGenre, String nouvelleAdresse, String nouvelEmail, String nouveauTelephone, String nouvelleMatiere, int nouvellesAnneesExp) {
        e.setNom(nouveauNom);
        e.setAge(nouvelAge);
        e.setGenre(nouveauGenre);
        e.setAdresse(nouvelleAdresse);
        e.setEmail(nouvelEmail);
        e.setTelephone(nouveauTelephone);
        e.setMatiereEtudiee(nouvelleMatiere);
        e.setAnneesEtudees(nouvellesAnneesExp);
    }

    public String toString() {
        return "Nom : " + getNom() + "\n" +
                "Age : " + getAge() + "\n" +
                "Genre : " + getGenre() + "\n" +
                "Adresse : " + getAdresse() + "\n" +
                "Email : " + getEmail() + "\n" +
                "Téléphone : " + getTelephone() + "\n" +
                "Matière enseignée : " + matiereEnseignee + "\n" +
                "Nombre d'années d'expérience : " + anneesExperience + "\n" +
                "Liste des étudiants encadrés : " + listeEtudiants.student();
    }
}

