package Model;

public class Model implements Data {

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
    public void incrementPos() {
        pos = (pos+1 >= values.length)? 0 : pos+1;
    }

    @Override
    public String getActiveValue() {
        return values[pos];
    }
}
