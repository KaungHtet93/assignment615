package assignment;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalDouble;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public Map<String, Integer> getSubjectMarks() {
        return subjectMarks;
    }
    String id;
    String name;
    Map<String,Integer> subjectMarks;
    public Student( String id,String name, Map<String, Integer> subjectMarks) {
        this.name = name;
        this.id = id;
        this.subjectMarks = subjectMarks;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjectMarks=" + subjectMarks +
                '}';
    }
    public int getTotalMarks(){
        return this.subjectMarks.values().stream().mapToInt(Integer::intValue).sum();
    }
    public OptionalDouble getAverageMarks(){
        return this.subjectMarks.values().stream().mapToInt(Integer::intValue).average();
    }
}
