package com.example.sagar.loginandsignup;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText email,password;
    Button login;
    ProgressBar progressBar;
    TextView questions;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questions = findViewById(R.id.questions);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        progressBar = findViewById(R.id.progressBar);


        //code for questions and going to signup activity
        String signup = "Don't have an account?  Sign Up ";
        SpannableString ss = new SpannableString(signup);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                startActivity(new Intent(MainActivity.this,SignUp.class));
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.rgb(33,228,60));
                ds.setUnderlineText(false);
            }
        };

        ss.setSpan(clickableSpan1, 23, 31,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        questions.setText(ss);
        questions.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
