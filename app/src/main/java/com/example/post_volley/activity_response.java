package com.example.post_volley;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.String;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;



public class activity_response extends AppCompatActivity {


    TextView textView;
    RequestQueue MyRequestQueue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);


        textView=findViewById(R.id.text);
        Intent intent =getIntent();
        final String email=intent.getStringExtra("email");




        MyRequestQueue = Volley.newRequestQueue(this);

        String url = "http://theaweb.net/api/add_user.php";
        StringRequest MyStringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //This code is executed if the server responds, whether or not the response contains data.
                //The String 'response' contains the server's response.

                textView.setText("Response is: "+ response.substring(0,response.length()-0));

            }
        }, new Response.ErrorListener() { //Create an error listener to handle errors appropriately.
            @Override
            public void onErrorResponse(VolleyError error) {
                //This code is executed if there is an error.
                textView.setText("That didn't work!");
            }
        }) {
            protected Map<String, String> getParams() {
                Map<String, String> MyData = new HashMap<String, String>();
                MyData.put("email", email); //Add the data you'd like to send to the server.
                return MyData;
            }
        };

        MyRequestQueue.add(MyStringRequest);


    }


}
