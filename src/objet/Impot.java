package objet;

public class Impot {
    private String type;
    private double taux;

    // Constructeur
    public Impot(String type, double taux) {
        this.type = type;
        this.taux = taux;
    }

    // Getters
    public String getType() {
        return type;
    }

    public double getTaux() {
        return taux;
    }
}

