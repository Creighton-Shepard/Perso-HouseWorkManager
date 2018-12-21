import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("HouseWorkManager");
        Group root = new Group();
        VuePrincipale vuePrincipale = new VuePrincipale(800, 600);
        Scene scene = new Scene(root, vuePrincipale.getLongueur(), vuePrincipale.getLargeur(), Color.GRAY);
        primaryStage.setScene(scene);
        /*Button btn = new Button();
        btn.setLayoutX(100);
        btn.setLayoutY(80);
        btn.setText("Hello World !");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }
        });*/
        for (Rectangle rectangle: vuePrincipale.getVueTableau().getVisuelTableau()) {
            root.getChildren().add(rectangle);
        }
        //root.getChildren().add(btn);
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}