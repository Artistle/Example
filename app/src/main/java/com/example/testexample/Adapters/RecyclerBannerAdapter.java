package com.example.testexample.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testexample.Models.BanerModel;
import com.example.testexample.R;
import com.example.testexample.Retrofit.RetrofitDI;

import java.util.ArrayList;

import javax.inject.Inject;

public class RecyclerBannerAdapter extends RecyclerView.Adapter<RecyclerBannerAdapter.ViewHolder> {

    private ArrayList<BanerModel> banerModels;

    public RecyclerBannerAdapter(ArrayList<BanerModel> banerModels) {
        this.banerModels = banerModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.banner_cv_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        BanerModel banerModel = banerModels.get(i);
    }

    @Override
    public int getItemCount() {
        return banerModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private TextView desc;
        private ImageView img_banner;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_banner = (ImageView)itemView.findViewById(R.id.image_banner);
        }
    }
}
