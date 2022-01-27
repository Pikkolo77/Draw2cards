package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView2;
    static ArrayList<cards.Card> playingCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       imageView = findViewById(R.id.imageView);
       imageView2 = findViewById(R.id.imageView2);




        cardAPI cardAPI = new cardClient().build();
        Call<cards> call = cardAPI.getCards("cards");


        Callback<cards> callback = new Callback<cards>() {

            @Override
            public void onResponse(Call<cards> call, Response<cards> response) {
                Log.d("TEST", "is this working?");
                cards res = response.body();
                Log.d("TEST",res.card.get(0).getImage());

                playingCards = res.card;
                Glide.with(MainActivity.this).load(playingCards.get(0).getImage()).apply(RequestOptions.centerCropTransform()).into(imageView);
                Glide.with(MainActivity.this).load(playingCards.get(1).getImage()).apply(RequestOptions.centerCropTransform()).into(imageView2);
                //Glide.with(holder.itemView.getContext()).load(data.get(position).image_url).apply(RequestOptions.centerCropTransform()).into(imageView);


            }

            @Override
            public void onFailure(Call<cards> call, Throwable t) {
                Log.e("Error",""+t);
            }
        };
        call.enqueue(callback);



    }
}