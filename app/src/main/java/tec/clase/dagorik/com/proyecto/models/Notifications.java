package tec.clase.dagorik.com.proyecto.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dagorik on 11/24/18. ${SYSTEM}
 */
public class Notifications {

    @SerializedName("id_report")
    private String id;
    @SerializedName("name")
    private String notification;
    @SerializedName("date")
    private String description;

    public Notifications(String id, String notification, String description) {
        this.id = id;
        this.notification = notification;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Notifications{" +
                "id=" + id +
                ", notification='" + notification + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
