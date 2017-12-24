package id.codefighters.sanguku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Tabunganku;
    TextView Beli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tabunganku = (TextView) findViewById(R.id.Tabunganku);
        Beli = (TextView) findViewById(R.id.Beli);

        Tabunganku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tabungan = new Intent(getApplicationContext(),Tabunganku.class);
                startActivity(tabungan);
            }
        });

        Beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent beli = new Intent(getApplicationContext(),Beli.class);
                startActivity(beli);
            }
        });
    }
}
