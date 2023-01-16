package com.example.reg;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        editText = (EditText) findViewById(R.id.login);
        Button start = (Button) findViewById(R.id.btn_start);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    intent.putExtra("name", editText.getText().toString());
                    startActivity(intent);
                } catch (Exception e) {
                }
            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}