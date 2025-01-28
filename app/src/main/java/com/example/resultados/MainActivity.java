package com.example.resultados;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etEquipoA, etGolesA, etEquipoB, etGolesB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEquipoA = findViewById(R.id.etEquipoA);
        etGolesA = findViewById(R.id.etGolesA);
        etEquipoB = findViewById(R.id.etEquipoB);
        etGolesB = findViewById(R.id.etGolesB);
        Button btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equipoA = etEquipoA.getText().toString();
                int golesA = Integer.parseInt(etGolesA.getText().toString());
                String equipoB = etEquipoB.getText().toString();
                int golesB = Integer.parseInt(etGolesB.getText().toString());

                String resultado;
                if (golesA > golesB) {
                    resultado = "Ganador: " + equipoA;
                } else if (golesB > golesA) {
                    resultado = "Ganador: " + equipoB;
                } else {
                    resultado = "Empate";
                }

                Intent intent = new Intent(MainActivity.this, ResultadosActivity.class);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });
    }
}
