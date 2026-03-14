package sn.yildiz.l2gl.app;
//C:\Users\DELL\Documents\L2GL\java\personne>javac sn/yildiz/l2gl/app/Main.java sn/yildiz/l2gl/app/model/*.java
//java sn.yildiz.l2gl.app.Main
import sn.yildiz.l2gl.app.model.Affichable;
import sn.yildiz.l2gl.app.model.Etudiant;
import sn.yildiz.l2gl.app.model.Module;
import sn.yildiz.l2gl.app.model.Personne;

public class Main {

    public static void main(String[] args){
        Affichable[] elements = {
            new Etudiant("Amadou", "amadou@gmail.com", "12344ed"),
            new Module("jdnkwji", "Python"),
        };

        for (Affichable elem : elements) {
            System.out.println(elem.afficher());
        }
        Personne p = new Etudiant("birame","birame@gmail.com","2345-321");

        System.out.println(p.getNom());
        System.out.println(p.getEmail());
        //System.out.println(p.getMatricule());
        System.out.println(p.role());
        //p.identite("aisjhqh");
        System.out.println(p.identite());
    }

    
}
