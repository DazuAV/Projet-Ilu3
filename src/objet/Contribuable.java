package objet;

public class Contribuable {
    private String id;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String adresse;
    private String codePostale;
    private String ville;
    private String pays;
    private String identifiant;
    private String satd; // Status avancé de traitement des données
    private String codique; // Code unique d'identification de chaque contribuable

    public Contribuable(String nom, String prenom, String dateNaissance, String adresse, String codePostale, String ville, String pays, String identifiant, String satd, String codique) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.codePostale = codePostale;
        this.ville = ville;
        this.pays = pays;
        this.identifiant = identifiant;
        this.satd = satd;
        this.codique = codique;
    }

    // Getters et setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getSatd() {
        return satd;
    }
    
    public void setSatd(String satd) {
        this.satd = satd;
    }

    public String getCodique() {
        return codique;
    }
    
    public void setCodique(String codique) {
        this.codique = codique;
    }
}