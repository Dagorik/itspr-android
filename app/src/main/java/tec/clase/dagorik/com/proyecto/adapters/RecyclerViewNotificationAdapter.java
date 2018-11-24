package tec.clase.dagorik.com.proyecto.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import tec.clase.dagorik.com.proyecto.R;
import tec.clase.dagorik.com.proyecto.models.Notifications;

/**
 * Created by Dagorik on 11/24/18. ${SYSTEM}
 */
public class RecyclerViewNotificationAdapter extends RecyclerView.Adapter<RecyclerViewNotificationAdapter.ViewHolder> {

    private List<Notifications> notificationsList = new ArrayList<>();

    public RecyclerViewNotificationAdapter(List<Notifications> notificationsList) {
        this.notificationsList = notificationsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.notification_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.notification.setText(notificationsList.get(i).getNotification());
        viewHolder.description.setText(notificationsList.get(i).getDescription());

    }

    @Override
    public int getItemCount() {
        return notificationsList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView notification,description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            notification = (TextView) itemView.findViewById(R.id.tv_notification);
            description = (TextView) itemView.findViewById(R.id.tv_description);
        }
    }
}

