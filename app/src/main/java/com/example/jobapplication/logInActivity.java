package com.example.jobapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class logInActivity extends AppCompatActivity {
    private TextView tvLogin;
    private Button btEmployer;
    private Button btEmployee;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        tvLogin = (TextView) findViewById(R.id.tv_login_id);

        btEmployer = (Button) findViewById(R.id.btn_employer_id);
        btEmployer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent employerIntent = new Intent(logInActivity.this, SubmitActivity.class);
                startActivity(employerIntent);
            }
        });

        btEmployee = (Button) findViewById(R.id.btn_employee_id);
        btEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent employeesIntent = new Intent(getApplicationContext(), SubmitActivity2.class);
                startActivity(employeesIntent);

            }
        });








    }
}
