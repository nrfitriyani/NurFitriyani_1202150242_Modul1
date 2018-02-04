package nurfitriyani.example.com.nurfitriyani_1202150242_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class EatbusActivity extends AppCompatActivity {
    TextView locMakan;
    TextView pilMenu;
    TextView porsiMakan;
    TextView totPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eatbus);

        Intent intent = getIntent();

        String jumlah = intent.getStringExtra("jumlah");
        String loc = intent.getStringExtra("loc");
        String jenis = intent.getStringExtra("jenis");
        String price = intent.getStringExtra("price");
        int sum= Integer.valueOf(price)*Integer.valueOf(jumlah);

        porsiMakan = (TextView)findViewById(R.id.jmlMakanan);
        porsiMakan.setText(jumlah);
        locMakan = (TextView)findViewById(R.id.tempatMakan);
        locMakan.setText(loc);
        pilMenu = (TextView)findViewById(R.id.jenisMakanan);
        pilMenu.setText(jenis);
        totPrice = (TextView)findViewById(R.id.price);
        totPrice.setText(String.valueOf(sum));

        if (sum > 65000){
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya!!! uang kamu tidak cukup",Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG);
            toast.show();
        }

    }
}
