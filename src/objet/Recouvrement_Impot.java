package objet;

import java.util.HashMap;
import java.util.Map;

public class Recouvrement_Impot {
    private Map<String, Contribuable> contribuables;

    public Recouvrement_Impot() {
        this.contribuables = new HashMap<>();
        chargerDonneesContribuables();
    }

    private void chargerDonneesContribuables() {
        contribuables.put("0564856945514", new Contribuable("Doe", "John", "01/01/1980", "123 rue des Contribuables", "31000", "Ville", "France", "0564856945514", "61 65842", "074653"));
        contribuables.put("1234567890123", new Contribuable("Smith", "Alice", "15/05/1975", "456 avenue des Impôts", "75000", "Paris", "France", "1234567890123", "12 34567", "123456"));
        contribuables.put("9876543210987", new Contribuable("Doe", "Jane", "10/08/1990", "789 boulevard des Taxes", "69000", "Lyon", "France", "9876543210987", "98 76543", "987654"));
        contribuables.put("1234123412341", new Contribuable("Brown", "Michael", "25/09/1985", "12 boulevard des Finances", "13000", "Marseille", "France", "1234123412341", "12 34123", "000001"));
        contribuables.put("1111222233334", new Contribuable("Taylor", "Emma", "03/07/1978", "8 rue de la Taxation", "33000", "Bordeaux", "France", "1111222233334", "11 22233", "222222"));
        contribuables.put("5555666677778", new Contribuable("Johnson", "Robert", "19/11/1995", "17 rue de la Fiscalité", "54000", "Nancy", "France", "5555666677778", "55 56677", "777777"));
        contribuables.put("9999888877776", new Contribuable("Garcia", "Sophie", "08/04/1982", "28 avenue de l'Impôt", "59000", "Lille", "France", "9999888877776", "99 98877", "111111"));
        contribuables.put("8888777766665", new Contribuable("Martinez", "Luc", "30/06/1970", "45 rue de la Taxe", "75000", "Paris", "France", "8888777766665", "88 87766", "444444"));
        contribuables.put("3333444455552", new Contribuable("Lopez", "Eva", "12/02/1988", "3 boulevard de l'Impôt", "35000", "Rennes", "France", "3333444455552", "33 34455", "666666"));
        contribuables.put("4444333322221", new Contribuable("Chang", "Yun", "07/10/1973", "78 avenue des Taxes", "67000", "Strasbourg", "France", "4444333322221", "44 43322", "555555"));
    }

    public Map<String, Contribuable> trouverImpayes() {
        Map<String, Contribuable> impayes = new HashMap<>();

        for (Map.Entry<String, Contribuable> entry : contribuables.entrySet()) {
            String cle = entry.getKey();
            Contribuable contribuable = entry.getValue();

            // Ajoutez ici votre logique pour déterminer si le contribuable est impayé
            // Par exemple, si le montant à payer est supérieur à 0, ou en fonction d'un autre critère

            // Si le contribuable est impayé, ajoutez-le à la map des impayés
            // if (contribuable.estImpaye()) {
            //     impayes.put(cle, contribuable);
            // }
        }

        return impayes;
    }
}
