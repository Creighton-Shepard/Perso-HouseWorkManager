import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import vue.TableVue;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        List<String> columnList = new ArrayList<String>();
        columnList.add("Test1");
        columnList.add("Test2");
        columnList.add("Test3");
        Controller controller = new Controller();
        primaryStage.setTitle("HouseWorkManager");
        Group root = new Group();
        root.getChildren().add(new TableVue(columnList).getVBox(5, new Insets(10,0,0,10)));
        Scene scene = new Scene(root, 800,600, Color.GRAY);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}