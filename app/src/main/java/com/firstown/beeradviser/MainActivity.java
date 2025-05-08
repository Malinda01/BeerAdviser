package com.firstown.beeradviser;

import static android.widget.Toast.makeText;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // Corrected method signature
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

//    New Custom function
    public void clickMeButton(View v) {
        Spinner selectColor = findViewById(R.id.colors);
//        Button btnClick = findViewById(R.id.btnclick);
        TextView txtRecommendation = findViewById(R.id.recommendBeer);
//        Toast.makeText(this, selectColor.getSelectedItem().toString(), Toast.LENGTH_LONG).show();

        BeerExpert beerExpert = new BeerExpert();
        List<String> recommendedBeer = beerExpert.recommendBeer(selectColor.getSelectedItem().toString());
        StringBuilder finalRecommendations = new StringBuilder();

        for (String beer : recommendedBeer) {
            finalRecommendations.append(beer+"\n");
        };

        txtRecommendation.setText(finalRecommendations.toString());
    }


}