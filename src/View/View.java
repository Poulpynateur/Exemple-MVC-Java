package View;

import Controller.ActionListener;
import Model.DataSpeaker;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;

import java.util.Timer;
import java.util.TimerTask;

public class View {

    private Group root;
    private Scene scene;

    private ActionListener actionListener;
    private DataSpeaker dataSpeaker;


    private Render render;

    private Timer timer;

    /**** CONSTRUCTOR ****/
    public View(DataSpeaker dataSpeaker, int width, int height) {
        this.dataSpeaker = dataSpeaker;
        timer = new Timer();

        root = new Group();
        scene = new Scene(root, width, height);

        render = new Render();
        root.getChildren().add(render);
    }

    /**** GETTERS and SETTERS ****/
    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
        render.setListenner(this.actionListener);
    }
    public Scene getScene() {
        return scene;
    }

    /**** METHODS ****/
    public void refresh(int period) {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                    //refresh
                });
            }
        }, 0, period);
    }
    public void refreshLabel() {
        render.getLabel().setText(dataSpeaker.getNextValue());
    }
    public void finish() {
        timer.cancel();
    }
}
