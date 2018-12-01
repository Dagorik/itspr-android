package tec.clase.dagorik.com.proyecto.data;

import android.provider.CallLog;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import tec.clase.dagorik.com.proyecto.models.KindCompany;
import tec.clase.dagorik.com.proyecto.models.Notifications;
import tec.clase.dagorik.com.proyecto.models.Report;

/**
 * Created by Dagorik on 12/1/18. ${SYSTEM}
 */
public interface DataRepository {

    @GET("api/v1/kinds_companies/")
    Call<List<KindCompany>> getAllKindCompanies();

    @GET("api/v1/report/")
    Call<List<Notifications>> getAllNotifications();

    @POST("api/v1/report/")
    Call<Report> createReport(@Body Report report);
}
