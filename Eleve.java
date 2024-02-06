import java.util.ArrayList;
import java.util.List;

class Eleve {
    // Les noms de variables doivent commencer par une lettre minuscule
    private String nomEleve;
    private String prenomEleve;
    private String dateNaissance;
    private char sexe;
    private List<String> notes; // La liste doit être de type String si elle contient des notes sous forme de texte

    // Le type de 'Sexe' doit être 'char' dans le constructeur également
    public Eleve(String nomEleve, String prenomEleve, String dateNaissance, char sexe) {
        this.nomEleve = nomEleve;
        this.prenomEleve = prenomEleve;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
        this.notes = new ArrayList<>();
    }

    // Getters et setters corrigés
    public String getNomEleve() {
        return nomEleve;
    }

    public void setNomEleve(String nomEleve) {
        this.nomEleve = nomEleve;
    }

    public String getPrenomEleve() {
        return prenomEleve;
    }

    public void setPrenomEleve(String prenomEleve) { // Correction du nom de méthode
        this.prenomEleve = prenomEleve;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public char getSexe() { // 'Char' doit être en minuscule
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public List<String> getNotes() {
        return notes;
    }

    // La liste des notes doit être de type String, correction du type de paramètre
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    // Méthode supprimée car elle ne correspond pas à l'utilisation correcte des types et des méthodes existantes
}

class Matiere {
    private String code;
    private String nom;
    private int coef;

    public Matiere(String code, String nom, int coef) {
        this.code = code;
        this.nom = nom;
        this.coef = coef;
    }

    // Getters et setters corrigés
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }
}

class Classe {
    private String nomC;
    private int effectif;
    private List<Eleve> eleves;

    public Classe(String nomC, int effectif) {
        this.nomC = nomC;
        this.effectif = effectif;
        this.eleves = new ArrayList<>(); // Correction orthographique
    }

    // Getters et setters corrigés
    public String getNomC() {
        return nomC;
    }

    public void setNomC(String nomC) {
        this.nomC = nomC;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    public List<Eleve> getEleves() { // Correction du nom de méthode
        return eleves;
    }
}

class Note {
    private Eleve eleve;
    private Matiere matiere;
    private double valeur;

    public Note(Eleve eleve, Matiere matiere, double valeur) {
        this.eleve = eleve;
        this.matiere = matiere;
        this.valeur = valeur;
    }

    // Getters et setters corrigés
    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }
}
