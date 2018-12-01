package tec.clase.dagorik.com.proyecto.fragments;


import android.app.Notification;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import tec.clase.dagorik.com.proyecto.R;
import tec.clase.dagorik.com.proyecto.adapters.RecyclerViewNotificationAdapter;
import tec.clase.dagorik.com.proyecto.data.DataRepository;
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


        recyclerView = (RecyclerView)view.findViewById(R.id.rv_notifications);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        loadAllNotifications();
        return view;
    }


    private void setUpRecyclerView(List<Notifications> notificationList){
        adapter = new RecyclerViewNotificationAdapter(notificationList);
        recyclerView.setAdapter(adapter);
    }


    private void loadAllNotifications(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://backpoza.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        DataRepository client = retrofit.create(DataRepository.class);

        client.getAllNotifications().enqueue(new Callback<List<Notifications>>() {
            @Override
            public void onResponse(Call<List<Notifications>> call, Response<List<Notifications>> response) {
                List<Notifications> notificationsList = response.body();
                setUpRecyclerView(notificationsList);
            }

            @Override
            public void onFailure(Call<List<Notifications>> call, Throwable t) {
                Log.e("Error",t.getMessage());
            }
        });
    }

}
