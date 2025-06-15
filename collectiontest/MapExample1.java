package com.pearl.training.collectiontest;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {

        Map<String,String> EmployeeMap=new HashMap<>();//FROM STRING(INPUT) TO STRING (Store)

        EmployeeMap.put("X01","Punk");
        EmployeeMap.put("X02","Tank");
        EmployeeMap.put("X03","Sack");
        EmployeeMap.put("X04","Funk");
        EmployeeMap.put("X05","Punk");
        EmployeeMap.put("X06","Chick");
        System.out.println(EmployeeMap);
        EmployeeMap.remove("X03");
        if(EmployeeMap.containsValue("Crunk")){
            System.out.println("Hello Crunk");
        }if(EmployeeMap.containsValue("Punk")){
            System.out.println("Hello Punk");
        }if(EmployeeMap.containsKey("X03")){
            System.out.println("Welcome:"+EmployeeMap.get("X03"));
        }
        EmployeeMap.put("X02","Musk");
        System.out.println(EmployeeMap.get("X02"));
        System.out.println(EmployeeMap);
        EmployeeMap.forEach((id,empName)->System.out.println(id+" "+empName));
        for(Map.Entry<String,String> entry : EmployeeMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
