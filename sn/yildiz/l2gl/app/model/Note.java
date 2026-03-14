package sn.yildiz.l2gl.app.model;

public class Note {
    // composition
    private final Etudiant etudiant;
    private final Module module;
    private double valeur;

    public Note(Etudiant etudiant, Module module, double valeur) {
        if (etudiant == null || module == null) {
            throw new IllegalArgumentException("Etudiant et Module ne peuvent pas être null.");
        }
        if (valeur < 0 || valeur > 20) {
            throw new IllegalArgumentException("La valeur doit être comprise entre 0 et 20.");
        }
        this.etudiant = etudiant;
        this.module = module;
        this.valeur = valeur;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public Module getModule() {
        return module;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        if (valeur < 0 || valeur > 20) {
            throw new IllegalArgumentException("La valeur doit rester entre 0 et 20.");
        }
        this.valeur = valeur;
    }

    public boolean estValidee() {
        return valeur >= 10;
    }

    public String mention() {
        if (valeur < 10) return "Ajourné";
        else if (valeur < 12) return "Passable";
        else if (valeur < 14) return "Assez bien";
        else if (valeur < 16) return "Bien";
        else return "Très bien";
    }

    @Override
    public String toString() {
        return etudiant.afficher() + " | " + module.afficher() +
            " | Note: " + valeur +
            " | Mention: " + mention();
    }
}
