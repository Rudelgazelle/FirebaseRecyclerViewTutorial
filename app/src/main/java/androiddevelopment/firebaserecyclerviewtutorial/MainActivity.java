package androiddevelopment.firebaserecyclerviewtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecycleViewAdapter recycleViewAdapter;

    private List<ListItem> listItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inizialize the recycleview object
        recyclerView = (RecyclerView) findViewById(R.id.MyRecyclerView);
        //every Item in the RecycleView will have a fixed size
        recyclerView.setHasFixedSize(true);
        //create a linearlayoutmanager with the current context
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //this list will hold all items taht will be shown in the recyclerview
        listItems = new ArrayList<>();

        //just as an illustration for this tutorial
        for (int i=0; i<=10; i++){
            ListItem listItem = new ListItem(
                    "heading " + (i+1),
                    "lorem ipsum dummy text"
            );

            listItems.add(listItem);
        }

        //create a new instance of the adapter (the Adapter will take the Listitems and context as variables)
        recycleViewAdapter = new RecycleViewAdapter(listItems, this);
        //set the adapter to the RecycleView
        recyclerView.setAdapter(recycleViewAdapter);

    }
}
