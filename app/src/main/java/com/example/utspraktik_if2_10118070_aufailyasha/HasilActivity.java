package com.example.utspraktik_if2_10118070_aufailyasha;

//6 juni 2021
//10118070
//Aufa Ilyasha
//IF-2

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    Dialog dialog;
    TextView txt1,txt2,txt3,txt4,txt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        dialog = new Dialog(this);

        txt1 = findViewById(R.id.hasil_nik);
        txt2 = findViewById(R.id.hasil_nama);
        txt4 = findViewById(R.id.hasil_jenis);
        txt5 = findViewById(R.id.hasil_hubungan);

        String NIK = getIntent().getExtras().getString("NIK");
        String nama = getIntent().getExtras().getString("nama");
        String jeniskelamin = getIntent().getExtras().getString("jeniskelamin");
        String hubungan = getIntent().getExtras().getString("hubungan");

        txt1.setText(NIK);
        txt2.setText(nama);
        txt4.setText(jeniskelamin);
        txt5.setText(hubungan);
    }

    public void simpan(View view) {
        Button tutup;
        dialog.setContentView(R.layout.berhasil);

        tutup = dialog.findViewById(R.id.button4);
        tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
}