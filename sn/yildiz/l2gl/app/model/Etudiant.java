package sn.yildiz.l2gl.app.model;

public final class Etudiant extends Personne implements Affichable {
    private final String matricule;

    // Constructeur avec validations
    public Etudiant(String nom, String email, String matricule) {
        super(nom, email);

        if (matricule == null || matricule.trim().isEmpty()) {
            throw new IllegalArgumentException("Le matricule ne peut pas être nul ou vide !");
        }

        // Vérification du format "YYYY-NNN" (ex: 2025-123)
        if (!matricule.matches("\\d{4}-\\d{3}")) {
            throw new IllegalArgumentException("Le matricule doit respecter le format 'YYYY-NNN' !");
        }

        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    @Override
    public String role() {
        return "Etudiant";
    }
    public String identite(){
        return this.getNom() + " " +this.getEmail() + " " + this.matricule;
    }

    public String identite(String prefixe){
        return prefixe;
    }

    @Override
    public String afficher(){
        return "Etudiant: " + matricule + " - " + getNom();
    }
}
