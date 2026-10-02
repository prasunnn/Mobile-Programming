package com.example.demoproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    TextView t3;
    Button b1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.calculator_app);
        t1=findViewById(R.id.txtfirstnumber);
        t2=findViewById(R.id.txtsecondnumber);
        t3 = findViewById(R.id.txtsum);
        b1=findViewById(R.id.btnadd);

        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.absolute_ex);
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
          //  Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            //v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            //return insets;
        //});
    }
    public void showInfo(View V){
        String num1 = t1.getText().toString();
        String num2 = t2.getText().toString();
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int sum = a+b;
        t3.setText("Sum is "+ sum);
    }
}