package id.go.kominfo.dts.vsga.hasan.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null)
            setTitle("Mobile Application");

        EditText etNama = findViewById(R.id.etNama);
        Button btTampil = findViewById(R.id.btTampilkan);

        btTampil.setOnClickListener(v -> {
            Toast.makeText(this, "Selamat Datang " +
                    etNama.getText().toString(), Toast.LENGTH_SHORT).show();
        });
    }
}