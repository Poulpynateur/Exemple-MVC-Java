package View;

import Controller.ActionListener;
import Controller.Event;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class Render extends Parent {

    private Label label;
    private Button button;

    /**** CONSTRUCTOR ****/
    public Render() {
        label = new Label("Test");
        button = new Button("Next");

        HBox layout = new HBox(button, label);

        this.getChildren().addAll(layout);
    }

    /**** GETTERS and SETTERS ****/
    public Button getButton() {
        return button;
    }

    public Label getLabel() {
        return label;
    }

    /**** METHODS ****/
    // TODO : this part seems dirty somehow ...
    public void setListener(ActionListener listener) {
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                listener.update(Event.NEXT_TEXT);
            }
        });
    }
}
