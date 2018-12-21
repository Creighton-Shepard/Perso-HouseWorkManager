public class VuePrincipale {

    private final VueTableau vueTableau;
    private Coordonnees dimension;

    public VuePrincipale (int longueur, int largeur) {
        this.dimension = new Coordonnees(longueur, largeur);
        this.vueTableau = new VueTableau((int)(0.1*longueur), (int)(0.1*largeur), (int)(0.9*longueur), (int)(0.9*largeur));
    }

    public int getLongueur() {
        return dimension.getX();
    }

    public int getLargeur() {
        return dimension.getY();
    }

    public VueTableau getVueTableau() {
        return vueTableau;
    }
}
