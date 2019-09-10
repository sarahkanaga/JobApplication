package com.example.jobapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvJobs;
    private Button btHaveAccount;
    private Button btCreateAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvJobs = (TextView)findViewById(R.id.tv_jobs_id);

        btCreateAccount = (Button)findViewById(R.id.bt_creat_account_id);
        btCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(getApplicationContext(),SigninActivity.class);

                startActivity(loginIntent);

            }
        });

        btHaveAccount = (Button)findViewById(R.id.btn_already_account_id);
        btHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signInIntent = new Intent(getApplicationContext(),SigninActivity.class);
                startActivity(signInIntent);
            }
        });








    }
}
