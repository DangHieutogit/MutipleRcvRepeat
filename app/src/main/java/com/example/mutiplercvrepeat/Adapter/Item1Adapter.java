package com.example.mutiplercvrepeat.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mutiplercvrepeat.Model.Item1bamat;
import com.example.mutiplercvrepeat.R;

import java.util.List;

public class Item1Adapter extends RecyclerView.Adapter<Item1Adapter.Item1ViewHolder> {

    private List<Item1bamat> item1bamatList;

    public Item1Adapter(List<Item1bamat> item1bamatList){
        this.item1bamatList= item1bamatList;
    }

    @NonNull
    @Override
    public Item1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1,parent,false);
        return new Item1ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Item1ViewHolder holder, int position) {
        holder.mImageView.setImageResource(item1bamatList.get(position).getImage());
        holder.mText.setText(item1bamatList.get(position).getOffer());

    }

    @Override
    public int getItemCount() {
        return item1bamatList.size();
    }

    public class Item1ViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageView;
        private TextView mText;

        public Item1ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.item1image);
            mText = itemView.findViewById(R.id.item1Tv);
        }
    }
}
