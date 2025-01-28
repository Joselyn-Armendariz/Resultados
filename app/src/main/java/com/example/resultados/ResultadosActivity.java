package com.example.resultados;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.resultados.R;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadosActivity extends AppCompatActivity {

    private TextView tvGanador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityresultados);

        tvGanador = findViewById(R.id.tvResultado);
        Button btnRegresar = findViewById(R.id.btnRegresar);

        Intent intent = getIntent();
        String resultado = intent.getStringExtra("resultado");
        tvGanador.setText(resultado);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

