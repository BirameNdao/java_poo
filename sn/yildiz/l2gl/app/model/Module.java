package sn.yildiz.l2gl.app.model;

public final class Module implements Affichable {
    private String code ;
    private String libelle;

    public Module(String code , String libelle){
        if (code == null || code.trim().isEmpty()) {
            throw new IllegalArgumentException("Le code ne peut pas être nul ou vide !");
        }
        this.code = code;
        if (libelle == null || libelle.trim().isEmpty()) {
            throw new IllegalArgumentException("Le libelle ne peut pas être nul ou vide !");
        }
        this.libelle = libelle;

    }
    public String getCode() {
        return code;
    }
    public String getLibelle() {
        return libelle;
    }
    @Override
    public String afficher(){
        return "Module: " + code + " - " + libelle;
    }
}
