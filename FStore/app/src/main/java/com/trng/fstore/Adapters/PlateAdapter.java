package com.trng.fstore.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.trng.fstore.Models.PlateModel;
import com.trng.fstore.R;

import java.util.List;

public class PlateAdapter extends RecyclerView.Adapter<PlateAdapter.PlateViewHolder> {

    private List<PlateModel> plateModelList;
    private Context context;

    public PlateAdapter(List<PlateModel> plateModelList, Context context) {
        this.plateModelList = plateModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public PlateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_welcome, parent, false);
        return new PlateViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlateViewHolder holder, int position) {
        PlateModel plateModel = plateModelList.get(position);

        Glide.with(context).load(plateModel.getPlate_img()).into(holder.plateImg);
    }

    @Override
    public int getItemCount() {
        return plateModelList.size();
    }

    public class PlateViewHolder extends RecyclerView.ViewHolder {

        private ImageView plateImg;

        public PlateViewHolder(@NonNull View itemView) {
            super(itemView);

            plateImg = (ImageView) itemView.findViewById(R.id.imageView2);
        }
    }
}
