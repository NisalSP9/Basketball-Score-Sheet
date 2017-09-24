package com.android.example.cis.scoreboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int teamBPoint;
    int teamAPoint;

    TextView pointsViewB, pointsViewA;

    List<String> teamBPointList;
    List<String> teamAPointList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pointsViewB = (TextView) findViewById(R.id.bPoint);
        pointsViewA = (TextView) findViewById(R.id.aPoint);

        teamBPointList = new ArrayList<>();
        teamAPointList = new ArrayList<>();

    }

    public void resetContent(View view) {

        pointsViewA.setText("0");
        pointsViewB.setText("0");
        teamAPoint = 0;
        teamBPoint = 0;
        teamBPointList = new ArrayList<>();
        teamAPointList = new ArrayList<>();

    }

    public void oneForTeamB(View view) {


        teamBPoint += 1;

        teamBPointList.add("1");
        pointsViewB.setText(teamBPoint + "");



    }

    public void oneForTeamA(View view) {


        teamAPoint += 1;
        teamAPointList.add("1");
        pointsViewA.setText(teamAPoint + "");


    }

    public void twoForTeamB(View view) {


        teamBPoint += 2;
        teamBPointList.add("2");

        pointsViewB.setText(teamBPoint + "");



    }

    public void twoForTeamA(View view) {


        teamAPoint += 2;
        teamAPointList.add("2");
        pointsViewA.setText(teamAPoint + "");



    }

    public void threeForTeamB(View view) {


        teamBPoint += 3;
        teamBPointList.add("3");

        pointsViewB.setText(teamBPoint + "");



    }

    public void threeForTeamA(View view) {


        teamAPoint += 3;
        teamAPointList.add("3");
        pointsViewA.setText(teamAPoint + "");


    }

    public void contentHistory(View view){

        Intent intent = new Intent(this,History.class);

        intent.putStringArrayListExtra("B",(ArrayList<String>)teamBPointList);
        intent.putStringArrayListExtra("A",(ArrayList<String>)teamAPointList);
        startActivity(intent);





    }
}
