package com.example.androiddevelopment.myapplication.activities;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.androiddevelopment.myapplication.R;
import com.example.androiddevelopment.myapplication.model.Movies;
import com.example.androiddevelopment.myapplication.providers.ActorProvider;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by androiddevelopment on 27.10.17..
 */

public class SecondActivity extends Activity {

    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final int position = getIntent().getIntExtra("position", 0);

        ImageView ivImage = (ImageView) findViewById(R.id.iv_actor);
        InputStream is = null;
        try {
            is = getAssets().open(ActorProvider.getActorById(position).getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        }   catch (IOException e) {
            e.printStackTrace();
        }

        TextView tvName = (TextView) findViewById(R.id.tv_name);
        tvName.setText(ActorProvider.getActorById(position).getName());

        TextView tvBiography = (TextView) findViewById(R.id.tv_biography);
        tvBiography.setText(ActorProvider.getActorById(position).getBiography());

        RatingBar rbRating = (RatingBar) findViewById(R.id.rb_rating);
        rbRating.setRating(ActorProvider.getActorById(position).getRating());

        List<Movies> movies = (List<Movies>) ActorProvider.getActorById(position).getMovies();
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, movies);
        ListView listView = (ListView) findViewById(R.id.lv_list);
        listView.setAdapter(itemsAdapter);

    }
}
