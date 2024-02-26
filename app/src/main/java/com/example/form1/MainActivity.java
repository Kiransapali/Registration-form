package com.example.form1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
 private static final String TAG= "MainActivity";
 private EditText editTextName,editTextEmail,editTextPassword,editTextPasswordRepeat;
 private Button btnPickImg,btnRegister;
 private TextView aggrementText,textwarnName ,textwarnEmail,textwarnposs,textwarnrepitPoss,textViewCountry,textViewGender;
 private Spinner spinnerCounry;
 private RadioGroup rbGender;
    private CheckBox aggremetCheck;

    private ConstraintLayout Parent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        btnPickImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "yet to tak about", Toast.LENGTH_SHORT).show();
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               initRigister();
            }
        });
    }
    private  void initRigister(){
        Log.d(TAG,"initRigstrer:Started");


        if(validateData()){
            if (aggremetCheck.isChecked()) {
                showSnakBar();
                
            }else {
                Toast.makeText(this, "you need to agree the licence", Toast.LENGTH_SHORT).show();
            }
            }

        }
        private void showSnakBar(){
        Log.d(TAG,"SnakBar started");
        textwarnName.setVisibility(View.GONE);
        textwarnEmail.setVisibility(View.GONE);
        textwarnposs.setVisibility(View.GONE);
        textwarnrepitPoss.setVisibility(View.GONE);


            Snackbar.make(Parent,"user registered", BaseTransientBottomBar.LENGTH_INDEFINITE)
            .setAction("dismiss", new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            }).show();
        }


    private boolean validateData(){
        Log.d(TAG,"started");
        if(editTextName.getText().toString().equals("")){
            textwarnName.setText("Enter your Name");
            textwarnName.setVisibility(View.VISIBLE);
            return false;

        }
            if (editTextEmail.getText().toString().equals("")){
                textwarnName.setText("Enter your Email");

                textwarnEmail.setVisibility(View.VISIBLE);
                return false;
            }
        if (editTextPassword.getText().toString().equals("")){
            textwarnposs.setText("Enter your posssword");

            textwarnposs.setVisibility(View.VISIBLE);
            return false;
        }
        if (editTextPasswordRepeat.getText().toString().equals("")){
            textwarnrepitPoss.setText("Enter Your repeatePossword");

            textwarnrepitPoss.setVisibility(View.VISIBLE);
            return false;
        }
        return  true;
    }

    private  void  initViews(){

    }
}
