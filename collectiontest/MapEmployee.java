package com.pearl.training.collectiontest;

//import lombok.NoArgsConstructor;

//@NoArgsConstructor
public class MapEmployee {
    int id;

    public MapEmployee(int id, String name ,int age) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    String name;
    int age;
    @Override
    public String toString(){
        return "["+id+"]"+name+"("+age+" years)";
    }
}
