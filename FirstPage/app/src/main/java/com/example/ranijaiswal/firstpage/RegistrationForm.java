package com.example.ranijaiswal.firstpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegistrationForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);
    }

    public void submitClicked(View view)
    {
        Intent intent = new Intent(this, SubmitThankyou.class);
        startActivity(intent);
    }
}
