package com.example.post_volley;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.lang.String;

public class MainActivity extends AppCompatActivity {
    EditText email;
    Button submit;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=findViewById(R.id.email);

        submit=findViewById(R.id.submit);


    }

    public void submit_data (View v)
    {

        data = email.getText().toString();
        Intent intent = new Intent(this,activity_response.class);
        intent.putExtra("email",data);
        startActivity(intent);
    }
}
