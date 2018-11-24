package tec.clase.dagorik.com.proyecto.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import tec.clase.dagorik.com.proyecto.R;
import tec.clase.dagorik.com.proyecto.models.Sales;

/**
 * Created by Dagorik on 11/24/18. ${SYSTEM}
 */
public class RecyclerViewSalesAdapter extends RecyclerView.Adapter<RecyclerViewSalesAdapter.ViewHolder> {

    private List<Sales> listSales = new ArrayList<>();

    public RecyclerViewSalesAdapter(List<Sales> listSales) {
        this.listSales = listSales;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sales_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.title.setText(listSales.get(i).getTitle());
        Picasso.get().load(listSales.get(i).getImageCover()).into(viewHolder.cover);
    }

    @Override
    public int getItemCount() {
        return listSales.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        ImageView cover;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_titulo);
            cover = itemView.findViewById(R.id.iv_portada);
        }
    }
}
