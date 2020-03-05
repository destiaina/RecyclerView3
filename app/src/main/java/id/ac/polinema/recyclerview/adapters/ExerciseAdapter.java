package id.ac.polinema.recyclerview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.recyclerview.R;
import id.ac.polinema.recyclerview.models.TeamLat;


public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ViewHolder>{

    private Context context;
    private List<TeamLat> items;
    private static final int LOGO_LEFT = 1;
    private static final  int LOGO_RIGHT = 2;

    public ExerciseAdapter(Context context, List<TeamLat> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ExerciseAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        if(viewType == LOGO_LEFT){
            view = LayoutInflater.from(context)
                    .inflate(R.layout.item_exercise, parent, false);
        } else if(viewType == LOGO_RIGHT){
            view = LayoutInflater.from(context)
                    .inflate(R.layout.item_exercise_abu, parent, false);
        }
        return new ExerciseAdapter.ViewHolder(view);
    }

    @Override
    public int getItemViewType(int position){
        return (position % 4 == 0 || position % 4 == 3) ? LOGO_RIGHT : LOGO_LEFT;
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseAdapter.ViewHolder holder, int position) {
        TeamLat item = items.get(position);

        Picasso.get().load(item.getLogo()).into(holder.logoImage);
        holder.descText.setText(item.getDesc());
        holder.nameText.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView descText;
        ImageView logoImage;
        TextView nameText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            descText = itemView.findViewById(R.id.text_des);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
        }
    }
}
