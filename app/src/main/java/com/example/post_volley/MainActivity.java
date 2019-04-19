package com.example.post_volley;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText email;
    Button submit;
    String data;

    String status;
    String message;
    RequestQueue MyRequestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=findViewById(R.id.email);

        submit=findViewById(R.id.submit);
        textView=findViewById(R.id.text);

    }

    public void submit_data (View v)
    {

        data = email.getText().toString();


            Intent intent = new Intent(this, activity_response.class);
            intent.putExtra("email",data);
            startActivity(intent);



    }


    }

