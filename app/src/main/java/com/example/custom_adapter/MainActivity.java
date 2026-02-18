package com.example.custom_adapter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
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
    TextView desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CostumeAdapter costumeAdapter = new CostumeAdapter(this, costumes);

        desc = (TextView) findViewById(R.id.desc);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(costumeAdapter);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            desc.setText("A sleek, black catsuit costume, often including a cat-ear cowl and a whip. It's designed for stealth and agility.");
        } else if (position == 1) {
            desc.setText("A fun and fearsome shark costume, typically a one-piece suit with a fin on the back and a hood with felt teeth.");
        } else if (position == 2) {
            desc.setText("The classic blue and red Superman suit, featuring the iconic 'S' shield on the chest and a flowing red cape.");
        } else if (position == 3) {
            desc.setText("A detailed red and blue suit with a web pattern. This costume includes a full face mask with expressive eyes.");
        } else if (position == 4) {
            desc.setText("A warm and fuzzy full-body bear suit. This comfortable costume is made of soft, brown faux fur and includes a hood with bear ears.");
        } else if (position == 5) {
            desc.setText("A rugged woodworker outfit, usually consisting of a plaid flannel shirt, a tool belt with plastic tools, and a hard hat.");
        } else if (position == 6) {
            desc.setText("A professional-looking doctor's costume, featuring a white lab coat, a toy stethoscope, and sometimes a surgical mask.");
        }
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    
    }

}
