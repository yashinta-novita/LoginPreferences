package com.example.aplikasikrs.Sigin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aplikasikrs.Admin.AdminHome;
import com.example.aplikasikrs.Admin.DosenHome;
import com.example.aplikasikrs.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getSupportActionBar().hide();

        Button btnSignIn = (Button)findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AdminHome.class);
                startActivity(intent);
            }
        });

        Button btnSignInMhs = (Button)findViewById(R.id.btnSignInDosen);
        btnSignInMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DosenHome.class);
                startActivity(intent);
            }
        });
    }
}
