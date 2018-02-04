package nurfitriyani.example.com.nurfitriyani_1202150242_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText pilihMakanan, pilihPorsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tombolEat (View view) {
        Intent intent = new Intent(this, EatbusActivity.class);
        pilihMakanan = (EditText) findViewById(R.id.makanApa);
        String menumakanan = pilihMakanan.getText().toString();
        pilihPorsi = (EditText) findViewById(R.id.berapaPorsi);
        String jml = pilihPorsi.getText().toString();
        intent.putExtra("loc", "Eatbus");
        intent.putExtra("jenis", menumakanan);
        intent.putExtra("jumlah", jml);
        intent.putExtra("price", "50000");
        startActivity(intent);
    }

    public void tombolabnormal (View view) {
        Intent intent = new Intent(this, EatbusActivity.class);
        pilihMakanan = (EditText) findViewById(R.id.makanApa);
        String menumakanan = pilihMakanan.getText().toString();
        pilihPorsi = (EditText) findViewById(R.id.berapaPorsi);
        String jml = pilihPorsi.getText().toString();
        intent.putExtra("loc", "Abnormal");
        intent.putExtra("jenis", menumakanan);
        intent.putExtra("jumlah", jml);
        intent.putExtra("price", "30000");
        startActivity(intent);
    }
}
