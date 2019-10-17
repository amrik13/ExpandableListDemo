package com.amriksinghpadam.expandablelistdemo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Model {



    public static TreeMap<String, ArrayList<String>> getListData(){

        TreeMap<String, ArrayList<String>> detailedList = new TreeMap<>();

        ArrayList<String> childList1 = new ArrayList<>();
        childList1.add("Child11");
        childList1.add("Child12");
        childList1.add("Child13");
        childList1.add("Child14");
        childList1.add("Child15");
        childList1.add("Child16");

        ArrayList<String> childList2 = new ArrayList<>();
        childList2.add("Child21");
        childList2.add("Child22");
        childList2.add("Child23");
        childList2.add("Child24");
        childList2.add("Child25");
        childList2.add("Child26");

        ArrayList<String> childList3 = new ArrayList<>();
        childList3.add("Child31");
        childList3.add("Child32");
        childList3.add("Child33");
        childList3.add("Child34");
        childList3.add("Child35");
        childList3.add("Child36");

        ArrayList<String> childList4 = new ArrayList<>();
        childList4.add("Child41");
        childList4.add("Child42");
        childList4.add("Child43");
        childList4.add("Child44");
        childList4.add("Child45");
        childList4.add("Child46");

        ArrayList<String> childList5 = new ArrayList<>();
        childList5.add("Child51");
        childList5.add("Child52");
        childList5.add("Child53");
        childList5.add("Child54");
        childList5.add("Child55");
        childList5.add("Child56");

        ArrayList<String> childList6 = new ArrayList<>();
        childList6.add("Child61");
        childList6.add("Child62");
        childList6.add("Child63");
        childList6.add("Child64");
        childList6.add("Child65");
        childList6.add("Child66");

        detailedList.put("Group1",childList1);
        detailedList.put("Group2",childList2);
        detailedList.put("Group3",childList3);
        detailedList.put("Group4",childList4);
        detailedList.put("Group5",childList5);
        detailedList.put("Group6",childList6);



        return detailedList;

    }
}
