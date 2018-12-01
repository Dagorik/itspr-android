package tec.clase.dagorik.com.proyecto.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Dagorik on 12/1/18. ${SYSTEM}
 */
public class KindCompany {

    @SerializedName("image")
    private String image;
    @SerializedName("description")
    private String description;
    @SerializedName("subtitle")
    private String subtitle;
    @SerializedName("name")
    private String name;
    @SerializedName("id_kind")
    private String id_kind;

    public KindCompany() {
    }

    public KindCompany(String image, String description, String subtitle, String name, String id_kind) {
        this.image = image;
        this.description = description;
        this.subtitle = subtitle;
        this.name = name;
        this.id_kind = id_kind;
    }

    @Override
    public String toString() {
        return "KindCompany{" +
                "image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", name='" + name + '\'' +
                ", id_kind='" + id_kind + '\'' +
                '}';
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId_kind() {
        return id_kind;
    }

    public void setId_kind(String id_kind) {
        this.id_kind = id_kind;
    }
}
