package com.example.jobapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class communicationActivity extends AppCompatActivity
{
    private Button btShowDialog;
    private Button mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);

        Button btShowDialog = (Button)findViewById(R.id.bt_show_dialog_id);
        mLogin = (Button)findViewById(R.id.bt_login_id) ;

        btShowDialog.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {



            }
        });

        mLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

            }
        });
    }
}
