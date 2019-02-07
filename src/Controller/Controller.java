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

    /**** METHODS ****/
    @Override
    public void update(Event event) {
        switch (event) {
            case NEXT_TEXT:
                view.refreshLabel();
                break;
        }
    }

    private int getValuePos() {
        int _pos = pos;
        pos++;

        if (pos >= model.getValues().length)
            pos = 0;

        return _pos;
    }

}
