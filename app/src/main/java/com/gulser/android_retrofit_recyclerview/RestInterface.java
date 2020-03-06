package com.gulser.android_retrofit_recyclerview;

import com.gulser.android_retrofit_recyclerview.Model.Repo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestInterface {
    @GET("v2/launches")
    Call<List<Repo>> getRepo();
}
