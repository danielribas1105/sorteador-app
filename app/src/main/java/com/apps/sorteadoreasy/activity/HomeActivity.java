package com.apps.sorteadoreasy.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.apps.sorteadoreasy.R;

import java.util.Random;

public class HomeActivity extends AppCompatActivity {
    
    private TextView numStart, numEnd, numRaffle;
    private Button btnRaffle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        numStart = findViewById(R.id.textNumberStart);
        numEnd = findViewById(R.id.textNumberEnd);
        numRaffle = findViewById(R.id.textNumberRaffle);
        btnRaffle = findViewById(R.id.btnStartRaffle);
        
        btnRaffle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = new Random().nextInt(11);
                numRaffle.setText("N" + x);
                Toast.makeText(HomeActivity.this, "Iniciar Sorteio", Toast.LENGTH_SHORT).show();
            }
        });
        
    }
    
}