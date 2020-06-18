package hasan.com.belajarrecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    LayoutInflater mInflater;
    ArrayList<Sisop> sisop;
    Context ctx;

    public CustomAdapter(Context context, ArrayList<Sisop> sisop) {
        this.mInflater = LayoutInflater.from(context);
        this.sisop = sisop;
        this.ctx = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.rowview, parent, false);
        return new CustomViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, final int position) {
        final Sisop current = sisop.get(position);
        holder.namaItemView.setText(current.nama);
        holder.gambarView.setImageDrawable(ctx.getDrawable(current.idGambar));
        holder.gambarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ctx,current.nama,Toast.LENGTH_LONG).show();
                sisop.remove(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return sisop.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView gambarView;
        private CustomAdapter mAdapter;
        private TextView namaItemView;

        public CustomViewHolder(@NonNull View itemView, CustomAdapter adapter) {
            super(itemView);

            namaItemView = (TextView) itemView.findViewById(R.id.namaos);
            gambarView = (ImageView) itemView.findViewById(R.id.logo);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
