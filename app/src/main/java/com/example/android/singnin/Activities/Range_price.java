package com.example.android.singnin.Activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.android.singnin.Adapters.Worker;
import com.example.android.singnin.Adapters.WorkerAdapter;
import com.example.android.singnin.R;
import com.example.android.singnin.nearest.nesrest;

import java.util.ArrayList;


public class Range_price extends AppCompatActivity {

    Button conslt;
    private RecyclerView mrecyclerView;
    private WorkerAdapter madapter;
    private RecyclerView.LayoutManager mlayoutManager;
    ArrayList<Worker> workers ;
    int id ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_range_price);
        conslt=(Button)findViewById(R.id.conslt);
        final Intent intent =getIntent();
        id=intent.getIntExtra("servestype",-1);

                if(id !=4) {
                    mec();
                    bulidRecyclerView();


                }
                else {
                    Wench();
                    bulidRecyclerView2();

                }


                conslt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 =new Intent(Intent.ACTION_DIAL);
                        intent1.setData(Uri.parse("tel:"));
                        startActivity(intent1);

                    }
                });

            }
    public void Wench() {
        workers = new ArrayList<Worker>();
        workers.add(new Worker(R.drawable.per,R.drawable.rat3, "01154542144", "ونش الطيب"));
        workers.add(new Worker(R.drawable.per,R.drawable.rat111, "01001235364", "عبد الرحيم عثمان"));
        workers.add(new Worker(R.drawable.per,R.drawable.rat111, "01517282389", "حماده زيدان"));
        workers.add(new Worker(R.drawable.per,R.drawable.rat3, "01144553829", "حسن "));
        workers.add(new Worker(R.drawable.per,R.drawable.rat3, "01517621761", "جمال شنب "));
    }




    public void mec()

    {
        workers= new ArrayList<Worker>();

        workers.add(new Worker(R.drawable.recest,"جنيه(50 - 60)", "فصل بطارية العربية"));
        workers.add(new Worker(R.drawable.recest,"جنيه( 600- 500)", "قطع سير الكاتينة(عند الورشة)"));
        workers.add(new Worker(R.drawable.recest,"جنيه(40-50)", "تسريب خراطيم الياه"));
        workers.add(new Worker(R.drawable.recest,"جنيه( 30-40 )", "تسريب في الزيت او الطبه"));
        workers.add(new Worker(R.drawable.recest,"جنيه(50 - 60)", "الموبينه بتفصل"));
        workers.add(new Worker(R.drawable.recest,"جنيه(60 - 70)", "المارش بيفصل"));

    }
    public void bulidRecyclerView(){
        mrecyclerView =(RecyclerView)findViewById(R.id.recycler_view2);
        mrecyclerView.setHasFixedSize(true);
        mlayoutManager=new LinearLayoutManager(this);
        madapter=new WorkerAdapter(workers);
        mrecyclerView.setLayoutManager(mlayoutManager);
        mrecyclerView.setAdapter(madapter);

        madapter.setmOnItemClicKListner(new WorkerAdapter.OnItemClicKListner() {
            @Override
            public void OnItemClick(int position) {
                Toast.makeText(Range_price.this,"تم الدفع بنجاح" +
                        "قم بأختيار الحرفي ",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Range_price.this,nesrest.class);
                intent.putExtra("servestype",position);
                startActivity(intent);
            }
        });
    }
    public void bulidRecyclerView2() {
        mrecyclerView = (RecyclerView) findViewById(R.id.recycler_view2);
        mrecyclerView.setHasFixedSize(true);
        mlayoutManager = new LinearLayoutManager(this);
        madapter = new WorkerAdapter(workers);
        mrecyclerView.setLayoutManager(mlayoutManager);
        mrecyclerView.setAdapter(madapter);

        madapter.setmOnItemClicKListner(new WorkerAdapter.OnItemClicKListner() {
            @Override
            public void OnItemClick(int position) {
                Intent intent1 =new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:01154542144"));
                startActivity(intent1);
            }
        });

    }
}
