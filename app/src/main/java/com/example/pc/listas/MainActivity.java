package com.example.pc.listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    ListView lstCiudades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adaptadorCiudades = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item);
        lstCiudades = findViewById(R.id.lstCiudades);
        lstCiudades.setAdapter(adaptadorCiudades);

        lstCiudades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("MyApp", "Tienes Seleccionado la poscion: "+ position + "La ciudad es: " +lstCiudades.getItemIdAtPosition(position));
            }
        });
    }
}
