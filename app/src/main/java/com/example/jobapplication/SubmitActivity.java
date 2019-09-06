package com.example.jobapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubmitActivity extends AppCompatActivity {

    private Button btLogOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);


        btLogOut = (Button)findViewById(R.id.bt_log_out_id);
        btLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logoutIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(logoutIntent);
            }
        });
    }
}
