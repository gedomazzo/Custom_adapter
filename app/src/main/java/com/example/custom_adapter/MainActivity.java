package com.example.custom_adapter;

import android.os.Bundle;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    String[] cate = {"super heroes", "worker", "animals"};
    Costumes[] costumes = {
            new Costumes("cat girl", R.drawable.cat_woman, 3, cate[0]),
            new Costumes("shark", R.drawable.shark, 5, cate[2]),
            new Costumes("superman", R.drawable.superman, 2, cate[0]),
            new Costumes("spiderman", R.drawable.spiderman, 4, cate[0]),
            new Costumes("bear", R.drawable.bear, 4, cate[2]),
            new Costumes("wood worker", R.drawable.woodworker, 5, cate[1]),
            new Costumes("doctor", R.drawable.doctor, 4, cate[1]),};

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