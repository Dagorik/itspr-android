package tec.clase.dagorik.com.proyecto.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import tec.clase.dagorik.com.proyecto.R;
import tec.clase.dagorik.com.proyecto.models.KindCompany;
import tec.clase.dagorik.com.proyecto.models.Sales;

/**
 * Created by Dagorik on 11/24/18. ${SYSTEM}
 */
public class RecyclerViewSalesAdapter extends RecyclerView.Adapter<RecyclerViewSalesAdapter.ViewHolder> {

    private List<KindCompany> kindCompanyList = new ArrayList<>();

    public RecyclerViewSalesAdapter(List<KindCompany> kindCompanyList) {
        this.kindCompanyList = kindCompanyList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sales_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.title.setText(kindCompanyList.get(i).getName());
        Picasso.get().load(kindCompanyList.get(i).getImage()).into(viewHolder.cover);
    }

    @Override
    public int getItemCount() {
        return kindCompanyList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView title;
        ImageView cover;
        CardView cardItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_titulo);
            cover = itemView.findViewById(R.id.iv_portada);
            cardItem = itemView.findViewById(R.id.card_sale_item);
            cardItem.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(itemView.getContext(), "Le diste click al elemento", Toast.LENGTH_SHORT).show();
        }
    }
}
