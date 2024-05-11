package com.example.smdproject;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends Fragment {

    public HistoryFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("HistoryFragment", "onCreateView() called");
        View view = inflater.inflate(R.layout.fragment_history, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewHistoryScan);

        List<HistoryScanItem> historyScanItemList = createDummyData();


        for (HistoryScanItem item : historyScanItemList) {
            Log.d("HistoryFragment", "HistoryScanItem: " + item.getDate() + ", " + item.getCarName() + ", " + item.getPlateNumber() + ", " + item.getOwnerName());
        }

        HistoryScanAdapter adapter = new HistoryScanAdapter(historyScanItemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }



    private List<HistoryScanItem> createDummyData() {
        List<HistoryScanItem> dummyData = new ArrayList<>();

        dummyData.add(new HistoryScanItem("12-01-2021", "Car1", "LEB 5700", "Owner1", R.drawable.carplate, R.drawable.owner));
        dummyData.add(new HistoryScanItem("13-01-2021", "Car2", "LEB 5701", "Owner2", R.drawable.carplate, R.drawable.owner));

        return dummyData;
    }
}
