package com.example.sagar.loginandsignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    EditText name,email,password;
    Button signUp;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        signUp = findViewById(R.id.signUp);
        progressBar = findViewById(R.id.progressBar);
    }
}
