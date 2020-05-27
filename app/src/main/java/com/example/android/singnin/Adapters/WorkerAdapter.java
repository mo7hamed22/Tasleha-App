package com.example.android.singnin.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.android.singnin.R;

import java.util.ArrayList;


public class WorkerAdapter extends RecyclerView.Adapter<WorkerAdapter.workeviewHolder> {

    private ArrayList<Worker>mworkers;
    private OnItemClicKListner mOnItemClicKListner;

    public interface OnItemClicKListner{
        void OnItemClick(int position);
    }
    public void setmOnItemClicKListner(OnItemClicKListner listner)
    {
        mOnItemClicKListner=listner;
    }

    public static class workeviewHolder extends RecyclerView.ViewHolder{

        public ImageView mImageView;
        public TextView mTextView ,fTextView;
        public workeviewHolder(View itemView , final OnItemClicKListner listner) {
            super(itemView);
            mImageView =itemView.findViewById(R.id.item_image);
            mImageView =itemView.findViewById(R.id.rate);

            mTextView =itemView.findViewById(R.id.item_title);
            fTextView =itemView.findViewById(R.id.fixed);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listner !=null) {
                        int position =getAdapterPosition();

                    if (position != RecyclerView.NO_POSITION)
                        listner.OnItemClick(position);
                }}
            });
        }
    }
        public WorkerAdapter(ArrayList<Worker>workers){
        mworkers =workers;
        }
    @NonNull
    @Override
    public workeviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =LayoutInflater.from(parent.getContext()).inflate(R.layout.singleitem,parent,false);
        workeviewHolder mworkeviewHolder=new workeviewHolder(v,mOnItemClicKListner);
        return mworkeviewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull workeviewHolder holder, int position) {
        Worker currentWorker =mworkers.get(position);
        holder.mImageView.setImageResource(currentWorker.getWorker_img());
        holder.mImageView.setImageResource(currentWorker.getRateimge());

        holder.mTextView.setText(currentWorker.getCategory());
        holder.fTextView.setText(currentWorker.getFixedServece());



    }

    @Override
    public int getItemCount() {
        return mworkers.size();
    }




}
