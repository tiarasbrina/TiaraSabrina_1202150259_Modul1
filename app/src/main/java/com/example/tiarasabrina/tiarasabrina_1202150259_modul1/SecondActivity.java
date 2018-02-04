package com.example.tiarasabrina.tiarasabrina_1202150259_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView xlokasiMakan;
    TextView xpilihanMenu;
    TextView xporsiMakan;
    TextView xtotalMakanMalam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String ambilJumlah = intent.getStringExtra("Jumlah");
        String ambilLokasi = intent.getStringExtra("Lokasi");
        String ambilMenu = intent.getStringExtra("Menu");
        String ambilHarga = intent.getStringExtra("Harga");
        int hasiltotal = Integer.valueOf(ambilHarga)*Integer.valueOf(ambilJumlah);

        xporsiMakan = (TextView)findViewById(R.id.porsiMakanan);
        xporsiMakan.setText(ambilJumlah);
        xlokasiMakan = (TextView)findViewById(R.id.lokasiMakan);
        xlokasiMakan.setText(ambilLokasi);
        xpilihanMenu = (TextView)findViewById(R.id.pilihanMenu);
        xpilihanMenu.setText(ambilMenu);
        xtotalMakanMalam = (TextView)findViewById(R.id.totalMakanMalam);
        xtotalMakanMalam.setText(String.valueOf(hasiltotal));

        if (hasiltotal > 65000){
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya!!! uang kamu tidak cukup",Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya",Toast.LENGTH_LONG);
            toast.show();
        }


    }
}
