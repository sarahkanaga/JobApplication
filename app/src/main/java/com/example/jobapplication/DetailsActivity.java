package com.example.jobapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailsActivity extends AppCompatActivity {

    private EditText etUserName;
    private EditText etPassword;
    private Button btNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        etUserName = (EditText)findViewById(R.id.et_user_name_id);
        etPassword = (EditText)findViewById(R.id.et_password_id);
        btNext = (Button)findViewById(R.id.bt_next_id);

        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextIntent = new Intent(getApplicationContext(),SubmitActivity.class);
                startActivity(nextIntent);
            }
        });
    }
}
