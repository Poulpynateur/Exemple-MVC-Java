package View;

import Controller.ActionListener;
import Model.Data;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;

import java.util.Timer;
import java.util.TimerTask;

public class View {

    private ActionListener actionListener;
    private Data data;

    private Group root;
    private Scene scene;

    private Render render;

    /**** CONSTRUCTOR ****/
    public View(Data data, int width, int height) {
        this.data = data;

        root = new Group();
        scene = new Scene(root, width, height);

        render = new Render();
        root.getChildren().add(render);
    }

    /**** GETTERS and SETTERS ****/
    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
        render.setListener(this.actionListener);
    }
    public Scene getScene() {
        return scene;
    }

    /**** METHODS ****/
    public void refreshLabel() {
        render.getLabel().setText(data.getActiveValue());
    }
}
