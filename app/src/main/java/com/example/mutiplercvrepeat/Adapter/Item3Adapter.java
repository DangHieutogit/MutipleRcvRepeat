package com.example.mutiplercvrepeat.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mutiplercvrepeat.R;

import java.util.List;

public class Item3Adapter extends RecyclerView.Adapter<Item3Adapter.Item3ViewHolder> {

    private List<Integer> imageList;
    public Item3Adapter(List<Integer> imageList){
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public Item3ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item3,parent,false);


        return new Item3ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Item3ViewHolder holder, int position) {
        holder.mImageView.setImageResource(imageList.get(position));
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public class Item3ViewHolder extends RecyclerView.ViewHolder{
        private ImageView mImageView;

        public Item3ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.offer);
        }
    }


}
