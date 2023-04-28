import java.util.ArrayList;

public class Etudiant extends Person {

    // Attributs de classe
    private static int nombreEtudiants = 0;

    // Attributs d'instance
    private int numeroEtudiant;
    private String adresse;
    private String departement;
    private ArrayList<String> listeCours;
    private String mail;
    private String telephone;
    private double moyenne;
    private ArrayList<String> languesParlees;
    private ArrayList<String> diplomes;
    private ArrayList<String> projets;
    private String statut;
    private ArrayList<String> competences;
    private String domaineEtude;
    private ArrayList<String> hobbies;
    private ArrayList<String> publications;

    // Constructeurs
    public Etudiant(String nom, String prenom, int age, char genre, String adresse, String departement, ArrayList<String> listeCours,
                    String mail, String telephone, double moyenne, ArrayList<String> languesParlees, ArrayList<String> diplomes,
                    ArrayList<String> projets, String statut, ArrayList<String> competences, String domaineEtude, ArrayList<String> hobbies,
                    ArrayList<String> publications) {
        super(name, age, gender, address, email, phoneNumber);
        this.numeroEtudiant = ++nombreEtudiants;
        this.adresse = adresse;
        this.departement = departement;
        this.listeCours = listeCours;
        this.mail = mail;
        this.telephone = telephone;
        this.moyenne = moyenne;
        this.languesParlees = languesParlees;
        this.diplomes = diplomes;
        this.projets = projets;
        this.statut = statut;
        this.competences = competences;
        this.domaineEtude = domaineEtude;
        this.hobbies = hobbies;
        this.publications = publications;
    }

    public Etudiant(String nom, String prenom, int age, char genre) {
        this(nom, prenom, age, genre, "", "", new ArrayList<>(), "", "", 0.0, new ArrayList<>(),
                new ArrayList<>(), new ArrayList<>(), "", new ArrayList<>(), "", new ArrayList<>(), new ArrayList<>());
    }

    public Etudiant(String nom, int age, String genre, String numEtudiant, String adresse, String departement, String mail, String telephone, double moyenne, String langues, String diplomes, String projets, String statut, String competences, String domaineEtude, String hobbies, String publications) {
        super(name, age, gender, address, email, phoneNumber);
    }

    // Getters et setters
    public int getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(int numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public ArrayList<String> getListeCours() {
        return listeCours;
    }

    public void setListeCours(ArrayList<String> listeCours) {
        this.listeCours = listeCours;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public ArrayList<String> getLanguesParlees() {
        return languesParle
    }}