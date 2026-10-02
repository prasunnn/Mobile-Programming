package com.example.demoproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EventActivity extends AppCompatActivity implements View.OnClickListener {

    EditText t1,t2;
    Button btn;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_event);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        t1=findViewById(R.id.fnum);
        t2=findViewById(R.id.snum);
        btn=findViewById(R.id.btnadd);
        res=findViewById(R.id.txtresult);

        btn.setOnClickListener(this);
    }
    public void onClick(View V){
        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());
        int s = n1 + n2;
        res.setText("Sum of "+ n1 + " and " + n2 + " = " + s);
    }
}