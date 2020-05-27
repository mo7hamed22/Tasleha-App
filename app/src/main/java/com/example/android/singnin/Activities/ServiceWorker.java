package com.example.android.singnin.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.singnin.Adapters.Worker;
import com.example.android.singnin.Adapters.WorkerAdapter;
import com.example.android.singnin.R;
import com.example.android.singnin.nearest.nesrest;

import java.util.ArrayList;


public class ServiceWorker extends AppCompatActivity {
    private RecyclerView mrecyclerView;
    private WorkerAdapter madapter;
    private RecyclerView.LayoutManager mlayoutManager;
    ArrayList<Worker> workers ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_worker);
        cretesimplelist();
        bulidRecyclerView();


    }

    public void cretesimplelist()

    {
        workers= new ArrayList<Worker>();

        workers.add(new Worker(R.drawable.per, "ميكانيكي"));
        workers.add(new Worker(R.drawable.per, "كهربائي"));
        workers.add(new Worker(R.drawable.per, "كاوتش"));
        workers.add(new Worker(R.drawable.per, "بنزين"));
        workers.add(new Worker(R.drawable.per, "ونش"));
    }
    public void bulidRecyclerView(){
        mrecyclerView =(RecyclerView)findViewById(R.id.recycler_view);
        mrecyclerView.setHasFixedSize(true);
        mlayoutManager=new LinearLayoutManager(this);
        madapter=new WorkerAdapter(workers);
        mrecyclerView.setLayoutManager(mlayoutManager);
        mrecyclerView.setAdapter(madapter);

        madapter.setmOnItemClicKListner(new WorkerAdapter.OnItemClicKListner() {
            @Override
            public void OnItemClick(int position) {
                Intent intent=new Intent(ServiceWorker.this,Range_price.class);
                intent.putExtra("servestype",position);
                startActivity(intent);
            }
        });
    }
}


