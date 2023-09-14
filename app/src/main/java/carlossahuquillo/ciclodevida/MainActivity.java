package carlossahuquillo.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSiguienteMain;
    Button btnBotonMostrarMain;
    EditText txtEscribirMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ESTADOS", "1 - Estoy en onCreate");

        inicializarVistas();

        btnSiguienteMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                startActivity(intent);
            }
        });

        btnBotonMostrarMain.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String texto = String.valueOf(txtEscribirMain.getText());

                Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG).show();

                txtEscribirMain.setHint("Escribir...");
            }
        });
    }

    private void inicializarVistas() {
        btnSiguienteMain = findViewById(R.id.btnSiguienteMain);
        btnBotonMostrarMain = findViewById(R.id.btnBotonMostrarMain);
        txtEscribirMain = findViewById(R.id.txtEscribirMain);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS", "6 - Estoy en onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS", "2 - Estoy en onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS", "4 - Estoy en onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS", "3 - Estoy en onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS", "5 - Estoy en onStop");
    }
}