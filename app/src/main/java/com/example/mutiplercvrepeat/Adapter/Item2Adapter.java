package com.example.mutiplercvrepeat.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mutiplercvrepeat.Model.Item2p10;
import com.example.mutiplercvrepeat.R;

import java.util.List;

public class Item2Adapter extends RecyclerView.Adapter<Item2Adapter.Item2ViewHolder> {

    private List<Item2p10> item2p10List;
    public Item2Adapter(List<Item2p10> item2p10List){
        this.item2p10List= item2p10List;
    }

    @NonNull
    @Override
    public Item2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item2,parent,false);

        return new Item2ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Item2ViewHolder holder, int position) {
        holder.mImageView.setImageResource(item2p10List.get(position).getImage());
        holder.mText.setText(item2p10List.get(position).getOffer());
    }

    @Override
    public int getItemCount() {
        return item2p10List.size();
    }

    public class Item2ViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageView;
        public TextView mText;

        public Item2ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.image_clothing_p10);
            mText = itemView.findViewById(R.id.tv_name_clothing_p10);
        }
    }
}
