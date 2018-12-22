package vue;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.util.List;

public class TableVue {

    private final Label label;
    private TableView table;

    public TableVue(List<String> columnList){
        this.label = new Label("HouseWorkManager");
        this.label.setFont(new Font("Arial",20));
        this.table = new TableView();
        table.setEditable(true);
        for (int i=0; i<columnList.size(); i++) {
            table.getColumns().add(new TableColumn(columnList.get(i)));
        }
    }

    public VBox getVBox(int spacing, Insets insets){
        VBox vbox = new VBox();
        vbox.setSpacing(spacing);
        vbox.setPadding(insets);
        vbox.getChildren().addAll(label,table);
        return vbox;
    }
}
