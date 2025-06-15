package com.pearl.training.collectiontest;

import com.pearl.training.collections.Student;

import java.util.Objects;

public class SetEmployee {

    String id;
    String name;

    SetEmployee(String id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee s = (Employee) o;
        return id.equals(s.id); // Only ID is used to check uniqueness
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "[" + id + "] " + name;
    }

}
