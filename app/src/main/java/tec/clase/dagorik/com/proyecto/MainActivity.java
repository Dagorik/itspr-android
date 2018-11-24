package tec.clase.dagorik.com.proyecto;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import tec.clase.dagorik.com.proyecto.fragments.MapFragment;
import tec.clase.dagorik.com.proyecto.fragments.NotificationFragment;
import tec.clase.dagorik.com.proyecto.fragments.SalesFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Fragment fragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigaion_view);

        fragmentManager = getSupportFragmentManager();
        fragment = new MapFragment();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.map:
                        fragment = new MapFragment();
                        break;
                    case R.id.sales:
                        fragment = new SalesFragment();
                        break;
                    case R.id.notification:
                        fragment = new NotificationFragment();
                        break;
                }
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container,fragment).commit();
                return true;
            }
        });
    }
}
