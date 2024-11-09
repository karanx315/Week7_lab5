package com.example.week7_lab5;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText passwordInput;
    private TextView resultText;
    private Button validateButton;
    private PasswordValidator passwordValidator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passwordInput = findViewById(R.id.passwordInput);
        resultText = findViewById(R.id.resultText);
        validateButton = findViewById(R.id.validateButton);
        passwordValidator = new PasswordValidator();

        validateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = passwordInput.getText().toString();
                if (TextUtils.isEmpty(password)) {
                    resultText.setText("Please enter a password.");
                    return;
                }
                if (passwordValidator.isValidPassword(password)) {
                    resultText.setText("Password is valid.");
                } else {
                    resultText.setText("Password is invalid.");
                }
            }
        });
    }
}

