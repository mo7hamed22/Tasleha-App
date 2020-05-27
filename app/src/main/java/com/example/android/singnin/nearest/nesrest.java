package com.example.android.singnin.nearest;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.android.singnin.Activities.Range_price;
import com.example.android.singnin.Activities.profiles;
import com.example.android.singnin.Adapters.Worker;
import com.example.android.singnin.Adapters.WorkerAdapter;
import com.example.android.singnin.R;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class nesrest extends AppCompatActivity {


    int id;
    private RecyclerView mrecyclerView;
    private WorkerAdapter madapter;
    private RecyclerView.LayoutManager mlayoutManager;
    ArrayList<Worker> workers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nesrest);
        //get id
        Intent intent = getIntent();
        id = intent.getIntExtra("id", -1);
        if (id != 4) {
            nearset();
            bulidRecyclerView();



        } else {

            Wench();
            bulidRecyclerView();


        }


    }

    public void nearset()

    {
        workers = new ArrayList<Worker>();

        workers = new ArrayList<Worker>();
        workers.add(new Worker(R.drawable.per,R.drawable.rat3, "01154542144", "ونش الطيب"));
        workers.add(new Worker(R.drawable.per,R.drawable.rat111, "01001235364", "عبد الرحيم عثمان"));
        workers.add(new Worker(R.drawable.per,R.drawable.rat111, "01517282389", "حماده زيدان"));
        workers.add(new Worker(R.drawable.per,R.drawable.rat3, "01144553829", "حسن "));
        workers.add(new Worker(R.drawable.per,R.drawable.rat3, "01517621761", "جمال شنب "));
    }

    public void Wench() {
        workers = new ArrayList<Worker>();
        workers.add(new Worker(R.drawable.per,R.drawable.rat3, "01154542144", "ونش الطيب"));
        workers.add(new Worker(R.drawable.per,R.drawable.rat111, "01001235364", "عبد الرحيم عثمان"));
        workers.add(new Worker(R.drawable.per,R.drawable.rat111, "01517282389", "حماده زيدان"));
        workers.add(new Worker(R.drawable.per,R.drawable.rat3, "01144553829", "حسن "));
        workers.add(new Worker(R.drawable.per,R.drawable.rat3, "01517621761", "جمال شنب "));
    }

    public void bulidRecyclerView() {
        mrecyclerView = (RecyclerView) findViewById(R.id.recycler_view3);
        mrecyclerView.setHasFixedSize(true);
        mlayoutManager = new LinearLayoutManager(this);
        madapter = new WorkerAdapter(workers);
        mrecyclerView.setLayoutManager(mlayoutManager);
        mrecyclerView.setAdapter(madapter);

        madapter.setmOnItemClicKListner(new WorkerAdapter.OnItemClicKListner() {
            @Override
            public void OnItemClick(int position) {
                Intent intent = new Intent(nesrest.this,profiles.class);
                intent.putExtra("servestype", position);
                startActivity(intent);
            }
        });

    }
    public void bulidRecyclerView2() {
        mrecyclerView = (RecyclerView) findViewById(R.id.recycler_view3);
        mrecyclerView.setHasFixedSize(true);
        mlayoutManager = new LinearLayoutManager(this);
        madapter = new WorkerAdapter(workers);
        mrecyclerView.setLayoutManager(mlayoutManager);
        mrecyclerView.setAdapter(madapter);

        madapter.setmOnItemClicKListner(new WorkerAdapter.OnItemClicKListner() {
            @Override
            public void OnItemClick(int position) {
                Intent intent1 =new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("01154542144"));
                startActivity(intent1);
            }
        });

    }
}




