package com.example.jobapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DetailsActivity extends AppCompatActivity {

    private EditText etUserName;
    private EditText etPassword;
   private Button btSignIh;

    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;



   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


       databaseReference = FirebaseDatabase.getInstance().getReference("house");

        etUserName = (EditText)findViewById(R.id.et_user_name_id);
        etPassword = (EditText)findViewById(R.id.et_password_id);
        btSignIh = (Button)findViewById(R.id.bt_login_id);

        btSignIh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn();

            }
        });
   }

   public void signIn(){
       String userName = etUserName.getText().toString();
       String password = etPassword.getText().toString();

       if (!TextUtils.isEmpty(userName) && !TextUtils.isEmpty(password)){
           String id = databaseReference.push().getKey();

           House house = new House(id,userName,password);
           databaseReference.child(id).setValue(house);
           etUserName.setText("");
           etPassword.setText("");


       }
       else{
           Toast.makeText(this, "fill in the details", Toast.LENGTH_SHORT).show();
       }


   }
}
