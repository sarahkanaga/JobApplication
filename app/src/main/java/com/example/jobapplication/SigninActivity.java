package com.example.jobapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SigninActivity extends AppCompatActivity {

    private TextView tvSignin;
    private Button btEmployer;
    private Button btEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        tvSignin = (TextView) findViewById(R.id.tv_sign_in_id);

        btEmployer = (Button)findViewById(R.id.bt_employers_id);
        btEmployer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent employersIntent = new Intent(getApplicationContext(),DetailsActivity.class);
                startActivity(employersIntent);
            }
        });


        btEmployee = (Button)findViewById(R.id.bt_employees_id);
        btEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent employeesIntent = new Intent(getApplicationContext(),DetailsActivity.class);
                startActivity(employeesIntent);
            }
        });


    }
}
