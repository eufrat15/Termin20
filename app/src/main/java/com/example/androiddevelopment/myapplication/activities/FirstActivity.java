package com.example.androiddevelopment.myapplication.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androiddevelopment.myapplication.R;
import com.example.androiddevelopment.myapplication.providers.MoviesProvider;

import java.util.List;

/**
 * Created by androiddevelopment on 27.10.17..
 */

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) 	{

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onCreate()", Toast.LENGTH_SHORT);
        toast.show();

        final List<String> moviesNames = MoviesProvider.getMoviesNames();

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.list_item, moviesNames);
        ListView listView = (ListView) findViewById(R.id.lv_list);

        listView.setAdapter(dataAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }

}
