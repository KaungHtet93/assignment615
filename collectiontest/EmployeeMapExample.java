package com.pearl.training.collectiontest;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMapExample {
    public static void main(String[] args) {
        Map<String,MapEmployee> employeeMap=new HashMap<>();
        //ADD
        employeeMap.put("E1",new MapEmployee(1,"Jack",22));
        employeeMap.put("E2",new MapEmployee(2,"Lack",23));
        employeeMap.put("E3",new MapEmployee(3,"Mack",21));
        employeeMap.put("E4",new MapEmployee(4,"Zack",27));

        employeeMap.put("E1",new MapEmployee(1,"Panama",24));
        System.out.println("E1 value:"+employeeMap.get("E1"));
        System.out.println("Contains E5?:"+employeeMap.containsKey("E5"));
//employeeMap.remove("E3");
        for(Map.Entry<String,MapEmployee> a : employeeMap.entrySet()){
            System.out.println(a.getKey() + " -> " + a.getValue());
        }
        System.out.println(">22:"+employeeMap.values().stream().filter(s->s.age>23).toList());
        System.out.println(">22:");
        employeeMap.values().stream().filter(s->s.age>23).forEach(System.out::println);
    }
}
