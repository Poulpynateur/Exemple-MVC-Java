
import View.View;
import Model.Model;
import Controller.Controller;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private static final int WIDTH = 200;
    private static final int HEIGHT = 100;

    private Model model;
    private View view;
    private Controller controller;

    //Start method replace main
    @Override
    public void start(Stage primaryStage) throws Exception {

        model = new Model();
        view = new View(model, WIDTH,HEIGHT);
        controller = new Controller(view, model);

        view.setActionListener(controller);

        primaryStage.setScene(view.getScene());
        primaryStage.show();
    }

    @Override
    public void stop(){
        view.finish();
    }
}
