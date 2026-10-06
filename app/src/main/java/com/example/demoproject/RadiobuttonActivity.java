package com.example.demoproject;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RadiobuttonActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton r1,r2,r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_radiobutton);

        r1 = findViewById(R.id.radio1);
        r2 = findViewById(R.id.radio2);
        r3 = findViewById(R.id.radio3);

        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
    }
    public void onClick(View v) {

        StringBuffer res = new StringBuffer("Programming: ");

        if (r1.isChecked())
            res.append("Java ");

        if (r2.isChecked())
            res.append("Kotlin ");

        if (r3.isChecked())
            res.append("Swift ");

        Toast.makeText(this, res.toString(), Toast.LENGTH_LONG).show();
    }
}