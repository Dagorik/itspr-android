package tec.clase.dagorik.com.proyecto.models;

/**
 * Created by Dagorik on 11/24/18. ${SYSTEM}
 */
public class Notifications {

    private int id;
    private String notification;
    private String description;

    public Notifications(int id, String notification, String description) {
        this.id = id;
        this.notification = notification;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
