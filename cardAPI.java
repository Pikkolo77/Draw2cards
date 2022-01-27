package com.example.myapplication;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface cardAPI {


   @GET("api/deck/new/draw/?count=2")
    Call<cards> getCards(@Query("cards") String cards);
}
