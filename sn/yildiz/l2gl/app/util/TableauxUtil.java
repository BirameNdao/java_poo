package sn.yildiz.l2gl.app.util;

/**
 * Classe utilitaire pour manipuler les tableaux
 * Contient des méthodes génériques pour effectuer des opérations sur des tableaux
 */
public class TableauxUtil {

    /**
     * Recherche la position d'un élément dans un tableau
     *
     * @param <T> Type générique (peut être n'importe quel type d'objet)
     * @param tab Le tableau dans lequel chercher
     * @param cible L'élément à chercher
     * @return L'index (position) de l'élément, ou -1 s'il n'est pas trouvé
     */
    public static <T> int indexOf(T[] tab, T cible) {
        // Boucle sur tous les éléments du tableau
        for (int i = 0; i < tab.length; i++) {
            // Cas spécial 1: on cherche null et on trouve null
            if (cible == null && tab[i] == null) {
                return i; // Retourner la position trouvée
            }
            // Cas spécial 2: on compare les éléments avec la méthode equals()
            // (on vérifie d'abord que cible n'est pas null pour éviter une erreur)
            if (cible != null && cible.equals(tab[i])) {
                return i; // Élément trouvé, retourner sa position
            }
        }
        // Son pas trouvé après parcours complet du tableau
        return -1;
    }
}

