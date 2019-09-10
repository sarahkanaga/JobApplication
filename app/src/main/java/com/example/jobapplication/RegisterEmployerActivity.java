package com.example.jobapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import de.hdodenhof.circleimageview.CircleImageView;

public class RegisterEmployerActivity extends AppCompatActivity
{

    private Button btnChooseImage;
    private static final int PICK_IMAGE_REQUEST = 1;
    private static final int CHOOSE_IMAGE = 10;
    private Uri chooseImageURI;
    private CircleImageView ciImage;
    private Button btnSubmit;
    private CheckBox myCheckBox;
    private EditText userFirstName, userSecondName, userName,
            userEmailAdress, userPhoneNumber1, userPhoneNumber2,
            userPassword, confirmUserPassword;

            DatabaseReference databaseReference;
            FirebaseDatabase firebaseDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_employer);


        databaseReference = FirebaseDatabase.getInstance().getReference("job");



        ciImage = (de.hdodenhof.circleimageview.CircleImageView) findViewById(R.id.ci_image_id);
        userFirstName = (EditText) findViewById(R.id.firstname_id);
        userSecondName = (EditText) findViewById(R.id.secondname_id);
        userName = (EditText) findViewById(R.id.userName_id);
        userEmailAdress = (EditText) findViewById(R.id.UserEmailaddress_id);
        userPhoneNumber1 = (EditText) findViewById(R.id.mobilenumberLine1_id);
        userPhoneNumber2 = (EditText) findViewById(R.id.mobileNumberLine2_id);
        userPassword = (EditText) findViewById(R.id.userPassword);
        confirmUserPassword = (EditText) findViewById(R.id.userConfirmPassword);
        myCheckBox = (CheckBox)findViewById(R.id.checkBox_id) ;
        btnChooseImage = (Button) findViewById(R.id.btn_chooseImageId);
        btnChooseImage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                chooseImage();
            }
        });

        btnSubmit = (Button)findViewById(R.id.btn_submit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){



                if (myCheckBox.isChecked())
                {



                    //*** setting a validation to ensure that the user doesn't leave any blank space

                }
                else
                {
                    Toast.makeText(RegisterEmployerActivity.this, "Please accept terms of use",
                            Toast.LENGTH_SHORT).show();
                }



                }
        }) ; next();




    }
    public void next(){

        final  String firstName = userFirstName.getText().toString();
        final  String secondName = userSecondName.getText().toString();
        final String nameOfUser = userName.getText().toString();
        final String emailAdress = userEmailAdress.getText().toString();



        if (!TextUtils.isEmpty(firstName) && !TextUtils.isEmpty(secondName)){

            String id = databaseReference.push().getKey();

            Help help = new Help(id,userFirstName,userSecondName,userName,
                    emailAdress);
            databaseReference.child(id).setValue(help);
            userFirstName.setText("");
            userSecondName.setText("");
            userName.setText("");
            userEmailAdress.setText("");

        }



        else
            Toast.makeText(this, "first name and second name cannot be empty", Toast.LENGTH_SHORT).show();


    }



    private void chooseImage()
    {
        Intent chooseImageIntent = new Intent();
        chooseImageIntent.setType("image/*");
        chooseImageIntent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(chooseImageIntent,PICK_IMAGE_REQUEST);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //setting a validation to ensure the user takes an image

        if (requestCode == PICK_IMAGE_REQUEST) {
            if (resultCode == RESULT_OK) {
                if (data != null) {
                    if (data.getData() != null) {
                        /**
                         * If the condition is true this code will load the image
                         */

                        chooseImageURI = data.getData();
                        ciImage.setImageURI(chooseImageURI);

                    }
                }
            }

        }

}





}


