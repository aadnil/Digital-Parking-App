package com.android.digitalparking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginForm extends AppCompatActivity {
    EditText username, password;
    Button loginbtn, registerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        loginbtn=findViewById(R.id.loginbtn);
        registerbtn=findViewById(R.id.registerbtn);

        

    }
}
