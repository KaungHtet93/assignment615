package com.pearl.training.collectiontest;

//import lombok.NoArgsConstructor;

//@NoArgsConstructor
public class Employee {
    String id;

    public Employee(int age, String id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    String name;
    int age;
    public Employee(String name){
        this.name=name;
    }
    public String toString(){
        return "["+id+"]"+name+"("+age+" years)";
    }
}
