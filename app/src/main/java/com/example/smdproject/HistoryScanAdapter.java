package com.example.smdproject;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HistoryScanAdapter extends RecyclerView.Adapter<HistoryScanAdapter.ViewHolder> {

    private List<HistoryScanItem> historyScanItemList;

    public HistoryScanAdapter(List<HistoryScanItem> historyScanItemList) {
        this.historyScanItemList = historyScanItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_history_scan, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HistoryScanItem item = historyScanItemList.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return historyScanItemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewDate, textViewCarName, textViewPlateNumber, textViewOwnerName;
        ImageView imageViewCar, imageViewOwner;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewDate = itemView.findViewById(R.id.textViewDate);
            textViewCarName = itemView.findViewById(R.id.textViewCarName);
            textViewPlateNumber = itemView.findViewById(R.id.textViewPlateNumber);
            textViewOwnerName = itemView.findViewById(R.id.textViewOwnerName);
            imageViewCar = itemView.findViewById(R.id.imageViewCar);
            imageViewOwner = itemView.findViewById(R.id.imageViewOwner);
        }

        public void bind(HistoryScanItem item) {
            textViewDate.setText(item.getDate());
            textViewCarName.setText(item.getCarName());
            textViewPlateNumber.setText(item.getPlateNumber());
            textViewOwnerName.setText(item.getOwnerName());
            imageViewCar.setImageResource(item.getImageResId());
            imageViewOwner.setImageResource(item.getOwnerImageResId());
        }
    }

}
