package com.amriksinghpadam.expandablelistdemo;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.TreeMap;

public class ExpandableAdapter extends BaseExpandableListAdapter {

    TextView childText,headingText;
    Context context;
    ArrayList<String> heading = new ArrayList<>();
    TreeMap<String,ArrayList<String>> group = new TreeMap<>();
    public ExpandableAdapter(Context context, ArrayList<String> heading, TreeMap<String, ArrayList<String>> group){
        this.context = context;
        this.heading = heading;
        this.group = group;
    }

    @Override
    public int getGroupCount() {
        Log.d("Tag1","Inside GetGroupCount == "+heading.size());
        return heading.size();
    }

    @Override
    public int getChildrenCount(int i) {
        Log.d("Tag1","Inside GetChildrenCount == "+group.get(heading.get(i)).size());
        return group.get(heading.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        Log.d("Tag1","Inside GetGroup == "+heading.get(i));
        return heading.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        Log.d("Tag1","Inside GetChild == "+group.get(heading.get(i)).get(i1));
        return group.get(heading.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String heading = (String) getGroup(i);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.list_group,null);
        headingText = view.findViewById(R.id.list_group_id);
        headingText.setTypeface(null, Typeface.BOLD);
        Log.d("Tag1","Inside GetGroupView == "+heading);
        headingText.setText(heading);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        String child = (String) getChild(i,i1);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.child_list,null);
        childText = view.findViewById(R.id.list_child_id);
        Log.d("Tag1","Inside GetChildView == "+child);
        childText.setText(child);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
