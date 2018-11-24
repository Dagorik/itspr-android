package tec.clase.dagorik.com.proyecto.models;

/**
 * Created by Dagorik on 11/24/18. ${SYSTEM}
 */
public class Sales {

    public Sales(int id, String title, String imageCover) {
        this.id = id;
        this.title = title;
        this.imageCover = imageCover;
    }

    public Sales() {
    }

    private int id;
    private String title;
    private String imageCover;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageCover() {
        return imageCover;
    }

    public void setImageCover(String imageCover) {
        this.imageCover = imageCover;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", imageCover='" + imageCover + '\'' +
                '}';
    }
}
