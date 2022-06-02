package dsa.eetac.upc.edu.minim2Irene;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dsa.eetac.upc.edu.minim2Irene.API.*;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    private List<Repos> dades;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<Repos> reposList, Context context) {
        this.dades = reposList;
        this.mInflater = LayoutInflater.from((Context) context);
        this.context = (Context) context;
    }


    @Override
    public ListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = mInflater.inflate(R.layout.activity_repos, null);
        return new ListAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ListAdapter.MyViewHolder holder, int position) {
        holder.bindData(dades.get(position));
    }

    @Override
    public int getItemCount() {
        return dades.size();
    }

    public void setItems(List<Repos> items){
        dades=items;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView language;
        TextView username;

        MyViewHolder(View itemView){
            super(itemView);
            username=itemView.findViewById(R.id.NameTextView);
            language=itemView.findViewById(R.id.languajeTextView);
        }

        void bindData(final Repos repo){
            username.setText(repo.getName());
            language.setText(repo.getLanguaje());

        }

    }
}