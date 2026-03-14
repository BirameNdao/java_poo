package sn.yildiz.l2gl.app.model;

public abstract class Personne {
    private final String nom;
    private final String email;

    // Méthode abstraite à implémenter par les sous-classes
    public abstract String role();

    // Constructeur avec validations
    public Personne(String nom, String email) {
        if (nom == null || nom.isEmpty()) {
            throw new IllegalArgumentException("Le nom ne peut pas être nul ou vide !");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("L'email ne peut pas être nul ou vide !");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("L'email doit contenir le caractère '@' !");
        }

        this.nom = nom;
        this.email = email;
    }

    // Getters
    public String getNom() {
        return this.nom;
    }

    public String getEmail() {
        return this.email;
    }

    public String identite(){
        return this.email + " " + this.nom;
    }
    
}
