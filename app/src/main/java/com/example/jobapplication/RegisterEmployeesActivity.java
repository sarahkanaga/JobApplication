package com.example.jobapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;


public class RegisterEmployeesActivity extends AppCompatActivity
{
  private Button btnChooseImage;
  private static final int PICK_IMAGE_REQUEST = 1;
  private static final int CHOOSE_IMAGE = 10;
  private Uri chooseImageURI;
  private CircleImageView ciImage;
  private CheckBox myCheckBox;
    private Button btnSubmit;
  private EditText userFirstName, userSecondName, userName,
            userEmailAdress, userPhoneNumber1, userPhoneNumber2,
            userPassword, confirmUserPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_employees);

        userFirstName = (EditText) findViewById(R.id.firstname_id);
        userSecondName = (EditText) findViewById(R.id.secondname_id);
        userName = (EditText) findViewById(R.id.userName_id);
        userEmailAdress = (EditText) findViewById(R.id.UserEmailaddress_id);
        userPhoneNumber1 = (EditText) findViewById(R.id.mobilenumberLine1_id);
        userPhoneNumber2 = (EditText) findViewById(R.id.mobileNumberLine2_id);
        userPassword = (EditText) findViewById(R.id.userPassword);
        confirmUserPassword = (EditText) findViewById(R.id.userConfirmPassword);
        myCheckBox = (CheckBox)findViewById(R.id.checkBox_id) ;
        ciImage = (de.hdodenhof.circleimageview.CircleImageView) findViewById(R.id.ci_image_id);
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
            public void onClick(View view)
            {

                if (myCheckBox.isChecked())
                {

                    final  String firstName = userFirstName.getText().toString();
                    final  String secondName = userSecondName.getText().toString();
                    final String nameOfUser = userName.getText().toString();
                    final String emailAdress = userEmailAdress.getText().toString();
                    final String phoneNumber1 = userPhoneNumber1.getText().toString();
                    final String phoneNumber2 = userPhoneNumber2.getText().toString();
                    final String password = userPassword.getText().toString();
                    final String confirmPassword = confirmUserPassword.getText().toString();




                }
                else
                {
                    Toast.makeText(RegisterEmployeesActivity.this, "Please accept terms of use",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });


   }

    private void nextMethod() {
    }


    private void chooseImage()
    {
        Intent chooseImageIntent = new Intent();
        chooseImageIntent.setType("image/*");
        chooseImageIntent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(chooseImageIntent,PICK_IMAGE_REQUEST);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        //setting a validation to ensure the user takes an image

        if (requestCode == PICK_IMAGE_REQUEST)
        {
            if (resultCode == RESULT_OK)
            {
                if (data != null)
                {
                    if (data.getData()!= null)
                    {
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
