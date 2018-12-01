package tec.clase.dagorik.com.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.agik.AGIKSwipeButton.Controller.OnSwipeCompleteListener;
import com.agik.AGIKSwipeButton.View.Swipe_Button_View;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import tec.clase.dagorik.com.proyecto.data.DataRepository;
import tec.clase.dagorik.com.proyecto.models.Report;

public class ReportActivity extends AppCompatActivity {

    private Swipe_Button_View swipeButtonView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        swipeButtonView = (Swipe_Button_View) findViewById(R.id.btn_swipe);
        editText = (EditText) findViewById(R.id.et_report_create);

        swipeButtonView.setOnSwipeCompleteListener_forward_reverse(new OnSwipeCompleteListener() {
            @Override
            public void onSwipe_Forward(Swipe_Button_View swipe_button_view) {
                if(editText.getText().toString().isEmpty()){
                    Toast.makeText(ReportActivity.this, "Llena el formulario", Toast.LENGTH_SHORT).show();
                }else {

                    Report report = new Report
                            (1, 1, 1, 1, "19.12", "-12.12",
                                    "Ayer", "dCz54bqDgOQ", editText.getText().toString());


                    Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl("https://backpoza.herokuapp.com/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                    DataRepository client = retrofit.create(DataRepository.class);

                    client.createReport(report).enqueue(new Callback<Report>() {
                        @Override
                        public void onResponse(Call<Report> call, Response<Report> response) {
                            Toast.makeText(ReportActivity.this, "Reporte creado exitosamente", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onFailure(Call<Report> call, Throwable t) {
                            Log.e("Error",t.getMessage());
                        }
                    });
                }

                }

            @Override
            public void onSwipe_Reverse(Swipe_Button_View swipe_button_view) {

            }
        });

    }
}
