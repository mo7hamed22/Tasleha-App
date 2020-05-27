package com.example.android.singnin.Activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.singnin.R;


public class profiles extends AppCompatActivity {

    Button send;
    EditText btn ;
    TextView call ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profiles);
        send =(Button)findViewById(R.id.send);
        btn =(EditText)findViewById(R.id.stext);
        send .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(profiles.this,"شكرا لارسال رئيك .",Toast.LENGTH_LONG).show();
             send = null;
            }
        });
        call.callOnClick();

    }
    private void calling(){

        Intent intent3 =new Intent(Intent.ACTION_DIAL);
        intent3.setData(Uri.parse("tel:01154542144"));
        startActivity(intent3);
    }
}
