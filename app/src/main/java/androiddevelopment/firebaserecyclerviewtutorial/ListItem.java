package androiddevelopment.firebaserecyclerviewtutorial;

/**
 * Created by lbuer on 24.02.2017.
 */

public class ListItem {

    private String header;
    private String description;

    //initialize the variabes with a constructor (done via right click)
    public ListItem(String header, String description) {
        this.header = header;
        this.description = description;
    }

    public String getHeader() {
        return header;
    }

    public String getDescription() {
        return description;
    }
}


