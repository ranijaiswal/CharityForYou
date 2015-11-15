package com.example.ranijaiswal.firstpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_first_page);
    }

    public void donorClicked(View view)
    {
        Intent intent;
        intent = new Intent(this, FBPrompt.class);
        startActivity(intent);
    }

    public void organizationClicked(View view)
    {
        Intent intent = new Intent(this, RegistrationForm.class);
        startActivity(intent);
    }
}
