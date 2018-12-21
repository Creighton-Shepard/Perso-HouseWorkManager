

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.LinkedList;
import java.util.List;

public class VueTableau {

    private final Coordonnees pointA;
    private final Coordonnees pointB;
    private List<Rectangle> visuelTableau;

    public VueTableau(int xA, int yA, int xB, int yB){
        this.pointA = new Coordonnees(xA, yA);
        this.pointB = new Coordonnees(xB, yB);
        visuelTableau = new LinkedList<Rectangle>();
        initialiserTableau();
    }

    public Coordonnees getPointA() {
        return pointA;
    }

    public Coordonnees getPointB() {
        return pointB;
    }

    public List<Rectangle> getVisuelTableau() {
        return visuelTableau;
    }

    public void setVisuelTableau(List<Rectangle> visuel_tableau) {
        this.visuelTableau = visuel_tableau;
    }

    private void initialiserTableau() {
        int x,y;
        int longueurTableau, largeurTableau;
        double facteur=1.0;
        double taille=0.005;

        longueurTableau = pointB.getX()-pointA.getX();
        largeurTableau = pointB.getY()-pointA.getY();
        visuelTableau.add(new Rectangle());
        visuelTableau.get(0).setX(pointA.getX());
        visuelTableau.get(0).setY(pointA.getY());
        visuelTableau.get(0).setWidth(longueurTableau);
        visuelTableau.get(0).setHeight(largeurTableau);
        visuelTableau.get(0).setFill(Color.WHITE);
        for(int i=1; i<8; i++) {
            visuelTableau.add(new Rectangle());
            visuelTableau.get(i).setFill(Color.BLACK);
            visuelTableau.get(i).setStroke(Color.BLACK);
            if (i < 2) {
                x = pointA.getX();
                y = (int)(largeurTableau*0.2);
                visuelTableau.get(i).setWidth(longueurTableau);
                visuelTableau.get(i).setHeight(taille * (largeurTableau));
            } else {
                x = (int)((facteur / 7)*(longueurTableau)+pointA.getX());
                y = pointA.getY();
                facteur++;
                visuelTableau.get(i).setWidth(taille * (longueurTableau));
                visuelTableau.get(i).setHeight(largeurTableau);
            }
            visuelTableau.get(i).setX(x);
            visuelTableau.get(i).setY(y);
        }
    }
}
