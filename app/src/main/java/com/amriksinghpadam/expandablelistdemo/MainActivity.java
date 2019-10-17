package com.amriksinghpadam.expandablelistdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private TreeMap<String, ArrayList<String>> groupList = new TreeMap<>();
    ArrayList<String> headingList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView = findViewById(R.id.expandable_list_id);

        groupList = Model.getListData();
        headingList = new ArrayList<>(groupList.keySet());
        for(String s : headingList) {
            Log.d("TAG", s);
        }
        ExpandableAdapter adapter = new ExpandableAdapter(this,headingList,groupList);
        expandableListView.setAdapter(adapter);

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {
                Toast.makeText(MainActivity.this,headingList.get(i)+" Expanded",Toast.LENGTH_SHORT).show();

            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int i) {
                Toast.makeText(MainActivity.this,headingList.get(i)+" Collapsed",Toast.LENGTH_SHORT).show();

            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
                Toast.makeText(MainActivity.this,headingList.get(i)+" => "+groupList.get(headingList.get(i)).get(i1),Toast.LENGTH_SHORT).show();

                return false;
            }
        });

    }
}
