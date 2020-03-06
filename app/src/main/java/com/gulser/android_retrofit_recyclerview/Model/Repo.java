package com.gulser.android_retrofit_recyclerview.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Repo {
    @SerializedName("mission_name")
    @Expose
    public String missionName;

    @SerializedName("launch_year")
    @Expose
    public String launchYear;

    public Repo() {
    }

    public Repo(String missionName, String launchYear) {
        this.missionName = missionName;
        this.launchYear = launchYear;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(String launchYear) {
        this.launchYear = launchYear;
    }
}
