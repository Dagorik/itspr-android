package tec.clase.dagorik.com.proyecto.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import tec.clase.dagorik.com.proyecto.R;
import tec.clase.dagorik.com.proyecto.adapters.RecyclerViewSalesAdapter;
import tec.clase.dagorik.com.proyecto.models.Sales;

/**
 * A simple {@link Fragment} subclass.
 */
public class SalesFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerViewSalesAdapter adapter;

    public SalesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sales, container, false);
        List<Sales> salesList= new ArrayList<>();
        salesList.add(new Sales(1,"Ejemplo 1", "https://www.villapalmarcancun.com/cms/resources/davino-restaurant-villa-palmar-cancun-slide3-w640h350.jpg"));
        salesList.add(new Sales(2,"Ejemplo 2", "https://www.t-nation.com/system/publishing/articles/10005529/original/6-Reasons-You-Should-Never-Open-a-Gym.png?1509471214"));
        salesList.add(new Sales(3,"Ejemplo 3", "https://img.grouponcdn.com/iam/NG2PuHCH332Ax1sL19w4GDDyvyE/NG-1500x900/v1/c700x420.jpg"));
        salesList.add(new Sales(4,"Ejemplo 4", "https://http2.mlstatic.com/corrida-financiera-para-proyecto-de-taller-mecanico-autos-D_NQ_NP_668011-MLM20459011910_102015-F.jpg"));
        salesList.add(new Sales(5,"Ejemplo 5", "https://www.villapalmarcancun.com/cms/resources/davino-restaurant-villa-palmar-cancun-slide3-w640h350.jpg"));
        salesList.add(new Sales(6,"Ejemplo 6", "https://img.grouponcdn.com/iam/NG2PuHCH332Ax1sL19w4GDDyvyE/NG-1500x900/v1/c700x420.jpg"));
        salesList.add(new Sales(7,"Ejemplo 7", "https://www.t-nation.com/system/publishing/articles/10005529/original/6-Reasons-You-Should-Never-Open-a-Gym.png?1509471214"));
        salesList.add(new Sales(8,"Ejemplo 8", "https://http2.mlstatic.com/corrida-financiera-para-proyecto-de-taller-mecanico-autos-D_NQ_NP_668011-MLM20459011910_102015-F.jpg"));
        salesList.add(new Sales(9,"Ejemplo 9", "https://www.villapalmarcancun.com/cms/resources/davino-restaurant-villa-palmar-cancun-slide3-w640h350.jpg"));

        recyclerView = (RecyclerView) view.findViewById(R.id.rv_sales);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        adapter = new RecyclerViewSalesAdapter(salesList);
        recyclerView.setAdapter(adapter);

        return view;
    }

}
