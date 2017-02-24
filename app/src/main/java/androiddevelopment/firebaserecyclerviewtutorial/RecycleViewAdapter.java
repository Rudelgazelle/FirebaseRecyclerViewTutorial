package androiddevelopment.firebaserecyclerviewtutorial;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lbuer on 24.02.2017.
 */

//create a class to extend the RecycleView adapter and viewholder!

    // 1. Implement methods on RecycleViewAdapter to get the @Override methods (Alt+Enter)

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {



    // 5. Define list for the items from Class ListItem
    private List<ListItem> listItems;
    private Context context;

    //6. Create a constructor of the List and Content Objects
    public RecycleViewAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    //this method will be called whenever the viewholder is created (it creates an instance of ViewHolder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // 3. create a view object and get the listitem layout file with the help of the LayoutInflater
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    // 8. create a new listItem Object
    //this method will bind the data to the ViewHolder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        //position will give the specific position of the listitem
        ListItem listItem = listItems.get(position);

        // set the text of the header and descripion view to the value of the header and description variable of the item in the Itemlist
        holder.textViewHeader.setText(listItem.getHeader());
        holder.textViewDescription.setText(listItem.getDescription());
    }

    // 7. get the ItemCount from the list be returning the size of the list object. (Replace that auto generated 0)
    @Override
    public int getItemCount() {

        return listItems.size();
    }

    //2. create a constructor matching Super inside the ViewHolder (Alt+Enter)
    public class ViewHolder extends RecyclerView.ViewHolder{

        // 4. Initialize the TextViews

        public TextView textViewHeader;
        public TextView textViewDescription;


        public ViewHolder(View itemView) {
            super(itemView);

            // 4.1. Bind them to the variables
            textViewHeader = (TextView) itemView.findViewById(R.id.TextViewItemHeading);
            textViewDescription = (TextView) itemView.findViewById(R.id.TextViewItemDescription);

        }
    }
}
