package com.example.ranijaiswal.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int flag = 4;

    TextView textView;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        Button button = (Button) findViewById(R.id.button12);

        textView = (TextView) findViewById(R.id.text12);
        textView.setText("Changed");

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();

                textView.setText("Changed");

                flag++;

            }

        });


        return true;
    }

}
