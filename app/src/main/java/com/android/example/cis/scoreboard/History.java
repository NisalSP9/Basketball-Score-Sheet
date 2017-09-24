package com.android.example.cis.scoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class History extends AppCompatActivity {

    ListView bPoint,aPoint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        bPoint = (ListView)findViewById(R.id.bList);
        aPoint = (ListView)findViewById(R.id.aList);

        List<String> teamB = getIntent().getStringArrayListExtra("B");
        List<String> teamA = getIntent().getStringArrayListExtra("A");

        List<String> pointsB = new ArrayList<>();
        List<String> pointsA = new ArrayList<>();

        for(String point : teamB){

            Log.d("point", point);
            pointsB.add(point);



        }

        for(String point : teamA){

            Log.d("point", point);
            pointsA.add(point);



        }

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1,pointsB);

        bPoint.setAdapter(stringArrayAdapter);

        ArrayAdapter<String> stringArrayAdapter1 = new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1,pointsA);

        aPoint.setAdapter(stringArrayAdapter1);


    }
}
