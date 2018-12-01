package tec.clase.dagorik.com.proyecto.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Dagorik on 12/1/18. ${SYSTEM}
 */
public class Report {



    @SerializedName("repair")
    private int repair;
    @SerializedName("dislikes")
    private int dislikes;
    @SerializedName("likes")
    private int likes;
    @SerializedName("type")
    private int type;
    @SerializedName("lon")
    private String lon;
    @SerializedName("lat")
    private String lat;
    @SerializedName("date")
    private String date;
    @SerializedName("client")
    private String client;
    @SerializedName("name")
    private String name;

    public Report() {
    }

    public Report(int repair, int dislikes, int likes, int type, String lon, String lat, String date, String client, String name) {
        this.repair = repair;
        this.dislikes = dislikes;
        this.likes = likes;
        this.type = type;
        this.lon = lon;
        this.lat = lat;
        this.date = date;
        this.client = client;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Report{" +
                "repair=" + repair +
                ", dislikes=" + dislikes +
                ", likes=" + likes +
                ", type=" + type +
                ", lon='" + lon + '\'' +
                ", lat='" + lat + '\'' +
                ", date='" + date + '\'' +
                ", client='" + client + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int getRepair() {
        return repair;
    }

    public void setRepair(int repair) {
        this.repair = repair;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
