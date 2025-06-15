package com.pearl.training.collectiontest;

import java.util.Objects;

public class TreeSetEmployee implements Comparable<TreeSetEmployee>{
    public TreeSetEmployee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    String id;
    String name;
    @Override
    public int compareTo(TreeSetEmployee o) {
        return this.name.compareToIgnoreCase(o.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "TreeSetEmployee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee s)) return false;
        return id.equals(s.id);
    }
}
