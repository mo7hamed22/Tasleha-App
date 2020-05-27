package com.example.android.singnin.Activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.singnin.R;

public class Category extends AppCompatActivity {

    Button documentation ,categories,conslt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        categories =(Button)findViewById(R.id.categories);
        conslt =(Button)findViewById(R.id.consaltant);


        categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Category.this,ServiceWorker.class);
                startActivity(intent);
            }
        });

        conslt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 =new Intent(Intent.ACTION_DIAL);
                intent3.setData(Uri.parse("tel:01154542144"));
                startActivity(intent3);
            }
        });
    }
}
