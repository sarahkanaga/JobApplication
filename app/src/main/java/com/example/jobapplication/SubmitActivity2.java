package com.example.jobapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubmitActivity2 extends AppCompatActivity {

    private Button btNext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit2);


        btNext2 = (Button)findViewById(R.id.bt_next2_id);
        btNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNext2 = new Intent(getApplicationContext(),RegisterEmployerActivity.class);
                startActivity(intentNext2);
            }
        });
    }
}
