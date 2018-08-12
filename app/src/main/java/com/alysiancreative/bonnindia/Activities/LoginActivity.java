package com.alysiancreative.bonnindia.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.alysiancreative.bonnindia.R;

public class LoginActivity extends AppCompatActivity {

    AppCompatButton login;
    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        login =  findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Please enter the username",Toast.LENGTH_SHORT).show();
                }else if(password.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Please enter the password",Toast.LENGTH_SHORT).show();
                }else if(username.getText().toString().trim().equals("admin") && password.getText().toString().trim().equals("admin123")){
                    Toast.makeText(getApplicationContext(),"Login Successfully",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
                }else{
                    Toast.makeText(getApplicationContext(),"Invalid Credential",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
