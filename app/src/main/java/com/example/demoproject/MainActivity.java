package com.example.demoproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    Button b1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.constraintlayout_ex);
        t1=findViewById(R.id.txteditusername);
        t2=findViewById(R.id.txteditpassword);
        b1=findViewById(R.id.login);

        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.absolute_ex);
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
          //  Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            //v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            //return insets;
        //});
    }
    public void showInfo(View V){
        String uname = t1.getText().toString();
        String upass = t2.getText().toString();
        Toast.makeText(getApplicationContext(), "Username = "+ uname + "\nPassword = "+ upass, Toast.LENGTH_LONG).show();
    }
}