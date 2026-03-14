package sn.yildiz.l2gl.app.model;

public final class Enseignant extends Personne {
    private final String numeroSomme;

    // Constructeur avec validations
    public Enseignant(String nom, String email, String numeroSomme) {
        super(nom, email);

        if (numeroSomme == null || numeroSomme.trim().isEmpty()) {
            throw new IllegalArgumentException("Le numéro de somme (NCI) ne peut pas être nul ou vide !");
        }

        this.numeroSomme = numeroSomme;
    }

    public String getNumeroSomme() {
        return numeroSomme;
    }

    @Override
    public String role() {
        return "Enseignant";
    }
}
