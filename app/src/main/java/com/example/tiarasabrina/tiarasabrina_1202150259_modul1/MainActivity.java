package com.example.tiarasabrina.tiarasabrina_1202150259_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText menuMakanan, jumlahPorsiMakanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void klikEatbus (View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        menuMakanan = (EditText)findViewById(R.id.inputMenuMakanan);
        String menus = menuMakanan.getText().toString();
        jumlahPorsiMakanan = (EditText)findViewById(R.id.inputJumlahPorsiMakanan);
        String jumlahPorsi = jumlahPorsiMakanan.getText().toString();
        intent.putExtra("Lokasi","Eatbus");
        intent.putExtra("Menu", menus);
        intent.putExtra("Jumlah", jumlahPorsi);
        intent.putExtra("Harga", "50000");
        startActivity(intent);
    }

    public void klikAbnormal (View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        menuMakanan = (EditText)findViewById(R.id.inputMenuMakanan);
        String menus = menuMakanan.getText().toString();
        jumlahPorsiMakanan = (EditText)findViewById(R.id.inputJumlahPorsiMakanan);
        String jumlahPorsi = jumlahPorsiMakanan.getText().toString();
        intent.putExtra("Lokasi","Abnormal");
        intent.putExtra("Menu", menus);
        intent.putExtra("Jumlah", jumlahPorsi);
        intent.putExtra("Harga", "30000");
        startActivity(intent);
    }


}
