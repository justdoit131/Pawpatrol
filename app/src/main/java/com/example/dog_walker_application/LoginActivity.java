package com.example.dog_walker_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText etFirstName, etLastName, etAddress, etPhone, etEmail, etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        etAddress = findViewById(R.id.etAddress);
        etPhone = findViewById(R.id.etPhone);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etFirstName.getText().toString().isEmpty() ||
                        etLastName.getText().toString().isEmpty() ||
                        etAddress.getText().toString().isEmpty() ||
                        etPhone.getText().toString().isEmpty() ||
                        etEmail.getText().toString().isEmpty() ||
                        etPassword.getText().toString().isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Send user details to MainActivity
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("firstName", etFirstName.getText().toString());
                    intent.putExtra("lastName", etLastName.getText().toString());
                    intent.putExtra("email", etEmail.getText().toString());
                    startActivity(intent);
                    finish(); // Close login screen
                }
            }
        });
    }

}
