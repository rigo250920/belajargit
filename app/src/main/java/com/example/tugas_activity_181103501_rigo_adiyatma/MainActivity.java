package com.example.tugas_activity_181103501_rigo_adiyatma;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button buttonlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username= (EditText)  findViewById(R.id.editUsername);
        password= (EditText)  findViewById(R.id.editPassword);
        buttonlogin = (Button) findViewById(R.id.buttonLoogin);

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if(usernameKey.equals("rigo")&& passwordKey.equals("123")){
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                } else{
                    AlertDialog.Builder builder = new AlertDialog.Builder( MainActivity.this);
                    builder.setMessage("username atau password ande salah")
                            .setNegativeButton("Retry",null).create().show();
                }
            }
        });
    }
}