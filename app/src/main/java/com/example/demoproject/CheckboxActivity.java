package com.example.demoproject;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class CheckboxActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox c1, c2, c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_checkbox);

        c1 = findViewById(R.id.check1);
        c2 = findViewById(R.id.check2);
        c3 = findViewById(R.id.check3);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        StringBuffer res = new StringBuffer("Hobbies: ");

        if (c1.isChecked())
            res.append("Reading ");

        if (c2.isChecked())
            res.append("Playing Cricket ");

        if (c3.isChecked())
            res.append("Travelling ");

        Toast.makeText(this, res.toString(), Toast.LENGTH_LONG).show();
    }
}