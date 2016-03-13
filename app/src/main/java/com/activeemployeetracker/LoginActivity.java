package com.activeemployeetracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Harsh on 3/13/2016.
 */
public class LoginActivity extends AppCompatActivity {

    EditText login, password, company;
    Button btnlogin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);
        company = (EditText) findViewById(R.id.company);
        btnlogin = (Button) findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String logintext = login.getText().toString(),
                        passwordtext = password.getText().toString(),
                        companytext = company.getText().toString();
                if(logintext.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter all details", Toast.LENGTH_LONG).show();
                } else if (passwordtext.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter all details", Toast.LENGTH_LONG).show();
                } else if (companytext.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter all details", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Cool", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
