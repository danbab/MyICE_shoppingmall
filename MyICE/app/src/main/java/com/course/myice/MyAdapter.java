package com.course.myice;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    private Intent intent;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView myPicture;
        TextView myText;

        MyViewHolder(View view) {
            super(view);
            myPicture = view.findViewById(R.id.imageView);
            myText = view.findViewById(R.id.textView);
        }
    }
    private ArrayList<Stuffs> myStuffList;
    MyAdapter(ArrayList<Stuffs> stuffs){
        this.myStuffList = stuffs;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(v);
    }
    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, final int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.myPicture.setImageResource(myStuffList.get(position).getImageID());
        myViewHolder.myText.setText(myStuffList.get(position).getMD_name());
        myViewHolder.myPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(v.getContext(), MainActivity2.class);
                intent.putExtra("number", position);
                /*intent.putExtra("title",itemList.get(position).getItem_title());*/
                v.getContext().startActivity(intent);
            }
        });
        myViewHolder.myText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                intent = new Intent(v.getContext(), MainActivity2.class);
                intent.putExtra("number", position);
                /*intent.putExtra("title",itemList.get(position).getItem_title());*/
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return myStuffList.size();
    }


}
