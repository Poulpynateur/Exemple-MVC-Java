package Controller;

import View.View;
import Model.Model;

public class Controller implements ActionListener {

    private View view;
    private Model model;

    private int pos;

    /**** CONSTRUCTOR ***/
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;

        pos = 0;
    }

    /**
     * View send an input to the controller
     */
    @Override
    public void update(Event event) {
        switch (event) {
            case NEXT_TEXT:
                // Update the model
                model.incrementPos();
                // Notify the view of the update (here the notification take action immediately)
                view.refreshLabel();
                break;
        }
    }

}
