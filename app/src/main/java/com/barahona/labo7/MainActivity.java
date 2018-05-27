package com.barahona.labo7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.barahona.labo7.Entidades.DBHelper;
import com.barahona.labo7.R;

public class MainActivity extends AppCompatActivity {

    private Button btn_registrar, btn_consultar, btn_consultarS, btn_consultarLv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    inicializarControles();
        DBHelper.getInstance(this);

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), registrar.class);
                startActivity(intent);
            }
        });
        btn_consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), modificar.class);
                startActivity(intent);
            }
        });
    }

    public void inicializarControles(){
        btn_registrar = findViewById(R.id.registrar_usuario);
        btn_consultar = findViewById(R.id.consultar_usuario);
    }
}
