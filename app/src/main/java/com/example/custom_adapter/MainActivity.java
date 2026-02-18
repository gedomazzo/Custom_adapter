package com.example.custom_adapter;

import android.os.Bundle;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Costumes[] costumes = {new Costumes("name1"), new Costumes("name2")};

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CostumeAdapter costumeAdapter = new CostumeAdapter(this, costumes);

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(costumeAdapter);

    }
}