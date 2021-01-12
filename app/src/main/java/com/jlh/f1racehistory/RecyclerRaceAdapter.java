package com.jlh.f1racehistory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerRaceAdapter extends RecyclerView.Adapter<RecyclerRaceAdapter.ViewHolder> {
    private  String[] names = {"Austrialian Grand Prix", "Malaysian Grand Prix"};

    private List<Races> racesList;
    private List<Races> racesListByYear;

    public void setRacesList(List<Races> races) {
        racesList = races;
        notifyDataSetChanged();
    }
    public void setRacesListByYear(List<Races> races) {
        racesListByYear = races;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.racelist_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemName.setText(racesListByYear.get(position).getName());
        holder.itemRaceNumber.setText(String.valueOf(position + 1));
        // holder.itemCircuit.setText(racesListByYear.get(position).getCircuit());
    }

    @Override
    public int getItemCount() {
        if (racesListByYear != null) {
            return racesListByYear.size();
        } else {
            return  0;
        }
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemName;
        TextView itemRaceNumber;
        TextView itemCircuit;
        TextView itemLocation;

        ViewHolder(View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.racelist_name);
            itemRaceNumber = itemView.findViewById(R.id.racelist_racenumber);
            itemCircuit = itemView.findViewById(R.id.racelist_circuit);
            itemLocation = itemView.findViewById(R.id.racelist_location);
        }
    }

}
