package hasan.com.belajarrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Sisop> listOs = new ArrayList<Sisop>();
        listOs.add(new Sisop("Android", R.drawable.ic_launcher_background));
        listOs.add(new Sisop("Filkom", R.drawable.filkom_logo));
        listOs.add(new Sisop("UPI", R.drawable.logo_upi));
        listOs.add(new Sisop("Sedih", R.drawable.sedih));
        listOs.add(new Sisop("Terima Kasih", R.drawable.terima_kasih));
        listOs.add(new Sisop("Android", R.drawable.ic_launcher_background));
        listOs.add(new Sisop("Filkom", R.drawable.filkom_logo));
        listOs.add(new Sisop("UPI", R.drawable.logo_upi));
        listOs.add(new Sisop("Sedih", R.drawable.sedih));
        listOs.add(new Sisop("Terima Kasih", R.drawable.terima_kasih));
        CustomAdapter adapter = new CustomAdapter(this, listOs);
        rv = findViewById(R.id.rv);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}
