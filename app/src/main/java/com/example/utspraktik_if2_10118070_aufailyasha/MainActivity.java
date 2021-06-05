package com.example.utspraktik_if2_10118070_aufailyasha;

//6 juni 2021
//10118070
//Aufa Ilyasha
//IF-2

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText input_nik;
    EditText input_nama;
    RadioGroup radio_group;
    RadioButton radioButton;
    RadioButton radioButton1;
    RadioGroup radio_group1;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;
    RadioButton radioButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_nik = findViewById(R.id.input_nik);
        input_nama = findViewById(R.id.input_nama);

        radio_group = findViewById(R.id.radio_group);
        radio_group1 = findViewById(R.id.radio_group1);
    }

    public void kirimdata(View view) {
        int idradio = radio_group.getCheckedRadioButtonId();
        radioButton1 = findViewById(idradio);

        int idradio1 = radio_group1.getCheckedRadioButtonId();
        radioButton6 = findViewById(idradio1);

        Intent i1 = new Intent(this,HasilActivity.class);
        i1.putExtra("NIK",input_nik.getText().toString());
        i1.putExtra("nama",input_nama.getText().toString());
        i1.putExtra("jeniskelamin",radioButton1.getText().toString());
        i1.putExtra("hubungan",radioButton6.getText().toString());
        startActivity(i1);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}