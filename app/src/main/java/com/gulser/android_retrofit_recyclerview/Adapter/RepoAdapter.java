package com.gulser.android_retrofit_recyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gulser.android_retrofit_recyclerview.Model.Repo;
import com.gulser.android_retrofit_recyclerview.R;

import java.util.List;

public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.ViewHolder> {
    private Context context;
    private List<Repo> repoList;

    public RepoAdapter(Context context, List<Repo> repoList) {
        this.context = context;
        this.repoList = repoList;
    }

    @NonNull
    @Override
    public RepoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.repos_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RepoAdapter.ViewHolder holder, int position) {
        holder.missionName.setText(repoList.get(position).getMissionName());
        holder.launchYear.setText(repoList.get(position).getLaunchYear());
    }

    @Override
    public int getItemCount() {
        return repoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView missionName, launchYear;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            missionName = itemView.findViewById(R.id.missionName);
            launchYear = itemView.findViewById(R.id.launchYear);
        }
    }
}
