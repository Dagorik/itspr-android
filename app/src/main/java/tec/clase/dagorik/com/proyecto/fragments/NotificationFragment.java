package tec.clase.dagorik.com.proyecto.fragments;


import android.app.Notification;
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
import tec.clase.dagorik.com.proyecto.adapters.RecyclerViewNotificationAdapter;
import tec.clase.dagorik.com.proyecto.models.Notifications;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerViewNotificationAdapter adapter;

    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notification, container, false);

        List<Notifications> notificationsList = new ArrayList<>();
        notificationsList.add(new Notifications(1,"Bache","Bache bien feo en lomas"));
        notificationsList.add(new Notifications(2,"Bache","Bache en la petromex"));
        notificationsList.add(new Notifications(3,"Semaforo","Semaforo descupuesto solo sirve el verde"));
        notificationsList.add(new Notifications(4,"Calle cerrada","Porque estan asfaltando la 14"));
        notificationsList.add(new Notifications(5,"Semaforo","Lo chocaron"));
        notificationsList.add(new Notifications(6,"Calle cerrada","Por fiesta de colonia"));
        notificationsList.add(new Notifications(7,"Calle cerrada","kasdkahsdkjahsdkjahsjkdhasjkdhakjshd"));

        recyclerView = (RecyclerView)view.findViewById(R.id.rv_notifications);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        adapter = new RecyclerViewNotificationAdapter(notificationsList);
        recyclerView.setAdapter(adapter);


        return view;
    }

}
