package Model;

public class Model implements DataSpeaker {

    private int pos = 0;
    private String[] values = {
            "Un chain",
            "Une autre",
            "J'ai pas d'idées",
            "Toujours pas",
            "Plus de choix",
            "On recommence soon"
    };

    /**** GETTERS and SETTERS ****/
    public String[] getValues() {
        return values;
    }

    @Override
    public String getNextValue() {
        int _pos = pos;
        pos = (pos+1 >= values.length)? 0 : pos+1;

        return values[_pos];
    }
}
